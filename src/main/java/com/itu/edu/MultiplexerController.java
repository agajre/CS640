package com.itu.edu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class MultiplexerController {

	@RequestMapping(method = RequestMethod.GET)
	public String hello(ModelMap model) {

		model.addAttribute("name", "JCG Hello World!");
		return "helloWorld";

	}
}
