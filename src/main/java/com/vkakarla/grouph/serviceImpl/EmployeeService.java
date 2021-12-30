package com.vkakarla.grouph.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkakarla.grouph.documents.Employee;
import com.vkakarla.grouph.repo.EmployeeRepository;
import com.vkakarla.grouph.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {

		employeeRepository.save(employee);

	}

	@Override
	public void updateEmployee(Employee employee) {

		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> empList = null;
		empList = employeeRepository.findAll();
		return empList;
	}

	@Override
	public void deleteEmployee(String employeeId) {
		employeeRepository.deleteById(employeeId);
	}

}
