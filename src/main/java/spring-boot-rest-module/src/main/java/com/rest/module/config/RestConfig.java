package com.rest.module.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.core.*"})
@PropertySource(value={
		"classpath:application-core-${spring.profiles.active}.properties",
		"classpath:application-rest-${spring.profiles.active}.properties"
})
public class RestConfig {

}
