package com.local.basicos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        /*
        Tipos primitivos enteros: byte, short, int, long.
        Por defecto en Java los enteros son de tipo int.
        */

        // BYTE
        System.out.println("Valor mínimo de un tipo byte: "+Byte.MIN_VALUE);
        System.out.println("Valor máximo de un tipo byte: "+Byte.MAX_VALUE);
        // Perdemos precisión al hacer la conversión
        byte numByte = (byte) 129;
        System.out.println("numByte = " + numByte);

        // SHORT
        System.out.println("Valor mínimo de un tipo short: "+Short.MIN_VALUE);
        System.out.println("Valor máximo de un tipo short: "+Short.MAX_VALUE);
        // Perdemos precisión al hacer la conversión y en este caso es más grave
        short numShort = (short) 35000;
        System.out.println("numShort = " + numShort);

        // INT
        System.out.println("Valor mínimo de un tipo int: "+Integer.MIN_VALUE);
        System.out.println("Valor máximo de un tipo int: "+Integer.MAX_VALUE);
        /* En este caso ni siquiera nos dejaría pasarnos de valor, porque para indicar
        * un número superior a lo que admite un int, se requiere una notación específica
        * informando el caracter "L" tras el valor. */
        int numInt = (int) 2147483649L;
        System.out.println("numInt = " + numInt);

        // LONG
        System.out.println("Valor mínimo de un tipo long: "+Long.MIN_VALUE);
        System.out.println("Valor máximo de un tipo long: "+Long.MAX_VALUE);
        /* Al igual que para los int, si para los long indicamos un valor superior a lo
        * permitido por la notación, se requiere informar en la notación una que admita
        * un valor superior al de un long. por ejemplo, F = float o D = Double. */
        long numLong = (long) 9223372036854775809F;
        System.out.println("numLong = " + numLong);

        /*
            Tipos primitivos de tipo flotante: float y double.
            Son capaces de almacenar valores muy elevados al trabajar no contación exponencial.
            Por defecto en Java los decimales son de tipo double.
        */

        // FLOAT
        /* Podemos asingar un valor con la notación específica de float "F",
        * o hacer un casting a float sobre un decimal, que será por defecto
        * double. */
        float numFloat1 = 10.0F;
        System.out.println("numFloat1 = " + numFloat1);
        float numFloat2 = (float) 11.0;
        System.out.println("numFloat2 = " + numFloat2);

        System.out.println("Valor mínimo de un tipo float: "+Float.MIN_VALUE);
        System.out.println("Valor máximo de un tipo float: "+Float.MAX_VALUE);

        /* Igual que pasaba para los enteros, si queremos asignar a una variable
        * de tipo float, un valor superior a lo que admite, deberemos hacer un
        * casting e informar el valor con una notación de un tipo que permita 
        * ese valor superior (en este caso double "D"). */
        float numFloat3 = (float) 3.4028236E38D;
        System.out.println("numFloat3 = " + numFloat3);

        // DOUBLE
        /* En este caso, al ser el tipo primitivo que almacena los valores más
        * elevados, no es posible tratar de almacenar uno superior perdiendo
        * precisión. */
        /* Aunque no se indiquen los decimales al asignar valor, éste se tratará
        * como un decimal. */
        double numDo = 10;
        System.out.println("numDo = " + numDo);
        System.out.println("Valor mínimo de un tipo double: "+Double.MIN_VALUE);
        System.out.println("Valor máximo de un tipo double: "+Double.MAX_VALUE);


        /*
            Tipo primitivo char.
            Lista UNICODE de caracteres: https://en.wikipedia.org/wiki/List_of_Unicode_characters
        */

        /* Se puede asignar como valor directamente un símbolo de caracter.
        * Se podría utilizar "var" pues el compilador inferirá el tipo correctamente. */
        char varChar1 = '!';
        System.out.println("varChar1 = " + varChar1);

        /* Para representar caracteres con los códigos UNICODE se debe indicar el código, precedido
        * de la cadena "\ u" (junto).
        * Se podría utilizar "var" pues el compilador inferirá el tipo correctamente. */

        char varChar2 = '\u0021';
        System.out.println("varChar2 = " + varChar2);

        /* También se puede directamente indicar el código decimal asociado al valor unicode.
        * No podemos usar "var" porque el compilador tomaría el número como un int. Para ello
        * sería necesario hacer un casting (var variable = (char) 33;) */
        char varChar3 = 33;
        System.out.println("varChar3 = " + varChar3);

        /* Se puede asignar un caracter a una variable de tipo int, pero el compilador lo que tomará
        * será su valor decimal. */
        int varChar4 = '!';
        System.out.println("varChar4 = " + varChar4);


        /* BOOLEAN */

        /* También se les conoce como tipo bandera. */
        boolean varBoolean = true; // true / false
        System.out.println("varBoolean = " + varBoolean);
        // Ejemplo de inferencia de tipos
        var edad=30;
        var esAdulto = edad >= 18;
        System.out.println("esAdulto = " + esAdulto);
        

    }
}
