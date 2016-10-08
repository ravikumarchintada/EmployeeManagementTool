package com.pfmt.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pfmt.spring.model.SignupEntity;

@Repository
@Transactional
public class SignupDAOImpl implements SignupDAO{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void addTeammember(SignupEntity signupEntity) {
		manager.persist(signupEntity);
	}
}
