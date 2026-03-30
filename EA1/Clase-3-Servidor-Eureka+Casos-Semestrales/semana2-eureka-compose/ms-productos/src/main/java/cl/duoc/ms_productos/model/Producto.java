package cl.duoc.ms_productos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Marca esta clase como una entidad JPA
@Entity

// Lombok genera getters, setters, toString, equals y hashCode
@Data

// Constructor vacío requerido por JPA
@NoArgsConstructor

// Constructor con todos los campos
@AllArgsConstructor
public class Producto {

    // Clave primaria
    @Id

    // Generación automática del id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;
}