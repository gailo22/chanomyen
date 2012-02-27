package com.gailo22.chanom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello-chanom")
	public String helloChanom(ModelMap modelMap) {
		return "hello";
	}

}
