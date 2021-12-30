package com.vkakarla.grouph.service;

import java.util.List;

import com.vkakarla.grouph.documents.Employee;

public interface IEmployeeService {

	  public void saveEmployee(Employee employee);
	  public List<Employee> getAllEmployees();
	  public void updateEmployee(Employee employee);
	  public void deleteEmployee(String employeeId);
	
}
