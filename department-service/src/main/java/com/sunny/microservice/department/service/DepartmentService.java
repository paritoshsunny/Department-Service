package com.sunny.microservice.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunny.microservice.department.entity.Department;
import com.sunny.microservice.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public Optional<Department> getDepartmentById(Long id) {
		return departmentRepository.findById(id);
	}
	

}
