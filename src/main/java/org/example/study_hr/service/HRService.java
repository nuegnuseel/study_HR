package org.example.study_hr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class HRService {

    private final DeptService deptService;
    private final EmployeeAttendanceService empAttService;
    private final EmployeeService empService;
    private final WorkStatusService wsService;

    public void insertDept(Map<String, Object> paramMap) {
        deptService.insertDept(paramMap);
    }

    public void insertEAS(Map<String, Object> paramMap) {
        empAttService.insertEAS(paramMap);
    }

    public void insertEmp(Map<String, Object> paramMap) {
        empService.insertEmp(paramMap);
    }

    public void insertWork(Map<String, Object> paramMap) {
        wsService.insertWork(paramMap);
    }
}
