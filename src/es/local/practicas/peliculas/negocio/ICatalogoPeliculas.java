package es.local.practicas.peliculas.negocio;

public interface ICatalogoPeliculas {

    /* En esta interfaz se definiría el comportamiento de la capa de negocio,
    * que debe separarse siempre que sea posible de la capa técnica en la que
    * se realizarán las interacciones con ficheros, BBDD, web services... */

    String RUTA_FICHERO = "C:\\CODE\\Java\\UniversidadJava\\UniversidadJava\\src\\es\\local\\practicas\\peliculas\\peliculas.txt";

    void agregarPelicula(String titulo);

    void listaPeliculas();

    void buscarPelicula(String titulo);

    void iniciarFichero();

}
