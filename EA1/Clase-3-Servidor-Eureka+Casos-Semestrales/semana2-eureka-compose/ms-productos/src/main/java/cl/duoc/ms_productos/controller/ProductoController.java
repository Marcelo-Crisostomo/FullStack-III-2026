package cl.duoc.ms_productos.controller;

import cl.duoc.ms_productos.model.Producto;
import cl.duoc.ms_productos.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controlador REST
@RestController

// Ruta base del recurso
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    // GET http://localhost:8081/api/productos
    @GetMapping
    public List<Producto> listar() {
        return service.listar();
    }

    // POST http://localhost:8081/api/productos
    @PostMapping
    public Producto guardar(@RequestBody Producto producto) {
        return service.guardar(producto);
    }
}
