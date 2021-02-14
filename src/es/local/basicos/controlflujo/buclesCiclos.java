package es.local.basicos.controlflujo;

public class buclesCiclos {

    public static void main(String[] args) {

        /* BREAK. Puede usarse la instrucción "break" para romper el ciclo
         en cualquier momento si se comple algúna condición buscada. El código
          saldrá del bucle. */
        /* CONTINUE. Puede usarse la instrucción "continue" en cualquier punto
        * del código interno del bucle, para ignorar el resto del código del
        * bloque e ir de nuevo a evaluar la condición. */

        /* WHILE */
        var contador = 0;
        /* Si la condición no se cumple en la primera iteración,
         el bloque de código no se ejecutará nunca. */
        while (contador < 5) {
            System.out.println("contador = " + contador);
            contador++;
        }

        /* DO WHILE */
        /* En la estructura DO WHILE el bloque de código se
        * ejecutará siempre al menos una vez, pues la condición
        * está tras el bloque a ejecutar. */
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 5);

        /* FOR */
        /* Se le denomina como blucle determinado porque a priori se podría
        * intuir el número de repeticiones que realizará el bucle.
        * A deferencia de los bucles WHILE y DO WHILE, la condición de control
        * se modifica directamente en la estructura del bucle.
        * El iterador o contador es una variable local al bucle FOR, no se podrá
        * usar fuera. */
        for(var i = 0 ; i < 100 ; i++){
            if (i == 4){
                // Ignoramos el resto del bloque cuando el contador valga 4
                continue;
            }
            System.out.println("Vuelta: "+i);
            if ( i % 2 == 0){
                System.out.println("i = " + i + " es par");
            }
            else if (i == 11){
                // Rompemos el bucle cuando el contador valga 11
                break;
            }
        }

        /* FOR EACH */
        /* El bucle FOR EACH es un bucle en el que en lugar de un contador al uso,
        * se itera a través de un objeto que sea iterable. */
        String cadena = "Esto es una cadena";
        for (char c:cadena.toCharArray()) {
            System.out.print(c+"-");
        }
    }
}
