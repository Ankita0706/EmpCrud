package com.example.Employee_Crud.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.annotations.Persister;
import org.springframework.stereotype.Repository;

import com.example.Employee_Crud.entity.Employee;
import com.example.Employee_Crud.exception.EmployeeException;


@Repository
public class EmployeeDaoImpl implements IEmployeeDao{
	
	
	@PersistenceContext
	EntityManager em;

	@Override
	public Employee addEmployee(Employee employee) throws EmployeeException {
		
		em.persist(employee);
		
		return employee;
	}

	@Override
	public Employee getEmployee(int empid) throws EmployeeException {
		
		Employee emp=em.find(Employee.class, empid);
		if(emp==null)
		{
			throw new EmployeeException("Employee does not exist!");
		}
		
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees(){
		
		TypedQuery<Employee> query=em.createQuery("select emp from Employee emp", Employee.class);
		List<Employee> employeeList=query.getResultList();
		return employeeList;
				
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		
		
		em.merge(employee);
		
		return employee;
	}

	@Override
	public boolean deleteEmployee(int empId) throws EmployeeException {
		
		Employee emp=em.find(Employee.class, empId);
		if(emp!=null)
		{
			em.remove(emp);
			return true;
		}
		else
		{
			throw new EmployeeException("Record not found");
		}
		
		
	}
	

	
}
