package com.portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.binding.User;

public interface UserRepo extends JpaRepository<User,Integer> {

}
