package com.ejemplo.ms_productos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    @GetMapping("/info")
    public String info(){
        return "Mensaje desde el MS-Productos";
    }
}
