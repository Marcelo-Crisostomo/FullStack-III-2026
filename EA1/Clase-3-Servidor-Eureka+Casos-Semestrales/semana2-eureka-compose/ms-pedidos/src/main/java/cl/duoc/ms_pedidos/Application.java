package cl.duoc.ms_pedidos;

import cl.duoc.ms_pedidos.model.Pedido;
import cl.duoc.ms_pedidos.repository.PedidoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	// Datos de prueba al iniciar
	@Bean
	CommandLineRunner cargarDatos(PedidoRepository repository) {
		return args -> {
			repository.save(new Pedido(null, "Marcelo", 150000.0));
			repository.save(new Pedido(null, "Camila", 89000.0));
		};
	}

}
