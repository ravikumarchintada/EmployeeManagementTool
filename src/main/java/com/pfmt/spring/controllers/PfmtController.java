package com.pfmt.spring.controllers;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.pfmt.spring.model.LoginEntity;
import com.pfmt.spring.model.SignupEntity;
import com.pfmt.spring.service.SignupService;

@Controller
public class PfmtController {

	@Autowired
	SignupService signupService;

	private static final Logger logger = LoggerFactory.getLogger(PfmtController.class);
	private Validator validator;

	public PfmtController() {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		validator = validatorFactory.getValidator();
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signupPage(Model model) {
		logger.info("Returning signup.jsp page");
		model.addAttribute("signup", new SignupEntity());
		return "signup";
	}

	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("login") LoginEntity loginVO, BindingResult result,
			SessionStatus status) {
		System.out.println("Inside login");
		return "manageFunds";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signUp(@ModelAttribute("signup") SignupEntity signupVO, BindingResult result,
			SessionStatus status) {

		Set<ConstraintViolation<SignupEntity>> violations = validator.validate(signupVO);

		for (ConstraintViolation<SignupEntity> violation : violations) {
			String propertyPath = violation.getPropertyPath().toString();
			String message = violation.getMessage();
			result.addError(new FieldError("signup", propertyPath, "Invalid " + propertyPath + "(" + message + ")"));
		}

		if (result.hasErrors()) {
			return "signup";
		}
		signupService.addTeammate(signupVO);
		status.setComplete();
		return "index";
	}
}
