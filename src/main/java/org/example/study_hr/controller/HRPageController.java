package org.example.study_hr.controller;

import org.example.study_hr.service.HRService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HRPageController {

	private final HRService hrService;

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
