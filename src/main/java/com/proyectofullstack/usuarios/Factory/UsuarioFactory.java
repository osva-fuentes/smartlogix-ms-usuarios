package com.proyectofullstack.usuarios.Factory;

import com.proyectofullstack.usuarios.Model.Admin;
import com.proyectofullstack.usuarios.Model.Pyme;
import com.proyectofullstack.usuarios.Model.Usuario;

public class UsuarioFactory {

    public static Usuario crearUsuario(String tipo, String nombre) {
        return switch (tipo.toUpperCase()) {
            case "ADMIN" -> new Admin(nombre);
            default      -> new Pyme(nombre);
        };
    }
}