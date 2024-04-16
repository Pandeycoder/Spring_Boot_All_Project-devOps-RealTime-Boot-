package com.pandey.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pandey.binding.User;

public interface UserRepo extends JpaRepository<User,Integer> {

}
