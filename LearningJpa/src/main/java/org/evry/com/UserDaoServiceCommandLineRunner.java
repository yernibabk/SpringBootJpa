package org.evry.com;

import org.evry.com.entity.User;
import org.evry.com.service.UserDaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger log =
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	@Autowired
	UserDaoService daoService;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Babu","SoftwareEngineer");
		Long userId = daoService.saveUser(user);
		log.info("User is created and UserId is :"+user.getId());
	}

}
