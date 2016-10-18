package com.wisely.ch8_4.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisely.ch8_4.domain.Person;
import com.wisely.ch8_4.service.DemoService;

@RestController
public class MyController {
	@Autowired
	DemoService demoService;
	
	@RequestMapping("/rollback")
	public Person rollback(Person person){ //1
		
		return demoService.savePersonWithRollBack(person);
	}
	
	@RequestMapping("/norollback")
	public Person noRollback(Person person){//2
		
		return demoService.savePersonWithoutRollBack(person);
		
		
	}

}
