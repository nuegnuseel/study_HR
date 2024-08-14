package org.example.study_hr.service;

import lombok.RequiredArgsConstructor;
import org.example.study_hr.dao.ShareDAO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final ShareDAO shareDAO;

    public void insertEmp(Map<String, Object> param) {
        shareDAO.insert("Employee.insertEmp", param);
    }
}
