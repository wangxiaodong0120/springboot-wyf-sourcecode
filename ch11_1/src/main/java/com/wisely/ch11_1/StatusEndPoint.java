package com.wisely.ch11_1;

import org.springframework.beans.BeansException;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


@ConfigurationProperties(prefix = "endpoints.status", ignoreUnknownFields = false) //1
public class StatusEndPoint extends AbstractEndpoint<String> implements ApplicationContextAware{//2
	
	ApplicationContext context;

	public StatusEndPoint() {
		super("status");
	}

	@Override
	public String invoke() { //3
		StatusService statusService = context.getBean(StatusService.class);
		
		return "The Current Status  is :"+statusService.getStatus();
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = arg0;
		
	}


}
