package org.example.study_hr.service;


import lombok.RequiredArgsConstructor;
import org.example.study_hr.dao.ShareDAO;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmployeeAttendanceService {
    private final ShareDAO shareDAO;
    public Object searchEmployeeAttendance(Map param) {
        //param key : searchWord(검색어)[name,status,date] , searchStr(검색내용)
        return shareDAO.getList("searchEmployeeAttendance", param);
    }

    public void insertEAS(Map<String, Object> paramMap) {
        shareDAO.insert("insertEAS", paramMap);
    }
}
