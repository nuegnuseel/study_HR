package org.example.study_hr.controller;

import lombok.RequiredArgsConstructor;
import org.example.study_hr.service.HRService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HRPageController {

    private final HRService hrService;

    @GetMapping("/insertData")
    public String insertData(Model model) {
        model.addAttribute("message", "확인합니다.");
        return "insert02";
    }

    @GetMapping("/search")
    public String search(Model model) {
        return "/hr/search.html";
    }
}
