package org.benigaslo.view;

import org.benigaslo.controller.BibliotecaDTO;
import org.benigaslo.model.Agenda;

import java.util.List;
import java.util.Scanner;

public class Vista {
    Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1) Añadir contacto");
        System.out.println("2) Ver contacto");
    }

    public int pedirOpcion() {
        System.out.println("Opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
    }

    public void mostrarBibliotecas(List<Agenda> agendas) {
        System.out.println("Lista de Bibliotecas");

        agendas.forEach(agenda -> System.out.println(agenda.titol));
    }

    public BibliotecaDTO pedirDatosBibliotecaNueva() {
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ciudad: ");
        String ciudad = scanner.nextLine();

        return new BibliotecaDTO(nombre, ciudad);

    }
}
