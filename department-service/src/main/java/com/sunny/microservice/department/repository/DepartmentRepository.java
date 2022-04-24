package com.sunny.microservice.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunny.microservice.department.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
