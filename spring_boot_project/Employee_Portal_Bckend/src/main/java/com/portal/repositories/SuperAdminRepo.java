package com.portal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import entities.SuperAdmin;

@EnableJpaRepositories 
public  interface SuperAdminRepo extends JpaRepository<SuperAdmin, Long> {
    // Custom query methods can be added here if needed
}
