package es.local.basicos;

import es.local.herencia.clases.*;

public class Matrices {

    public static void main(String[] args) {

        /* MATRICES */

        /* Una matriz es un array de arrays, creando una estructura simulada de filas y columnas.
        * Todas las reglas aplicadas a un array unidimensional, aplican a cada uno de los arrays
        * que componen la matriz.
        * Se podría incluso añadir complejidad añadiendo más dimensiones, añadiendo más arrays. */

        int edades[][] = new int[3][2];
        //int edades[][][] = new int[3][3][3];

        /* La sintaxis de inicialización simplificada también se puede usar con matrices.
        * La matriz definidas de esta forma no tiene porque ser cuadrada. */

        String frutas[][] = { {"naranja","limón"} , {"plátano","banana"} , {"piña","coco"} };


        /* Para acceder a cada uno de los elementos debemos indicar los índices de cada array
        * a modo de coordenadas. */
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 4;
        edades[1][1] = 9;
        edades[2][0] = 6;
        edades[2][1] = 8;

        System.out.println("edades[2][0] = " + edades[2][0]+"\n");

        /* Para iterar cada uno de los elementos deberemos iterar cada dimensión con un ciclo
        * FOR, creando ciclos FOR anidados.
        * El límite del contador de los bucles internos lo define la propiedad "length" de cada
        * uno de los arrays. Por ejemplo "matriz[fila].length" ó "matriz3D[fila][columna].length" */

        for(int i = 0;i < edades.length;i++){
            for(int j=0; j < edades[i].length; j++){
                System.out.println("edades["+i+"]["+j+"] = " + edades[i][j]);
            }
        }

        /* Al igual que con arrays, en las matrices se pueden almacenar Objetos, así como tipos
        * primitivos.  */

        Persona personas[][] = new Persona[2][3];

        personas[0][0] = new Persona("Isra");
        personas[0][1] = new Persona("Mari");
        personas[1][0] = new Persona("Alicia");
        personas[1][1] = new Persona("Natalia");

        imprimeMatriz(personas);
        


    }

    /* Creamos un método que imprime en consola cualquier matriz bidimensional. */
    public static void imprimeMatriz(Object matriz[][]){

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("matriz["+i+"]["+j+"] = "+matriz[i][j]);
            }
        }

    }

}
