package com.spring.cloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudConfigClientApplication {

	/**
	 * https://madplay.github.io/post/changes-in-spring-cloud-config-from-spring-boot-2-4
	 * https://multifrontgarden.tistory.com/278
	 * http://localhost:8080/static
	 * http://localhost:8080/dynamic
	 * $ curl -X POST "http://localhost:8089/actuator/refresh"
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
	}

}
