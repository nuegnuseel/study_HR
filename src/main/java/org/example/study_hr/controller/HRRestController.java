package org.example.study_hr.controller;

import lombok.RequiredArgsConstructor;
import org.example.study_hr.service.HRService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HRRestController {

    private final HRService hrService;


}
