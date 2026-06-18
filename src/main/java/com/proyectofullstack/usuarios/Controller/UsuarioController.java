package com.proyectofullstack.usuarios.Controller;

import com.proyectofullstack.usuarios.Factory.UsuarioFactory;
import com.proyectofullstack.usuarios.Model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @PostMapping("/crear")
    public ResponseEntity<String> crearUsuario(
            @RequestParam String tipo,
            @RequestParam String nombre) {

        Usuario usuario = UsuarioFactory.crearUsuario(tipo, nombre);
        return ResponseEntity.ok(
            "Usuario creado - Rol: " + usuario.getRol() +
            " | Permisos: " + usuario.getPermisos()
        );
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("ms-usuarios activo - Factory Method Pattern operativo");
    }
}