package com.wisely.ch11_1;

import org.springframework.stereotype.Service;

@Service
public class StatusService {
	
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
