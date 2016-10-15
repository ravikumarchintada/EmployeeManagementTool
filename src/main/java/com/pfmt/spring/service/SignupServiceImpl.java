package com.pfmt.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfmt.spring.dao.SignupDAO;
import com.pfmt.spring.model.SignupEntity;

@Service
public class SignupServiceImpl implements SignupService{
	
	@Autowired
	SignupDAO signupdao;

	@Override
	public void addTeammate(SignupEntity signupEntity) {
		signupdao.addTeammember(signupEntity);
	}

}
