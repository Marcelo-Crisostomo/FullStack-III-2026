package com.example.ms_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@RestController
public class MsClientApplication {

	//direccion del otro ms = server
	private final WebClient webClient = WebClient.create("http://localhost:8081");

	public static void main(String[] args) {
		SpringApplication.run(MsClientApplication.class, args);
	}

	//llamada al otro MS
	@GetMapping("/consumir")
	public String consumir(){

		//Llamada GET al otro MS
		return webClient.get()//tipo peticion
				.uri("/saludo")// uri= es el endpoint al cual quiero llegar
				.retrieve()//Ejecutar la request = Peticion
				.bodyToMono(String.class)//Parsea el JSON a Objeto o .class
				.block();//Bloquea to do hasta obtener una respuesta o un resultado

	}

	//llamada al otro MS
	@GetMapping("/consumir/{nombre}")
	public String consumirPersonalizado(@PathVariable String nombre){

		//Llamada GET al otro MS
		return webClient.get()//tipo peticion
				.uri("/saludo/" + nombre)// uri= es el endpoint al cual quiero llegar
				.retrieve()//Ejecutar la request = Peticion
				.bodyToMono(String.class)//Parsea el JSON a Objeto o .class
				.block();//Bloquea to do hasta obtener una respuesta o un resultado

	}

}
