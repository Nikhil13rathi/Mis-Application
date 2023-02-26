package com.exampleSPBoot.demo.entity;

import javax.management.loading.PrivateClassLoader;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long DepartmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
	
	public Department() {
		super();
	}


	public Department(long departmentId, String departmentName, String departmentAddress, String departmentCode) {
		super();
		DepartmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}


	public long getDepartmentId() {
		return DepartmentId;
	}


	public void setDepartmentId(long departmentId) {
		DepartmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getDepartmentAddress() {
		return departmentAddress;
	}


	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}


	public String getDepartmentCode() {
		return departmentCode;
	}


	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}


	@Override
	public String toString() {
		return "Department [DepartmentId=" + DepartmentId + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
	}

	

	
	

}
