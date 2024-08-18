package com.portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.entity.User;

public interface UserRepo extends JpaRepository<User,Integer> {

	public boolean existsByEmail(String email);
	

}
