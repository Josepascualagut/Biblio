package org.benigaslo.model;

import org.benigaslo.controller.AgendaDTO;

import java.util.ArrayList;
import java.util.List;

public class Modelo {

    List<Agenda> agendas = new ArrayList<>();


    public void guardarAgenda(AgendaDTO datos){
        Agenda agenda = new Agenda();

        agenda.titol = datos.nombre;
        agenda.descripcion = datos.descripcion;


        agendas.add(agenda);
    }

    public List<Agenda> obtenerListaAgenda() {
        return agendas;
    }
}
