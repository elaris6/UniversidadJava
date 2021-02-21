package es.local.practicas.peliculas.domain;

public class Pelicula {

    /* Aplicamos las reglas para que la clase sea un JavaBean,
    * salvo implementar la interfaz "Serializable", pues para
    * este ejercicio no es necesario. */

    private String titulo;

    public Pelicula(){}

    public Pelicula(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString(){
        return "Película: " + this.getTitulo();
    }
}
