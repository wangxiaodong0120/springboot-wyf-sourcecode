package com.wisely.ch6_5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Ch65Application.class)
@WebAppConfiguration
public class Ch65ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
