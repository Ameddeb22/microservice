package com.esprit.projet.voyageaffaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ReservationPiloteMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(ReservationPiloteMicroservice.class, args);
	}

}
