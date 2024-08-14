package org.example.study_hr.service;


import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmployeeAttendanceService {
    private final SqlSessionTemplate sqlSessionTemplate;

    public void insertEAS(Map<String, Object> paramMap) {
        sqlSessionTemplate.insert("insertEAS", paramMap);
    }
}

