package com.example.demo88;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Demo88Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo88Application.class, args);
	}
}
