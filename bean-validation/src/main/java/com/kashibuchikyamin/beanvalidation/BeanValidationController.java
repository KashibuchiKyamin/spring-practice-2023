package com.kashibuchikyamin.beanvalidation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BeanValidationController {

	@GetMapping({ "/", "form" })
	String getForm(Model model) {
		model.addAttribute("form", new Form());
		return "form";
	}

	@PostMapping({ "/", "form" })
	String inputForm(@Validated Form form, BindingResult bindingResult, Model model) {
		System.out.println("form: " + form);
		if (bindingResult.hasErrors()) {
			model.addAttribute("form", form);
			return "form";
		}
		return "redirect:result";
	}

	@GetMapping("result")
	String getResult() {
		return "result";
	}
}
