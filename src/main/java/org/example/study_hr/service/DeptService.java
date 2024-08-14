package org.example.study_hr.service;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class DeptService {
    private final SqlSessionTemplate sqlSessionTemplate;

    public void insertDept(Map param) {
        sqlSessionTemplate.insert("insertDept",param);
    }
}
