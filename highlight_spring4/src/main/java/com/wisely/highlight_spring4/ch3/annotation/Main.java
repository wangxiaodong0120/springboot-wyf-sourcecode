package com.wisely.highlight_spring4.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);
		
		DemoService demoService =  context.getBean(DemoService.class);
		
		demoService.outputResult();
		
		context.close();
	}

}
