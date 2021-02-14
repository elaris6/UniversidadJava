package es.local.avanzados.enumeraciones;

public class ArgumentosVariables {

    public static void main(String[] args) {

        imprimeNum(1,3,5,7,9);
        imprimeNum(2,4,8,10,12,14,16,20);

        variosParametros("Esto es un string",3,5,7,9);
    }

    /* ARGUMENTOS VARIABLES */
    /* Para indicar que un método recibirá argumentos variables, la sintaxis es
    * indicar el tipo o clase del argumento, seguido por tres puntos "...", y
    * por el numbre de la variable.
    * De esta forma se resolverá en tiempo de ejecución el número de argumentos
    * recibidos, convirtiendo la el argumento en un array del tipo indicado, y
    * del tamaño resuelto en tiempo de ejecución.
    * Si se pasase un array, se debería manejar el tamaño de antemano. */

    private static void imprimeNum(int... numeros){

        /* La gestión interna es exactamente igual que si fuese un array
        * ordinario. */
        System.out.println();
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }

    /* Los argumentos variables también se pueden usar junto con otros,
    * argumentos, pero en este caso la variable de argumentos variables
    * siempre se deberá informar en último lugar. */

    private static void variosParametros(String cadena, int... numeros){

        System.out.println("\nCadena: "+cadena);
        imprimeNum(numeros);
    }

    /* NO se pueden usar varios argumentos de longitud variable en el mismo
    * método.
    private static void muchosParametros(String...cadenas,int...numeros){

    }*/
}
