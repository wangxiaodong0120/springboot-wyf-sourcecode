package com.wisely.ch8_4.service;

import com.wisely.ch8_4.domain.Person;

public interface DemoService {
	public Person savePersonWithRollBack(Person person);
	public Person savePersonWithoutRollBack(Person person);

}
