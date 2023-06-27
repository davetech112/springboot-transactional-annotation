package com.example.demo.Spring.Transactional.repository;

import com.example.demo.Spring.Transactional.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
