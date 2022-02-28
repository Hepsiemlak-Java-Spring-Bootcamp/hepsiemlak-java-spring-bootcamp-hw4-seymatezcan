package com.emlakburada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@ComponentScan(basePackages = {})
public class EmlakburadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmlakburadaApplication.class, args);
	}

}
