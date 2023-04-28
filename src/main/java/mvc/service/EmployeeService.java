package mvc.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import mvc.dao.EmployeeDao;
import mvc.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	Employee employee;

	@Autowired
	EmployeeDao dao;

	public ModelAndView loadEmployee() {
		ModelAndView andView = new ModelAndView("Insert");
		andView.addObject("emp", employee);
		return andView;
	}

	public ModelAndView saveEmployee(Employee emp, String date) {
		emp.setDoj(Date.valueOf(date));
		dao.save(emp);

		ModelAndView andView = new ModelAndView("index");
		andView.addObject("msg", "Data Added Successfully");
		return andView;
	}

	public ModelAndView fetch() {
		ModelAndView andView = new ModelAndView();
		List<Employee> list=dao.fetch();
		if(list.isEmpty())
		{
		andView.addObject("msg", "Data Not Found");
		andView.setViewName("index");	
		}
		else
		{
		andView.addObject("list", list);
		andView.setViewName("Result");
		}
		return andView;
	}

	public ModelAndView delete(int id) {
		ModelAndView andView=new ModelAndView("Result.jsp");
		dao.delete(id);
		List<Employee> list=dao.fetch();
		if(list.isEmpty())
		{
		andView.addObject("msg", "Data Not Found");
		andView.setViewName("index");	
		}
		else
		{
		andView.addObject("list", list);
		andView.addObject("msg", "Data deleted successfully");    
		}
		return andView;
	}

	public ModelAndView editEmployee(int id) {
		ModelAndView andView=new ModelAndView("Edit");
		andView.addObject("emp", dao.find(id));
		return andView;
	}

	public ModelAndView updateEmployee(Employee emp, String date) {
		emp.setDoj(Date.valueOf(date));
		dao.update(emp);

		ModelAndView andView = new ModelAndView("Result");
		andView.addObject("list", dao.fetch());
		andView.addObject("msg", "Data updated successfully"); 
		return andView;
	}
	
	
}
