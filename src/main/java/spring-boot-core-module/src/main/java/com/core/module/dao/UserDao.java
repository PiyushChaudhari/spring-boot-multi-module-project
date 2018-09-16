package com.core.module.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.core.module.entity.User;

public interface UserDao extends JpaRepository<User, Long>{

}
