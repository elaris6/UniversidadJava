package es.local.avanzados.ficherosexternos;

import java.io.*;

/* Desde Java se puede realizar cualquier tarea con ficheros externos, tales
* como: lectura, creación, modificación, eliminación... */
public class ManejoFicheros {

    /* Vamos a crear una clase de ejemplo que nos permitirá manajar ficheros
    * externos mediante métodos "static". */

    public static void crearFichero(String rutaFichero){
        /* Creamos un objeto de tipo "File" importado de "java.io".
        * Se debe indicar la ruta absoluta a la hora de crear el fichero,
        * en caso contrario, Java lo creará en el directorio raíz del
        * proyecto. */
        File fichero = new File(rutaFichero);
        try {
            /* La creación del objeto "File" no crea realmente el fichero,
            * solo crea el objeto en memoria. Para crear realmente el fichero
            * "físico" debemos escribir el fichero mediante el uso de la clase
            * "PrintWriter", creando una instancia de la misma pasando como
            * parámetro el objeto "File" creado previamente y finalmente
            * llamando al método "close" de ficha clase. */
            PrintWriter salida = new PrintWriter(fichero);
            salida.close();
            // Ahora si realmente se ha creado el fichero en el disco.

            /* La clase "PrintWriter" implementa la excepción "FileNotFoundException"
            * que al ser de tipo controlada, requiere de la implementación
            * dentro de un bloque "try catch", o de su declaración en la firma
            * del método. */

        } catch (FileNotFoundException e){
            e.printStackTrace(System.out);
        }
    }

    public static void escribirFichero(String rutaFichero, String contenido){

        File fichero = new File(rutaFichero);
        try {
            /* Al detectar que el fichero realmente existe, "PrintWriter" no lo crea,
            * sino que lo carga en memoria. Pero si lo hacemos directamente,
            * con "PrintWriter", siempre estaremos borrando el contenido previo del
            * fichero. */
            PrintWriter salida = new PrintWriter(fichero);
            /* Se puede escribir contenido como enviaríamos la información a la
            * consola de salida simplemente con los métodos "print". */

            salida.println(contenido);
            /* Cerramos el flujo de información, guardando así realmente los cambios
            * sobre el fichero "físico". */
            salida.close();

        } catch (FileNotFoundException e){
            e.printStackTrace(System.out);
        }
    }

    public static void actualizarFichero(String rutaFichero, String contenido){

        File fichero = new File(rutaFichero);
        try {
            /* Al detectar que el fichero realmente existe, "PrintWriter" no lo crea,
             * sino que lo carga en memoria.
             * Pero si lo que queremos no es sobreescribir el fichero, sino actualizarlo
             * deberemos crear un nuevo objeto para gestionar el contenido mediante
             * la clase "FileWriter".
             * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/FileWriter.html*/
            /* Usaremos el constructor que indica si vamos a anexar información al fichero. */
            PrintWriter salida = new PrintWriter(new FileWriter(fichero, true));
            /* Se puede escribir contenido como enviaríamos la información a la
             * consola de salida simplemente con los métodos "print". */
            salida.println(contenido);
            /* Cerramos el flujo de información, guardando así realmente los cambios
             * sobre el fichero "físico". */
            salida.close();

        } catch (FileNotFoundException e){
            e.printStackTrace(System.out);
        }
        /* La clase "FileWriter" puede lanzar excepción de tipo "IOException, que es
        * controlada y por lo tanto de obligada implementación. */
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void leerFichero(String rutaFichero){

        File fichero = new File(rutaFichero);
        BufferedReader entrada = null;

        try {
            /* Usaremos la clase "BufferedReader", para leer el fichero leyendo
            * líneas completas. */
            /* Podemos usar var, para simplificar el código. */
            entrada = new BufferedReader(new FileReader(fichero));
            /* Empleareamos un bucle "while" para ir leyendo línea a línea hasta
            * que devuelva "null", que es cuadno se habrá finalizado la lectura
            * del fichero. */
            var linea = entrada.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = entrada.readLine();
            }
        }
        /* "BufferedReader" lanza "FileNotFoundException" */
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /* "FileReader" lanza "IOException" */
        catch (IOException exception) {
            exception.printStackTrace();
        }
        /* Aunque hace el código un poco más largo, la forma segura de gestionar
        * el flujo abierto es cerrarlo dentro del bloque "finally", pero a su vez,
        * debemos controlar una posible excepción de tipo "IOException" del
        * método "close()", en caso de que no se hubiera podido abrir inicialmente. */
        finally {
            try {
                entrada.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }

    public static void eliminarFichero(String rutaFichero){

        File fichero = new File(rutaFichero);

        /* Para eliminar un fichero se puede usar simplemente el método
        * "delete()" sobe un objeto de tipo File. Este método devolverá
        * "true" o "false" en función de si se consigue o no el borrado. */
        if(fichero.delete()) System.out.println("Fichero borrado.");
        else System.out.println("No se ha podido borrar el fichero.");

    }
}
