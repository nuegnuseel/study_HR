package org.example.study_hr.service;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final SqlSessionTemplate sqlSessionTemplate;

    public void insertEmp(Map<String, Object> param) {
        sqlSessionTemplate.insert("Employee.insertEmp", param);
    }
}
