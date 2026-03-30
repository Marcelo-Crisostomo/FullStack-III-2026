package cl.duoc.ms_inventario.repository;



import cl.duoc.ms_inventario.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
