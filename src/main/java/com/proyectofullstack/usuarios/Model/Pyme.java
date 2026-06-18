package com.proyectofullstack.usuarios.Model;

public class Pyme extends Usuario {

    public Pyme(String nombre) {
        this.nombre = nombre;
        this.rol = "PYME";
    }

    @Override
    public String getPermisos() {
        return "Acceso: inventario, pedidos, reportes propios";
    }
}