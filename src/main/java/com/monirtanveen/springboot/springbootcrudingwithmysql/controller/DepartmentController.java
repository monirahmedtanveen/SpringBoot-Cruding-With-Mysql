package com.monirtanveen.springboot.springbootcrudingwithmysql.controller;

import com.monirtanveen.springboot.springbootcrudingwithmysql.entity.Department;
import com.monirtanveen.springboot.springbootcrudingwithmysql.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }

    @PostMapping("departments")
    public Department saveDepartment(@Validated @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @PutMapping("departments/{id}")
    public Department updateDepartment(@RequestBody Department department, @PathVariable Long id) {
        return departmentService.updateDepartment(department, id);
    }

    @DeleteMapping("departments/{id}")
    public void deleteDepartmentById(@PathVariable Long id) {
        departmentService.deleteDepartmentById(id);
    }
}
