package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mvc.dto.Employee;
import mvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@RequestMapping("loademployee")
	public ModelAndView loadEmployee() {
		return service.loadEmployee();
	}

	@PostMapping("saveemployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee emp, @RequestParam String date) {
		return service.saveEmployee(emp, date);
	}

}
