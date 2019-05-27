package com.example.customer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
@EnableServiceComb
@SpringBootApplication
//		(scanBasePackages = "com.example.customer.pojo")
@MapperScan(basePackages = "com.example.customer.dao")
public class CustomerApplication {
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
}
