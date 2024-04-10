package com.pandey.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pandey.entities.Passport;
import com.pandey.entities.Person;
import com.pandey.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo personRepo;
	
	public void saveData()
	{
		Person person=new Person();
		person.setPersonName("Pandey");
		person.setPersonGender("Male");
		
		Passport passport=new Passport();
		passport.setPassportNum("KM795");
		passport.setIsssueDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));
		
		person.setPassport(passport);
		passport.setPerson(person);
		
		personRepo.save(person);
	}

}
