package com.wisely.ch8_4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisely.ch8_4.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	

}
