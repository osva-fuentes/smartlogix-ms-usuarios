package com.proyectofullstack.usuarios.Model;

import lombok.Getter;

@Getter
public abstract class Usuario {
    protected String nombre;
    protected String rol;
    public abstract String getPermisos();
}