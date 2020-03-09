package com.example.Employee_Crud.service;

import java.util.List;

import com.example.Employee_Crud.entity.Employee;
import com.example.Employee_Crud.exception.EmployeeException;

public interface IEmployeeService {




	public Employee addEmployee(Employee employee) throws EmployeeException;

	public Employee getEmployee(int empid) throws EmployeeException;

	public List<Employee> getAllEmployees();

	public Employee updateEmployee(Employee employee) throws EmployeeException;

	public boolean deleteEmployee(int empId) throws EmployeeException;



}
