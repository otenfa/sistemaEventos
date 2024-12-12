package com.sumauma.sistemaEventos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaEventosApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SistemaEventosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Banco teste h2 em execução");
		
	}

}
