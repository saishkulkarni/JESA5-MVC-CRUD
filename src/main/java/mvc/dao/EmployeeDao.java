package mvc.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mvc.dto.Employee;

@Component
public class EmployeeDao {

	@Autowired
	EntityManager manager;
	
	public void save(Employee employee)
	{
		manager.getTransaction().begin();
		manager.persist(employee);
		manager.getTransaction().commit();
	}
}
