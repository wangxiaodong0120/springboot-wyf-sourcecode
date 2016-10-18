package com.wisely.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisely.person.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
