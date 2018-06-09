package com.cricbuzz.test.sample.cricbuzztest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.cricbuzz.test.sample.cricbuzztest.*" })
@EnableAutoConfiguration(exclude = { GsonAutoConfiguration.class })	
public class CricbuzztestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricbuzztestApplication.class, args);
	}
}
