package com.mariochat.MarioChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableMongoRepositories
public class MarioChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarioChatApplication.class, args);
	}
	@Configuration
	public class WebConfig implements WebMvcConfigurer {
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/**")
					.addResourceLocations("classpath:/static/","classpath:/image/")
					.setCachePeriod(0);
		}
	}

}
