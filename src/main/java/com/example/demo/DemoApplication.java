package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
@RestController
public class DemoApplication {
	Logger logger = LogManager.getLogger(getClass());

	@RequestMapping("/")
	@ResponseBody
	public String home(HttpServletResponse response) {
		response.addHeader("Content-Type", "application/json");
		logger.debug("Debugging log");
		logger.info("Info log");
		logger.warn("Warning, something went wrong");
		logger.error("Error: something really did not work");
		return "{\"result\":\"success\"}";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
