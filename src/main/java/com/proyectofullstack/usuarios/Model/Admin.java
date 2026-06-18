package com.proyectofullstack.usuarios.Model;

public class Admin extends Usuario {

    public Admin(String nombre) {
        this.nombre = nombre;
        this.rol = "ADMIN";
    }

    @Override
    public String getPermisos() {
        return "Acceso total: inventario, pedidos, usuarios, reportes globales";
    }
}