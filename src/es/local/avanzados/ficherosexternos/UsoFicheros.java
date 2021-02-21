package es.local.avanzados.ficherosexternos;

public class UsoFicheros {

    public static void main(String[] args) {

        String nombre = "fichero_prueba.txt";
        /* En Windows es necesario indicar la doble barra invertida para salvar que la primera
        * se usa como caracter de escape. */
        String rutaCompletaWindows = "C:\\CODE\\Java\\UniversidadJava\\UniversidadJava\\src\\es\\local\\avanzados\\ficherosexternos\\ficheroPrueba.txt";
        /* En Linux no sería necesario. */
        String rutaCompletaLinux = "/home/testFolder/ficheroPrueba.txt";

        /* Llamamos a todas las operaciones implementadas sobre ficheros, válidas para
        * ficheros de texto. */

        ManejoFicheros.crearFichero(rutaCompletaWindows);

        ManejoFicheros.escribirFichero(rutaCompletaWindows,"Primera línea texto");

        ManejoFicheros.actualizarFichero(rutaCompletaWindows,"Segunda línea texto\nTercera línea texto");

        ManejoFicheros.leerFichero(rutaCompletaWindows);

        ManejoFicheros.eliminarFichero(rutaCompletaWindows);

    }
}
