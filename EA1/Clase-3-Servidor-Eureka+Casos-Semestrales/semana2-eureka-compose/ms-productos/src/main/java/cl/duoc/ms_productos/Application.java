package cl.duoc.ms_productos;

import cl.duoc.ms_productos.model.Producto;
import cl.duoc.ms_productos.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner cargarDatos(ProductoRepository repository) {
		return args -> {
			repository.save(new Producto(null, "Notebook", 799990.0));
			repository.save(new Producto(null, "Mouse", 19990.0));
			repository.save(new Producto(null, "Teclado", 29990.0));
		};
	}


}
