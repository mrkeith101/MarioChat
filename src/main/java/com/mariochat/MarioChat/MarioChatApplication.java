package com.mariochat.MarioChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.util.BsonUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableMongoRepositories
public class MarioChatApplication {

	public static void main(String[] args) {
		System.out.println("app starting");
		SpringApplication.run(MarioChatApplication.class, args);
		System.out.println("app started");
	}
	@Configuration
	public class WebConfig implements WebMvcConfigurer {
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/**")
					.addResourceLocations("classpath:/static/","classpath:/images/")
					.setCachePeriod(0);
		}
	}

}
