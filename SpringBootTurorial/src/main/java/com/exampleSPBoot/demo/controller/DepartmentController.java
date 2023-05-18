package com.exampleSPBoot.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exampleSPBoot.demo.entity.Department;
import com.exampleSPBoot.demo.service.DepartmentService;

import javax.validation.Valid;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService deprtService;

    //	@PostMapping("/department")
//	public Department saveDepartment(@RequestBody Department department) {
//		return deprtService.saveDepartment(department);
//	}
    @PostMapping("/department")
    public ResponseEntity<Map<String, Object>> saveDepartment(@Valid @RequestBody Department department) {
        try {
            Department emp = deprtService.saveDepartment(department);
            Map<String, Object> response = new HashMap<>();
            System.out.println("Success");
            response.put("Success", emp);
            return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.CREATED);
        } catch (Exception e) {
            Map<String, Object> failResponse = new HashMap<>();
            System.out.println("error creating");
            failResponse.put("Exception", "Error while creating the department: " + e.getMessage());
            return new ResponseEntity<>(failResponse, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/department")
    public List<Department> fetchDepartmentsList() {
        return deprtService.fetchDepartmentsList();
    }

    //    @GetMapping("/department/{id}")
//    public Department fetchDepartmentByID(@PathVariable("id") Long DepartmentId) {
//        return deprtService.fetchDepartmentByID(DepartmentId);
//
//    }
    @GetMapping("/department/{id}")
    public ResponseEntity<Map<String, Object>> fetchDepartmentByID(@PathVariable("id") Long DepartmentId) {
        /**/
//        return deprtService.fetchDepartmentByID(DepartmentId);
        try {
            Department emp = deprtService.fetchDepartmentByID(DepartmentId);
            Map<String, Object> response = new HashMap<>();
            System.out.println("Success created department id");
            response.put("Success", emp);
            return new ResponseEntity<>(response, new HttpHeaders(), HttpStatus.CREATED);
        } catch (Exception e) {
            Map<String, Object> failResponse = new HashMap<>();
            System.out.println("error creating");
            failResponse.put("Exception", "Error while creating the department: " + e.getMessage());
            return new ResponseEntity<>(failResponse, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long DepartmentId) {
        deprtService.deleteDepartmentById(DepartmentId);

        return "Record deleted successFully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
        return deprtService.updateDepartment(departmentId, department);
    }

//	@GetMapping("/departments/name/{name}")
//	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
//		return deprtService.fetchDepartmentByName(departmentName);
//	}

//	@GetMapping("/department/{add}")
//	public Department fetchDepartmentByAddress(@PathVariable("add") String departmentAddress) {
//		return deprtService.fetchDepartmentByAddress(departmentAddress);
//	}
}
