package fr.ul.m2sid.affectationservice;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class AffectationServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(AffectationServiceApplication.class, args);
	}
}
