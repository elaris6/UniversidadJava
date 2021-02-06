package com.local.basicos;

public class Operadores {

    public static void main(String[] args) {

        // OPERADORES ARITMÉTICOS + - * / %

        // Con "var" no está permitido declarar varias variables en la misma línea
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado = " + resultado);

        // OPERADORES DE ASIGNACIÓN = += -= *= /= %=
        
        int c = a + 5 - b;
        System.out.println("c = " + c);

        a += 1; // equivale a: a = a + 1;

        // OPERADORES UNARIOS - ! pre++ pos++ pre-- pos--

        var d = -a; // cambio de signo
        var bool = !false; // negación para booleanos
        var e = 3;
        /* preincremento. Primero se incrementa la variable y luego se asigna a la variable f. e quedaría incrementada
        * y f tomaría el valor ya incrementado. */
        var f = ++e;
        /* postincremento. Primero se usa el valor de la variable y luego se incrementa. g quedaría incrementada,
        * pero h toma el valor previo al incremento. */
        var g = 2;
        var h = g++;

        // OPERADORES DE IGUALDAD Y RELACIONALES == != .equals() < > <= >=

        bool = (a == b);
        bool = a != b; // los paréntesis son opcionales en este caso
        System.out.println("bool = " + bool);

        String cad1 = "hola", cad2 = "hola";
        int iguales = cad1.compareTo(cad2); // esto devolvería "0" porque se compara el valor de las cadenas.
        System.out.println("iguales = " + iguales);
        bool = cad1.equals(cad2); // esto devolvería "true" porque si se compara el contenido de las cadenas.
        System.out.println("bool = " + bool);
        bool = cad1 == cad2; // esto devuelve "true" ¿?

        bool = a < b;
        bool = a >= b;
        
        // OPERADORES LOGICOS O CONDICIONALES && & || |

        /* La diferencia entre el operador simple y el doble es que con el simple evaluará todas las expresiones
        * aunque ya se haya podido resolver el valor lógico, y con el doble dejará de evaluar si ya se ha resuelto. */
        
        var cond1 = a >= 0 && a <= 10;
        var cond2 = b >= 0 || b <= 10;
        
        // OPERADOR TERNARIO

        /* Es una simplificación para la estructura if else
        *
        * La sintaxis es: condiciónEvaluar ? sentenciaSiVerdadero : sentenciaSiFalso ;*/
        
        var res = 3 > 2 ? "verdadero" : "falso" ;
        System.out.println("res = " + res);

        var numero = 7;
        res = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("res = " + res);

        // PRIORIDAD OPERADORES

        // https://www.arkaitzgarro.com/java/capitulo-4.html

        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        /* z = 16 porque a x primero lo incrementa y luego usa el valor, pero para y primero usa el valor
        * y luego lo incrementa. */
        /* En cuanto a prioridad, primero se evalúan los operadores unarios y luego el aritmético. */

    }
}
