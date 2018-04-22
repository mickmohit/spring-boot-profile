package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.config.Configuration;
import com.example.demo.config.ServerProperties;

@SpringBootApplication
public class SpringBootProfileApplication {

	@Autowired
    private ServerProperties serverProperties;

	@Autowired
    private Configuration configuration;
	
	private static Logger logger = LoggerFactory.getLogger(SpringBootProfileApplication.class);
	 
   /*// @Override
    public void run(String... args) throws Exception {
        System.out.println(serverProperties);
    }*/
	
	 @PostConstruct
	    private void init(){
	        logger.info("Spring Boot - active profile: " + configuration.getName());
	        logger.info("Spring Boot - Choosing Your Profile and @Profile annotation example");
	        logger.info(serverProperties.toString());

	    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileApplication.class, args);
	}
}
