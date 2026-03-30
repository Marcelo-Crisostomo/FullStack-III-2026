package com.ejemplo.ms_pedidos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {
    @GetMapping("/info")
    public String info(){
        return "Mensaje enviado desde el MS de Pedidos xdxdxdxd";
    }
}
