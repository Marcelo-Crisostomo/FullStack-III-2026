package com.example.demo.exception;
import org.springframework.web.bind.MethodArgumentNotValidException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

//Manejar errores de manera global
@RestControllerAdvice
public class GlobalExceptionHandler {
    //Capturar los errores con @Valid
    @ExceptionHandler(MethodArgumentNotValidException.class)

    //Este métod o se va a ejecutar cuando ocurra un error de validacion
    public Map<String, String> manejarValidaciones(MethodArgumentNotValidException ex) {
        //Creo una lista mapeada para guardar los errores encontrados
        Map<String, String> errores = new HashMap<>();
        //recorrer la  lista de errores y guardarlos
        ex.getBindingResult().getFieldErrors().forEach(error ->
                errores.put(error.getField(), error.getDefaultMessage())
        );
        return errores;

    }

    //Capturar cualquier tipo de error no identificado
    @ExceptionHandler(Exception.class)
    //Esto se va a ejecutar si ocurre un error desconocido
    public Map<String, String> manejarErrorGeneral(Exception ex) {
        //Creo una lista mapeada para guardar los errores encontrados
        Map<String, String> error = new HashMap<>();

        //Agregar una clave llamada mensaje con un texto simple
        error.put("mensaje", "Ocurrió un error inesperado");

        return error;
    }
}

