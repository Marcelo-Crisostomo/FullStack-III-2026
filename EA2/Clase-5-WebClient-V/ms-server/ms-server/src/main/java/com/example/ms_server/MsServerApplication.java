package com.example.ms_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class MsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsServerApplication.class, args);
	}

	//Endpoint
	@GetMapping("/saludo")
	public String saludo() {

		return "Hola desde el Microservicio de Server desde el puerto 8081 🦆";
	}

	//
	@GetMapping("/saludo/{nombre}")
	public String saludoPersonalizado(@PathVariable String nombre) {
		return "Hola "+ nombre + "desde el server 8081";
	}

}
