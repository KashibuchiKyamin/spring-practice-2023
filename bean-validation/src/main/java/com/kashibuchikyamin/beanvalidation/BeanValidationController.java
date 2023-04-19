package com.kashibuchikyamin.beanvalidation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BeanValidationController {
	
	@GetMapping({"/", "form"})
	String getForm() {
		return "form";
	}

	@PostMapping({"/", "form"})
	String inputForm() {
		return "redirect:result";
	}

	@GetMapping("result")
	String getResult() {
		return "result";
	}
}
