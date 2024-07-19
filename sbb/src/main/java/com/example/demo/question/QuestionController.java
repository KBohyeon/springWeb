package com.example.demo.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {

	@GetMapping("/question/list") //아래가 실행되도록 매핑해줌

	public String list() {
		return "question_list"; //파일명을 말함
	}
}
