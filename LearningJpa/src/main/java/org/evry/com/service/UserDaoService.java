package org.evry.com.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.evry.com.entity.User;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDaoService {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Long saveUser(User user) {
		entityManager.persist(user);
		return user.getId();
	}

}
