package org.benigaslo;


import org.benigaslo.controller.Controlador;

public class Main {
    int xxxx;
    public static void main(String[] args) {
        new Controlador().aCorrer();

    }
}


/*
+-------+                              +-------------+                                 +-------+
|       | ------ dades guardades ----> |             | ----- què mostrar / dades ----> |       |           O
| MODEL |                              | CONTROLADOR |                                 | VISTA |         / | \
|       | <--- actualització dades --- |             | <------ entrada usuari -------- |       |          | |
+-------+                              +-------------+                                 +-------+          | |
                                                                                                          _ _
 */