package org.benigaslo.model;

import org.benigaslo.controller.BibliotecaDTO;

import java.util.ArrayList;
import java.util.List;

public class Modelo {

    List<Agenda> agenda = new ArrayList<>();


    public void guardarBiblioteca(BibliotecaDTO datos){
        agenda.add(new Agenda());
    }


    public List<Agenda> obtenerListaBibliotecas() {
        return agenda;
    }
}
