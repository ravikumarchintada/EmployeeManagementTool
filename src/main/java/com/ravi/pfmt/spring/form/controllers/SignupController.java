package com.ravi.pfmt.spring.form.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ravi.pfmt.spring.form.model.Signup;

@Controller
public class SignupController {

	private static final Logger logger = LoggerFactory.getLogger(SignupController.class);
	
	public SignupController(){
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String loginPage(Model model) {
		logger.info("Returning signup.jsp page");
		model.addAttribute("signup", new Signup());
		return "signup";
	}

	@RequestMapping(value = "/signup.do", method = RequestMethod.POST)
	public String loginAction(@Valid Signup signup,	BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			logger.info("Returning signup.jsp page");
			return "signup";
		}
		logger.info("Returning signUpSuccess.jsp page");
		model.addAttribute("signup", signup);
		return "signUpSuccess";
	}

}
