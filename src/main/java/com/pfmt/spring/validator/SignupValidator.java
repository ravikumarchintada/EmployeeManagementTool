package com.pfmt.spring.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pfmt.spring.model.SignupEntity;

@Component
public class SignupValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return SignupEntity.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "error.userName", "First name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dob", "error.dob", "DOB is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.password", "Password is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "error.email", "Email is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobileNo", "error.mobileNo", "Mobile is required.");
	}

}
