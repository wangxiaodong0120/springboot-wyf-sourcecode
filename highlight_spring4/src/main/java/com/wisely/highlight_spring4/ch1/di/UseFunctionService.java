package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //1
public class UseFunctionService {
	@Autowired //2
	FunctionService functionService;
	
	public String SayHello(String word){
		return functionService.sayHello(word);
	}

}
