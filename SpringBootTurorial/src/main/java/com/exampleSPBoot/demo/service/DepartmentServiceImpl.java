package com.exampleSPBoot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleSPBoot.demo.entity.Department;
import com.exampleSPBoot.demo.repo.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentsList() {
		
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentByID(Long DepartmentId) {
		return departmentRepository.findById(DepartmentId).get();
	}

	@Override
	public Department fetchDepartmentByAddress(String departmentAddress) {
		
		return null;
	}
	
	
}
