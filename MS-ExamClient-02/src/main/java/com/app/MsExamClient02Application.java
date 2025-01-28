package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan
@EnableJpaRepositories
public class MsExamClient02Application {

	public static void main(String[] args) {
		SpringApplication.run(MsExamClient02Application.class, args);
		System.out.println("This is Exam Client");
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate rt()
	{
		RestTemplate rs = new RestTemplate();
		
		return rs;
	}

}
