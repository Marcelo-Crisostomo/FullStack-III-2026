package cl.duoc.ms_pedidos.service;

import cl.duoc.ms_pedidos.model.Pedido;
import cl.duoc.ms_pedidos.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Capa de servicio
@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public List<Pedido> listar() {
        return repository.findAll();
    }

    public Pedido guardar(Pedido pedido) {
        return repository.save(pedido);
    }
}
