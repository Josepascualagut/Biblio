package org.benigaslo.controller;

// Data Transfer Object = ajuntar variables, ficales en un pack (un pack es un objeto)

public class AgendaDTO {
    public String nombre;
    public String descripcion;

    public AgendaDTO(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
