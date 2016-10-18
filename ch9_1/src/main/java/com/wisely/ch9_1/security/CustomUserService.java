package com.wisely.ch9_1.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.wisely.ch9_1.dao.SysUserRepository;
import com.wisely.ch9_1.domain.SysUser;

public class CustomUserService implements UserDetailsService { //1
	@Autowired
	SysUserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) { //2
		
		SysUser user = userRepository.findByUsername(username); 
		if(user == null){
			throw new UsernameNotFoundException("用户名不存在");
		}
		
		return user; //3
	}

}
