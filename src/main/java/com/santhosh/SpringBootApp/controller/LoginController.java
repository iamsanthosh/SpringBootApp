package com.santhosh.SpringBootApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	public ModelAndView login(@RequestParam("username") String user, @RequestParam("password") String pass) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", "Welcome " + user);
		mv.setViewName("home");
		
		return mv;
	}
}
