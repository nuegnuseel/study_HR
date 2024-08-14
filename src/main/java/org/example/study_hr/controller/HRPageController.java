package org.example.study_hr.controller;

import lombok.RequiredArgsConstructor;
import org.example.study_hr.service.HRService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HRPageController {

    private final HRService hrService;

    @GetMapping("/insertData")
    public String insertData(Model model) {
        model.addAttribute("message","확인합니다.");
        return "insert02";
    }

	@GetMapping("/search")
	public String search() {
		return "search.html";
	}

	@GetMapping("/insert")
	public String insert() {
		return "insert.html";
	}

	@GetMapping("/")
	public String home() {
		return "home.html";
	}

}
