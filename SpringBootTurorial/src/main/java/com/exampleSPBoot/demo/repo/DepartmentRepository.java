package com.exampleSPBoot.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exampleSPBoot.demo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
