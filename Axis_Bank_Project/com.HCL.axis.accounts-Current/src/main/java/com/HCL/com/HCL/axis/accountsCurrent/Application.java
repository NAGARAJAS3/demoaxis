package com.HCL.com.HCL.axis.accountsCurrent;

import org.springframework.boot.SpringApplication;



import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages= {"com.HCL.com.HCL.axis.accountsCurrent"}) 

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("welcome to axis Current accounts");
		
	}

}
