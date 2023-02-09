package org.benigaslo.controller;

import org.benigaslo.model.Agenda;
import org.benigaslo.model.Modelo;
import org.benigaslo.view.Vista;

import java.util.List;

public class Controlador {

    public void aCorrer(){
        Vista vista = new Vista();
        Modelo modelo = new Modelo();


        while(true) {
            vista.mostrarMenu();

            int o = vista.pedirOpcion();

           if (o == 1) {
                AgendaDTO datos = vista.pedirDatosAgendaNueva();
                modelo.guardarAgenda(datos);

            } else if (o == 2) {
               List<Agenda> agenda = modelo.obtenerListaAgenda();
               vista.mostrarAgenda(agenda);
            }
        }
    }
}
