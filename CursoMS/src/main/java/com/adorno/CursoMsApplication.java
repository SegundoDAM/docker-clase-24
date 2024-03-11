package com.adorno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//para reconocer a eureka
@EnableDiscoveryClient
@SpringBootApplication
//para reconocer feign
@EnableFeignClients
public class CursoMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoMsApplication.class, args);
	}

}
