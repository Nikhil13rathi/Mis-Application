package com.exampleSPBoot.demo.service;

import java.util.List;

import com.exampleSPBoot.demo.entity.Department;


public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentsList();

	public Department fetchDepartmentByID(Long DepartmentId);

	public Department fetchDepartmentByAddress(String departmentAddress);

}
