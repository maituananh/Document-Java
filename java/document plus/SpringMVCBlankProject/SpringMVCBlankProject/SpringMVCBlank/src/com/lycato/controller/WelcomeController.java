package com.lycato.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@RequestMapping(value="MyAction", method=RequestMethod.GET)
	public String myActionMethod(ModelMap model) {
		model.addAttribute("message", "This is my first action");
		return "MyView";
	}
	
	@RequestMapping(value="First", method=RequestMethod.GET)
	public String FirstAction(ModelMap model) {
		model.addAttribute("message", "This is my first action");
		return "First";
	}
}
