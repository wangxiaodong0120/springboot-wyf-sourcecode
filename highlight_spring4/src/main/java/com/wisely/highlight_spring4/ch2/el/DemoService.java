package com.wisely.highlight_spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Value("其他类的属性") //1
    private String another;

	public String getAnother() {
		return another;
	}

	public void setAnother(String another) {
		this.another = another;
	}
	
}
