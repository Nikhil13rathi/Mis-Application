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
	private String nameString;
	private String departmentAddress;
	private String departmentCode;

	public Department() {
		super();
	}

	public Department(long departmentId, String nameString, String address, String departmentCode) {
		super();
		DepartmentId = departmentId;
		this.nameString = nameString;
		this.departmentAddress = address;
		this.departmentCode = departmentCode;
	}

	public long getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(long departmentId) {
		DepartmentId = departmentId;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getAddress() {
		return departmentAddress;
	}

	public void setAddress(String address) {
		departmentAddress = address;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	@Override
	public String toString() {
		return "Department [DepartmentId=" + DepartmentId + ", nameString=" + nameString + ", departmentAddress="
				+ departmentAddress + ", departmentCode=" + departmentCode + "]";
	}

	
	

}
