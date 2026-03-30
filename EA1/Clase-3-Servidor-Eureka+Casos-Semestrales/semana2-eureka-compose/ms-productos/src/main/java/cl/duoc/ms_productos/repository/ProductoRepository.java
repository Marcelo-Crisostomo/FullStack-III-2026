package cl.duoc.ms_productos.repository;

import cl.duoc.ms_productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Indica que esta interfaz será un repositorio
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // No necesitamos escribir código aquí.
    // JpaRepository ya trae métodos como findAll(), findById(), save(), deleteById(), etc.
}
