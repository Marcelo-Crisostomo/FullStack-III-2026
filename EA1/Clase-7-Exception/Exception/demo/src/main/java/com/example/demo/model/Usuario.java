package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Bloquear datos null, vacios o con espacio en blanco
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min=3, max=20, message = "El nombre debe tener entre 3 y 20 caracteres")
    private String nombre;

    //No permitas null
    @NotNull(message = "La edad es obligatoria")
    @Min(value = 18, message = "La edad mínima es de 18 años")
    @Max(value = 100, message = "La edad máxima es de 100 añitos")
    private Integer edad;

    //Debe tener un formato de email
    @Email(message = "El correo no tiene un fomato valido")
    @NotBlank(message = "El correo es un campo obligatorio")
    private String correo;

    //Sueldo
    @Positive(message = "El sueldo debe ser un valor positivo ")
    private Double sueldo;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, Integer edad, String correo, Double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.sueldo = sueldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
