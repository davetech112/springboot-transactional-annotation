package com.example.demo.Spring.Transactional.repository;

import com.example.demo.Spring.Transactional.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
