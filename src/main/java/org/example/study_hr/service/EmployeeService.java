package org.example.study_hr.service;

import lombok.RequiredArgsConstructor;
import org.example.study_hr.dao.ShareDAO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final ShareDAO shareDAO;
}
