package com.iway.recrutement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iway.recrutement.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUserName(String userName);
	public boolean existsByUserName(String username);
	public void deleteByUserName(String username);
}
