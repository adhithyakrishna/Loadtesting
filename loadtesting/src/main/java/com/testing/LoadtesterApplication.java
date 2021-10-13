package com.testing;

import com.testing.model.Employee;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class LoadtesterApplication {


	@Bean
	public RedisTemplate<String, Employee> redisTemplate(RedisConnectionFactory connectionFactory) {
		RedisTemplate<String, Employee> template = new RedisTemplate<>();
		template.setConnectionFactory(connectionFactory);
		// Add some specific configuration here. Key serializers, etc.
		return template;
	}

	public static void main(String[] args) throws IOException {
		SpringApplication.run(LoadtesterApplication.class, args);
	}

}