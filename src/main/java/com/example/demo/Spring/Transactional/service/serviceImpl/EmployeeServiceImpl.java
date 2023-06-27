package com.example.demo.Spring.Transactional.service.serviceImpl;

import com.example.demo.Spring.Transactional.entity.Department;
import com.example.demo.Spring.Transactional.entity.Employee;
import com.example.demo.Spring.Transactional.repository.DepartmentRepository;
import com.example.demo.Spring.Transactional.repository.EmployeeRepository;
import com.example.demo.Spring.Transactional.service.EmployeeService;
import com.example.demo.Spring.Transactional.vo.EmployeeRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public String saveEmployee(EmployeeRequestVo employeeRequestVo) {
        Department department = new Department();
        department.setDepartmentName(employeeRequestVo.getDepartmentName());
        department.setDepartmentCode(employeeRequestVo.getDepartmentName());

        Long deparmentId = departmentRepository.save(department).getDepartmentId();

        Employee employee = new Employee();
        //test for transaction
        //Employee employee = null;
        employee.setEmployeeName(employeeRequestVo.getEmpName());
        employee.setEmail(employeeRequestVo.getEmail());
        employee.setDepartmentId(deparmentId);
        employeeRepository.save(employee);
        return "Employee is saved with Employee ID "+ employee.getEmployeeId();
    }
}
