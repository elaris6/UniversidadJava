package es.local.avanzados.tiposgenericos;

public class UsoClaseGenerica {

    public static void main(String[] args) {

        /* Para instanciar una clase genérica debemos indicar el tipo
        * que pasaremos como parámetro, que no puede ser un tipo primitivo. */
        ClaseGenerica <Integer> objetoInt = new ClaseGenerica<>(15);
        objetoInt.getTipo();

        ClaseGenerica<String> objetoString = new ClaseGenerica<>("Cadena");
        objetoString.getTipo();
    }
}
