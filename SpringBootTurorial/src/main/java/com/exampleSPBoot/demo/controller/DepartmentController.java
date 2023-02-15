package com.exampleSPBoot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exampleSPBoot.demo.entity.Department;
import com.exampleSPBoot.demo.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService deprtService;

	@PostMapping("/department")
	public Department saveDepartment(@RequestBody Department department) {
		return deprtService.saveDepartment(department);
	}

	@GetMapping("/department")
	public List<Department> fetchDepartmentsList() {
		return deprtService.fetchDepartmentsList();
	}
	
	@GetMapping("/department/{id}")
	public Department fetchDepartmentByID(@PathVariable("id") Long DepartmentId) {
		return deprtService.fetchDepartmentByID(DepartmentId);
		
	}
	
//	@GetMapping("/department/{add}")
//	public Department fetchDepartmentByAddress(@PathVariable("add") String departmentAddress) {
//		return deprtService.fetchDepartmentByAddress(departmentAddress);
//	}
}
