package com.example.demo.Spring.Transactional.service;

import com.example.demo.Spring.Transactional.service.serviceImpl.EmployeeServiceImpl;
import com.example.demo.Spring.Transactional.vo.EmployeeRequestVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface EmployeeService {
    @Transactional
    String saveEmployee(EmployeeRequestVo employeeRequestVo);
}
