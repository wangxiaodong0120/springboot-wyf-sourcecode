package com.wisely.ch9_1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisely.ch9_1.domain.SysUser;

public interface SysUserRepository extends JpaRepository<SysUser, Long>{
	
	SysUser findByUsername(String username);

}
