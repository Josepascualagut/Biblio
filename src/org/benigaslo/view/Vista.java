package org.benigaslo.view;

import org.benigaslo.controller.AgendaDTO;
import org.benigaslo.model.Agenda;

import java.util.List;
import java.util.Scanner;

public class Vista {
    Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1) Añadir Agenda");
        System.out.println("2) Ver Agenda");
    }

    public int pedirOpcion() {
        System.out.println("Opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
    }

    public void mostrarAgenda(List<Agenda>agendas) {
        System.out.println("Lista de Agenda");

        agendas.forEach(agenda -> System.out.println(agenda.titol));
    }

    public AgendaDTO pedirDatosAgendaNueva() {
        System.out.println("Nombre: ");   // ProfesInfo
        String nombre = scanner.nextLine();
        System.out.println("Descripcion: ");  // Profesores de informatica de catalunya
        String description = scanner.nextLine();

        return new AgendaDTO(nombre,description);


    }
}
