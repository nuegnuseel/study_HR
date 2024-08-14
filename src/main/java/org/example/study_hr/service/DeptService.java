package org.example.study_hr.service;

import lombok.RequiredArgsConstructor;
import org.example.study_hr.dao.ShareDAO;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class DeptService {
    private final ShareDAO shareDAO;

    public void insertDept(Map param) {
        shareDAO.insert("insertDept", param);
    }
}
