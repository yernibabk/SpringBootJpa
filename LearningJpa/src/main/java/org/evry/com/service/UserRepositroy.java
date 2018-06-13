package org.evry.com.service;

import org.evry.com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositroy extends JpaRepository<User, Long>{

}
