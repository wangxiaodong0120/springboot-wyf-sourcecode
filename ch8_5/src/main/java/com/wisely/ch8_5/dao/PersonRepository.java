package com.wisely.ch8_5.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisely.ch8_5.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	

}
