package com.vkakarla.grouph.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vkakarla.grouph.documents.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
      
	
}
