package com.monirtanveen.springboot.springbootcrudingwithmysql.repository;

import com.monirtanveen.springboot.springbootcrudingwithmysql.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
