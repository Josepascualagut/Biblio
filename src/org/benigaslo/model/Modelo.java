package org.benigaslo.model;

import org.benigaslo.controller.AgendaDTO;

import java.util.ArrayList;
import java.util.List;

public class Modelo {

    List<Agenda> agenda = new ArrayList<>();


    public void guardarBiblioteca(AgendaDTO datos){
        agenda.add(new Agenda());
    }

    public List<Agenda> obtenerListaAgenda() {
        return agenda;
    }
}
