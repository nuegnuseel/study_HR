package org.example.study_hr.controller;

import lombok.RequiredArgsConstructor;
import org.example.study_hr.service.HRService;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class HRPageController {

    private final HRService hrService;

}
