package com.monirtanveen.springboot.springbootcrudingwithmysql.service;

import com.monirtanveen.springboot.springbootcrudingwithmysql.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department updateDepartment(Department department, Long departmentId);

    void deleteDepartmentById(Long departmentId);
}
