package com.pandey.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pandey.entities.Passport;

public interface PassportRepo extends JpaRepository<Passport,Integer>{

}
