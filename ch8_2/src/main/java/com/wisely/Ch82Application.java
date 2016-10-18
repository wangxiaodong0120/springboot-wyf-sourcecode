package com.wisely;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.wisely.dao.PersonRepository;
import com.wisely.support.CustomRepositoryFactoryBean;

@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = CustomRepositoryFactoryBean.class)
public class Ch82Application {
	@Autowired
	PersonRepository personRepository;
	
	
    public static void main(String[] args) {
        SpringApplication.run(Ch82Application.class, args);
        
    }
    
 
}
