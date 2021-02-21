package es.local.practicas.peliculas.datos;

import es.local.practicas.peliculas.domain.Pelicula;
import es.local.practicas.peliculas.excepciones.AccesoDatosEx;
import es.local.practicas.peliculas.excepciones.EscrituraDatosEx;
import es.local.practicas.peliculas.excepciones.LecturaDatosEx;

import java.util.List;

public interface IAccesoDatos {

    /* Esta interfaz será la encargada de definir la capa técnica de acceso
    * a datos de la aplicación, y siempre que sea posible habrá que separarla
    * de la capa de lógica de negocio que deberá ser agnóstica a esas cuestiones
    * técnicas de acceso a datos o procesos no directamente relacionados con
    * el negocio.
    * Se incluye también la posible excepción que nos encontraríamos. */

    boolean existe(String rutaFichero) throws AccesoDatosEx;

    List<Pelicula> listar(String rutaFichero) throws LecturaDatosEx;

    void grabar(String rutaFichero, Pelicula pelicula, boolean anexar) throws EscrituraDatosEx;

    String buscar(String rutaFichero,String titulo) throws LecturaDatosEx;

    void crear(String rutaFichero) throws AccesoDatosEx;

    void borrar(String rutaFichero) throws AccesoDatosEx;
}
