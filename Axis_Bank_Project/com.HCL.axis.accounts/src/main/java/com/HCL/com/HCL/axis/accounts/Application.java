package com.HCL.com.HCL.axis.accounts;

import java.util.logging.*;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages= {"com.HCL.com.HCL.axis.accounts"}) 
@EnableEurekaServer
public class Application {
 
	static LogManager LogManagerobj=LogManager.getLogManager();
	static Logger Loggerobj=LogManagerobj.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Loggerobj.info("Application_sudheer");
		
		System.out.println("welcome to axis accounts");
	}

}
