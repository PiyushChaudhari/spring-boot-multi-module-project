package com.core.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class SpringBootCoreModuleApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCoreModuleApplication.class, args);
	}
}
