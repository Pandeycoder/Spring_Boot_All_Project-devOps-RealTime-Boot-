package com.portal.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.entity.UserInfo;

public interface UserInfoRepo extends JpaRepository<UserInfo, Integer> {

	Optional<UserInfo> findByName(String username);
}
