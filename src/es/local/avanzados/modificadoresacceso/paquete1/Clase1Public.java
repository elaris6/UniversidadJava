package es.local.avanzados.modificadoresacceso.paquete1;

/* "public" sobre una clase hace que se pueda usar por cualquier clase en
* el mismo paquete o en un paquete externo. */

public class Clase1Public {

    /* Un atributo "public" se podrá usar desde otra clase. */
    public String atribPublico;

    /* Un constructor "public" se podrá usar desde cualquier clase. */
    public Clase1Public(){
        System.out.println("Constructor public.");
    }

    /* Un método "public" se podrá usar desde otra clase. */
    public void metodoPublico() {
        System.out.println("Método público.");

    }
}
