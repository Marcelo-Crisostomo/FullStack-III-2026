package cl.duoc.ms_productos.service;


import cl.duoc.ms_productos.model.Producto;
import cl.duoc.ms_productos.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

// Marca esta clase como capa de servicio
@Service
public class ProductoService {

    private final ProductoRepository repository;

    // Inyección por constructor
    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    // Devuelve todos los productos
    public List<Producto> listar() {
        return repository.findAll();
    }

    // Guarda un producto nuevo
    public Producto guardar(Producto producto) {
        return repository.save(producto);
    }
}
