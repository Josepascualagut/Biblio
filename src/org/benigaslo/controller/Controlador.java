package org.benigaslo.controller;

import org.benigaslo.model.Agenda;
import org.benigaslo.model.Modelo;
import org.benigaslo.view.Vista;

import java.util.List;

public class Controlador {

//fdgsdsf
    public void aCorrer(){
        Vista vista = new Vista();
        Modelo modelo = new Modelo();

        while(true) {
            vista.mostrarMenu();

            int o = vista.pedirOpcion();

            if (o == 2) {

                List<Agenda> agenda = modelo.obtenerListaBibliotecas();
                vista.mostrarBibliotecas(agenda);


            } else if (o == 1) {
                BibliotecaDTO datos = vista.pedirDatosBibliotecaNueva();

                modelo.guardarBiblioteca(datos);
            }
        }
    }
}
