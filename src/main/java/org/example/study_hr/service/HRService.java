package org.example.study_hr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HRService {

    private final DeptService deptService;
    private final EmployeeAttendanceService empAttService;
    private final EmployeeService empService;
    private final WorkStatusService wsService;

}
