package es.local.practicas.peliculas.negocio;

import es.local.practicas.peliculas.datos.*;
import es.local.practicas.peliculas.domain.Pelicula;
import es.local.practicas.peliculas.excepciones.*;


import java.util.List;

public class CatalogoPeliculas implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculas(){

        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String titulo) {
        boolean anexar = false;
        try{
            anexar = datos.existe(ICatalogoPeliculas.RUTA_FICHERO);
            this.datos.grabar(ICatalogoPeliculas.RUTA_FICHERO,new Pelicula(titulo),anexar);
            System.out.println("Película grabada en el catálogo.");
        }  catch (AccesoDatosEx accesoDatosEx) {
            accesoDatosEx.printStackTrace(System.out);
        }
    }

    @Override
    public void listaPeliculas() {
        try{
            List<Pelicula> listaPelis = this.datos.listar(ICatalogoPeliculas.RUTA_FICHERO);
            if(listaPelis.get(0) != null){
                listaPelis.forEach(System.out::println);
            }
            else {
                System.out.println("El catálogo está vacío.");
            }
        } catch (LecturaDatosEx e){
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String titulo) {
        try{
            String encontrada = this.datos.buscar(ICatalogoPeliculas.RUTA_FICHERO, titulo);
            if(encontrada != null){
                System.out.println(new Pelicula(encontrada));
            }
            else System.out.println("Película no encontrada en catálogo.");
        } catch (LecturaDatosEx e){
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void iniciarFichero() {
        try{
            if (!this.datos.existe(ICatalogoPeliculas.RUTA_FICHERO)){
                this.datos.crear(ICatalogoPeliculas.RUTA_FICHERO);
                System.out.println("Nuevo catálogo iniciado.");
            }
            else System.out.println("Catálogo iniciado.");
        } catch (AccesoDatosEx e) {
            e.printStackTrace(System.out);
        }
    }
}
