package es.local.practicas.peliculas.datos;

import es.local.practicas.peliculas.domain.Pelicula;
import es.local.practicas.peliculas.excepciones.AccesoDatosEx;
import es.local.practicas.peliculas.excepciones.EscrituraDatosEx;
import es.local.practicas.peliculas.excepciones.LecturaDatosEx;

import java.io.*;
import java.util.*;

public class AccesoDatosImpl implements IAccesoDatos{

    @Override
    public boolean existe(String rutaFichero) {
        /* En este caso para esta implementación no sería necesaria la gestión
         * de excepción en el método "existe", pero la podemos mantener en la
         * interfaz, por si para otro tipo de implementación (p.ej. BBDD) es
         * necesaria. */
        var fichero = new File(rutaFichero);
        return fichero.exists();
    }

    @Override
    public void borrar(String rutaFichero) throws AccesoDatosEx {

        /* En este caso el método "delete()" no lanza una excepción de forma
        * autónoma, pero podemos forzarlo añadiendo a nuestro código manualmente
        * la instrucción "throw" con la excepción deseada. */
        File fichero = new File(rutaFichero);
        try {
            if(fichero.delete()) System.out.println("Fichero películas borrado.");
            else {
                throw new AccesoDatosEx("No se ha podido borrar el fichero películas.");
            }
        } catch (AccesoDatosEx e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Pelicula> listar(String rutaFichero) throws LecturaDatosEx {

        List<Pelicula> listaPelis = new ArrayList<>();
        var fichero = new File(rutaFichero);

        try{
            var entrada = new BufferedReader(new FileReader(fichero));
            String linea = entrada.readLine();
            while (linea != null){
                listaPelis.add(new Pelicula(linea));
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (IOException exception) {
            exception.printStackTrace();
            /* Al generarse la excepción del método nativo, lanzamos también la
            * generada de forma customizada para el programa. */
            throw new LecturaDatosEx("Excepción al listar películas.\n"+exception.getMessage());
        }
        return listaPelis;
    }

    @Override
    public void grabar(String rutaFichero, Pelicula pelicula, boolean anexar) throws EscrituraDatosEx {

        var fichero = new File(rutaFichero);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(fichero,anexar));
            salida.println(pelicula.getTitulo());
            salida.close();
        } catch (IOException exception) {
            exception.printStackTrace();
            throw new EscrituraDatosEx("Excepción al grabar en fichero,\n"+exception.getMessage());
        }
    }

    @Override
    public String buscar(String rutaFichero, String titulo) throws LecturaDatosEx {

        var fichero = new File(rutaFichero);

        try{
            var entrada = new BufferedReader(new FileReader(fichero));
            String linea = entrada.readLine();
            while (linea != null){
                if (linea.equalsIgnoreCase(titulo)){
                    return linea;
                }
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (IOException exception) {
            exception.printStackTrace();
            throw new LecturaDatosEx("Excepcion al leer fichero.\n"+exception.getMessage());
        }
        return null;
    }

    @Override
    public void crear(String rutaFichero) throws AccesoDatosEx{

        File fichero = new File(rutaFichero);
        try{
            PrintWriter salida = new PrintWriter(fichero);
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new AccesoDatosEx("Excepción al crear el fichero de catáligo.\n"+e.getMessage());
        }
    }
}
