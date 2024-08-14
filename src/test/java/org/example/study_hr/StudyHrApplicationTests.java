package org.example.study_hr;

import org.example.study_hr.service.DeptService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class StudyHrApplicationTests {

    @Autowired
    DeptService deptService;

    @Test
    void contextLoads() {
    }
    @Test
    void insertDept() {
        Map<String,String> map = new HashMap<>();
        map.put("DEPT_PK_ID", "DEPT_03");
        map.put("DEPT_NAME", "법무");
        deptService.insertDept(map);
    }

    @Test
    void workStatus() {
        Map<String,String> map = new HashMap<>();
        map.put("", "");
    }
}
