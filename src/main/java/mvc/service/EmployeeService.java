package mvc.service;

import java.sql.Date;

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
		ModelAndView andView = new ModelAndView("Insert.jsp");
		andView.addObject("emp", employee);
		return andView;
	}

	public ModelAndView saveEmployee(Employee emp, String date) {
		emp.setDoj(Date.valueOf(date));
		dao.save(emp);

		ModelAndView andView = new ModelAndView("index.jsp");
		andView.addObject("msg", "Data Added Successfully");
		return andView;
	}

}
