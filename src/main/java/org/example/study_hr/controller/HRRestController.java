package org.example.study_hr.controller;

import lombok.RequiredArgsConstructor;
import org.example.study_hr.service.HRService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/insert") // API 엔드포인트를 지정
public class HRRestController {

    private final HRService hrService;

    @GetMapping("/data")
    public List<String> getData() {
        // 여기에서 데이터를 JSON 형태로 반환합니다.
        return Arrays.asList("2022", "2021", "tttt");
    }
}
