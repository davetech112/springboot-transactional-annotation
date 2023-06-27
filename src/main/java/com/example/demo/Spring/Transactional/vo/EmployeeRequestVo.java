package com.example.demo.Spring.Transactional.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestVo {
    private String empName;
    private String email;
    private String departmentName;
}
