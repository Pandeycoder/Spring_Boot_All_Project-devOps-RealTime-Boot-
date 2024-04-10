package com.pandey.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pandey.entities.Person;

public interface PersonRepo extends JpaRepository<Person,Integer>{

}
