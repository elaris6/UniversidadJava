package es.local.avanzados.modificadoresacceso.paquete2;

import es.local.avanzados.modificadoresacceso.paquete1.Clase1Protected;
import es.local.avanzados.modificadoresacceso.paquete1.Clase1Public;

public class UsoClasesModificadores {

    public static void main(String[] args) {

        // Clase1 es "public".
        Clase1Public c1 = new Clase1Public();
        // atribPublico es un atributo público.
        c1.atribPublico = "valor";
        // metodoPublico es un método público.
        c1.metodoPublico();

        Clase1Protected c11 = new Clase1Protected("cadena");
        // c11.atribProtected; // No se puede acceder a un atributo "protected"
        // c11.metodoProtected(); // No se puede acceder a un método "protected"

        ClaseHIjaClase1Protected c111 = new ClaseHIjaClase1Protected();

    }
}
