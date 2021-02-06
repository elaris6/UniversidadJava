package com.local.basicos;

/* VARIABLES 
Las buenas prácticas para nombrar variables es hacerlo en lowerCamelCase.
Las variables solo podrán comenzar por letra, guión bajo o el símbolo del
dolar y no está permitido usar caacteres especiales.
No se recomienda usar acentos, aunque está permitido. */
public class Variables {
    
    public static void main(String[] args){
        // Creamos e inicializamos una variable entera
        int variable = 10;
        System.out.println(variable);
        // Modificamos el valor de la variable
        variable = 5;
        System.out.println(variable);
        
        // String no es un tipo primitivo, es una Clase
        String cadena = "Esto es una cadena";
        System.out.println(cadena);
        
        cadena = "Modificamos la cadena";
        System.out.println(cadena);
        
        /* Podemos usar la palabra reservada "var", para que Java infiera el tipo
        de una variable en función del valor asignado.
        Esta funcionalidad se introdujo a partir de la versión 10. */
        
        var unaVariable = 23;
        System.out.println(unaVariable);
        
        var otraVariable = "Una cadena de texto";
        System.out.println("otraVariable = " + otraVariable);
        
        /* No se podrá usar "var" si no se inicializa la variable, pues Java no
        podrá inferir el tipo. No es válido iniciarla después de declararla. */
        //var variableTres; --> ERROR
                
        // Variables comenzando por guión bajo o dólar
        var _variable = 1;
        var $variable = 2;

        
    }
}
