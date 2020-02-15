package com.apiGateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayWithZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayWithZuulApplication.class, args);
	}

}
