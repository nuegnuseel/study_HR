package org.example.study_hr.service;


import lombok.RequiredArgsConstructor;
import org.example.study_hr.dao.ShareDAO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmployeeAttendanceService {
    private final ShareDAO shareDAO;

    public void insertEAS(Map<String, Object> paramMap) {
        shareDAO.insert("insertEAS", paramMap);
    }
}

