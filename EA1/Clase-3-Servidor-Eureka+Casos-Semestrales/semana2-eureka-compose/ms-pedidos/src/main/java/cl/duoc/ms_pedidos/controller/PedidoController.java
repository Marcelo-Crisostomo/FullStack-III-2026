package cl.duoc.ms_pedidos.controller;


import cl.duoc.ms_pedidos.model.Pedido;
import cl.duoc.ms_pedidos.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controlador REST
@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    // GET http://localhost:8082/api/pedidos
    @GetMapping
    public List<Pedido> listar() {
        return service.listar();
    }

    // POST http://localhost:8082/api/pedidos
    @PostMapping
    public Pedido guardar(@RequestBody Pedido pedido) {
        return service.guardar(pedido);
    }
}
