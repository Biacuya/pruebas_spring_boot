package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaUniversoController {
    // Mapeo para la ruta "/hola"
    @GetMapping("/hola")
    public String holaUniverso() {
        return "¡Hola Universo!";
    }
}
