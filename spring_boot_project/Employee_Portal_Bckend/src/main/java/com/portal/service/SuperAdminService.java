package com.portal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.portal.repositories.SuperAdminRepo;

import entities.SuperAdmin;

@Service
public class SuperAdminService {

    @Autowired
    private SuperAdminRepo userRepository;

    public List<SuperAdmin> getAllUsers() {
        return userRepository.findAll();
    }

    public SuperAdmin createUser(SuperAdmin user) {
        return userRepository.save(user);
    }

    public SuperAdmin updateUser(Long id, SuperAdmin user) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found");
        }
        user.setId(id);
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found");
        }
        userRepository.deleteById(id);
    }

    public Optional<SuperAdmin> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
