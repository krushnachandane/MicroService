package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan
@EnableJpaRepositories
public class MsAddmissionClient01Application {

	public static void main(String[] args) {
		SpringApplication.run(MsAddmissionClient01Application.class, args);
		System.out.println("This is Addmission Client-01  post , Get , put , patch , Delete , Clint Data");
	}

}
