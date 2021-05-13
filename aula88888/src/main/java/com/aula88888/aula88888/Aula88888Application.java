package com.aula88888.aula88888;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Aula88888Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula88888Application.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("----------------It's Aliveeeee--------------------");
		};
	}
}
