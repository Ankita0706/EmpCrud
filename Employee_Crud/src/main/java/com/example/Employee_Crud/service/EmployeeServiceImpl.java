package com.example.Employee_Crud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee_Crud.entity.Employee;
import com.example.Employee_Crud.exception.EmployeeException;
import com.example.Employee_Crud.repository.IEmployeeDao;


@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService{
	
	
	@Autowired
	IEmployeeDao dao;

	@Override
	public Employee addEmployee(Employee employee) throws EmployeeException {
		return dao.addEmployee(employee);
	}

	@Override
	public Employee getEmployee(int empid) throws EmployeeException{
		return dao.getEmployee(empid);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		return dao.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int empId) throws EmployeeException {
		return dao.deleteEmployee(empId);
	}

	

}
