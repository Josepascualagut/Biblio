package org.benigaslo;


import org.benigaslo.controller.Controlador;

public class Main {
    public static void main(String[] args) {

        Controlador controlador = new Controlador();
        controlador.aCorrer();
    }
}


/*
+-------+            return            +-------------+              ()                 +-------+
|       | ------ dades guardades ----> |             | ----- què mostrar / dades ----> |       |           O
| MODEL |                              | CONTROLADOR |                                 | VISTA |         / | \
|       | <--- actualització dades --- |             | <------ entrada usuari -------- |       |          | |
+-------+              ()              +-------------+            return               +-------+          | |
                                                                                                          _ _
 */