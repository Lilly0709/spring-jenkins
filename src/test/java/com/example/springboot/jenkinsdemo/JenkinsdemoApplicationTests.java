package com.example.springboot.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsdemoApplicationTests 
{
	public static Logger logger = LoggerFactory.getLogger(JenkinsdemoApplicationTests.class);
	@Test
	public void contextLoads() 
	{
		logger.info("Test case executing");
		logger.info("Test case executing second log");
	}

}
