package com.example.eurekaclienthello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientHelloApplication.class, args);
	}
}
