package com.wisely.ch8_4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Ch84Application.class)
@WebAppConfiguration
public class Ch84ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
