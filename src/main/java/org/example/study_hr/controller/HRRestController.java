package org.example.study_hr.controller;

import lombok.RequiredArgsConstructor;
import org.example.study_hr.service.HRService;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api") // API 엔드포인트를 지정
public class HRRestController {

    private final HRService hrService;


    @PostMapping("/insertDept")
    public String insertDept(@RequestParam String deptId, @RequestParam String deptName) {
        // 전달받은 파라미터를 이용해 Map 객체를 생성합니다.
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("DEPT_PK_ID", deptId);
        paramMap.put("DEPT_NAME", deptName);

        // 서비스 클래스의 메서드를 호출하여 데이터베이스에 삽입합니다.
        hrService.insertDept(paramMap);


        return "insert";
    }

    @PostMapping("/insertEAS")
    public String insertEAS(
            @RequestParam String workAttPkId,
            @RequestParam String employeeFkId,
            @RequestParam String workStatFkId,
            @RequestParam String date) {

        // 전달받은 파라미터를 이용해 Map 객체를 생성합니다.
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("WORK_ATT_PK_ID", workAttPkId);
        paramMap.put("EMPLOYEE_FK_ID", employeeFkId);
        paramMap.put("WORK_STAT_FK_ID", workStatFkId);
        paramMap.put("DATE", date);

        // 서비스 클래스의 메서드를 호출하여 데이터베이스에 삽입합니다.
        hrService.insertEAS(paramMap);

        return "insert";
    }

    @PostMapping("/insertEmp")
    public String insertEmp(
            @RequestParam String employeePkId,
            @RequestParam String member,
            @RequestParam String deptFkId) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("EMPLOYEE_PK_ID", employeePkId);
        paramMap.put("MEMBER", member);
        paramMap.put("DEPT_FK_ID", deptFkId);

        hrService.insertEmp(paramMap);
        return "insert";

    }
    @PostMapping("/insertWork")
    public String insertWork(
            @RequestParam String workStatPkId,
            @RequestParam String status) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("WORK_STAT_PK_ID", workStatPkId);
        paramMap.put("STATUS", status);

        hrService.insertWork(paramMap);
        return "insert";

    }


}














