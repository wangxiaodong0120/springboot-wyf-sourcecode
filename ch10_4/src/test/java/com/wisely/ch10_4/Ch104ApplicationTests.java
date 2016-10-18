package com.wisely.ch10_4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wisely.ch10_4.dao.PersonRepository;
import com.wisely.ch10_4.domain.Person;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Ch104Application.class) //1
@WebAppConfiguration
@Transactional //2
public class Ch104ApplicationTests {
	@Autowired
	PersonRepository personRepository;
	
	MockMvc mvc;
	
	@Autowired 
	WebApplicationContext webApplicationContext;
	
	String expectedJson;
	
	@Before //3
	public void setUp() throws JsonProcessingException{ 
		Person p1 = new Person("wyf");
		Person p2 = new Person("wisely");
		personRepository.save(p1);
		personRepository.save(p2);
		
		expectedJson =Obj2Json(personRepository.findAll()); //4
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		
		
	}
	
	protected String Obj2Json(Object obj) throws JsonProcessingException{//5
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(obj);
	}
	
	@Test
	public void testPersonController() throws Exception {
		String uri="/person";
		MvcResult result = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON))
																.andReturn(); //6
		int status = result.getResponse().getStatus(); //7
		String content = result.getResponse().getContentAsString(); //8
		
		Assert.assertEquals("错误，正确的返回值为200",200, status); //9
		Assert.assertEquals("错误，返回值和预期返回值不一致", expectedJson,content); //10
	}

}
