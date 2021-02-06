package es.local.clases;

public class UsoAritmetica {

    public static void main(String[] args) {

        Aritmetica a1 = new Aritmetica();
        /* Usamos el método creado que imprime el resultado de la suma de los atributos
        de la instancia.
        El método imprimirá 0 como valor de la suma al no haber inicializado los
        atributos */
        a1.sumar();
        // Inicializamos los atributos
        a1.a = 6;
        a1.b = 5;
        // Una vez inicializados, el método imprimirá el valor de la suma
        a1.sumar();

        /* En este caso almacenamos el retorno de un método en una variable. */
        var resultado = a1.getSuma();
        System.out.println("resultado = " + resultado);
        
        /* Usamos el método que permite pasar parámetros. */
        resultado = a1.getSuma(3,4);
        System.out.println("resultado = " + resultado);

        /* Usamos el constructor que permite parámetros */
        Aritmetica a2 = new Aritmetica(7,9);
        a2.sumar();
    }
}
