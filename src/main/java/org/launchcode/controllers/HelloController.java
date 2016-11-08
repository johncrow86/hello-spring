package org.launchcode.controllers;

import javax.servlet.http.HttpServletRequest;

import org.launchcode.models.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloForm() {
		return "helloform";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("name");
		String language = request.getParameter("language");
		
		
		if (name == null || name == "")
			name = "World";
		
		model.addAttribute("message", HelloMessage.getMessage(name, language));
		model.addAttribute("title", "Hello Spring! Response");
		return "hello";
	}
}
