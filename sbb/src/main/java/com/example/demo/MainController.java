package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		return "안녕";
	}
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list"; //리다이렉트 기본 주소 입력시 여기로 감
	}
}
