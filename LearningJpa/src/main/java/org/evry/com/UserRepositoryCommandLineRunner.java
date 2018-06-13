package org.evry.com;

import java.util.List;
import java.util.Optional;

import org.evry.com.entity.User;
import org.evry.com.service.UserRepositroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

	@Autowired
	UserRepositroy userRepositroy;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("TestUser", "Tester");
		userRepositroy.save(user);
		log.info("User has been created, User details:"+user);
		
		Optional<User> findById = userRepositroy.findById(1l);
		log.info("user detais retrived and user details:"+findById);
		
		List<User> findAll = userRepositroy.findAll();
		log.info("Users list details: "+findAll);
		
	}
	

}
