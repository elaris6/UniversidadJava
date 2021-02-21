package es.local.practicas.peliculas.presentacion;

import es.local.practicas.peliculas.negocio.CatalogoPeliculas;

import java.util.Scanner;

public class UsoPeliculas {

    public static void main(String[] args) {

        /* BAJO ACOPLAMIENTO Y ALTA COHESTION */

        /* Se busca el objetivo de conseguir un bajo acoplamiento. Es decir, que no haya
        * comunicación entre capas no adyacentes a nivel lógico. Por ejemplo, la capa de
        * presentación no debe interactuar directamente con la capa de acceso a datos.
        * Por lo tanto desde la capa de presentación, no sabremos nada de la clase
        * "AccesoDatosImpl". */

        /* Alta cohesión significa que cada capa se encarga de realizar su función y no
        * se realizan tareas que deban corresponder a otras capas. */
        var catalogo = new CatalogoPeliculas();
        int opcion;

        catalogo.iniciarFichero();
        Scanner entrada = new Scanner(System.in);
        pintaMenu();
        opcion = Integer.parseInt(entrada.nextLine());
        while (opcion != 0){

            if (opcion == 1){
                catalogo.iniciarFichero();
            } else if (opcion == 2){
                System.out.print("Introduce el título de la película a agregar: ");
                String titulo = entrada.nextLine();
                catalogo.agregarPelicula(titulo);
            } else if (opcion == 3){
                System.out.println("Listado películas catálogo:");
                catalogo.listaPeliculas();
            } else if (opcion == 4){
                System.out.print("Introduce el título de la película a buscar: ");
                String titulo = entrada.nextLine();
                catalogo.buscarPelicula(titulo);
            } else System.out.println("Opción incorrecta");

            pintaMenu();
            opcion = Integer.parseInt(entrada.nextLine());
        }
    }

    public static void pintaMenu(){
        System.out.println("\n1. INICIAR CATALOGO PELICULAS");
        System.out.println("2. AGREGAR PELICULA");
        System.out.println("3. LISTAR PELICULAS");
        System.out.println("4. BUSCAR PELICULA");
        System.out.println("0. SALIR");
        System.out.print("\nElige una opción: ");
    }
}
