package org.example.study_hr.controller;

import lombok.RequiredArgsConstructor;
import org.example.study_hr.service.EmployeeAttendanceService;
import org.example.study_hr.service.HRService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class HRRestController {

    private final EmployeeAttendanceService eas;
    private final HRService hrService;

    @GetMapping("/search")
    public ArrayList<Map<String,String>> searchEmployeeAttendance(@RequestParam String searchWord,
                                              @RequestParam String searchStr) {
        HashMap<String,String> param = new HashMap<>();
        param.put("searchWord", searchWord);
        param.put("searchStr", searchStr);
        ArrayList<Map<String,String>> result = (ArrayList<Map<String,String>>) eas.searchEmployeeAttendance(param);
        return result;
    }
}
