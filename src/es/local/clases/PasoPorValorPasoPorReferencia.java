package es.local.clases;

public class PasoPorValorPasoPorReferencia {

    public static void main(String[] args) {
        
        /* PASO POR VALOR */
        
        /* El paso por valor solo aplica a los tipos primitivos. Éstos pasan una copia de su valor
         * a los demás métodos. */
        var x = 10;
        System.out.println("x = " + x);
        cambioValor(x);

        /* La variable local sigue valiendo lo mismo, pues dentro del método solo se trabajaba
        * con otra variable local, que recibe una copia del valor del parámetro. */
        System.out.println("x nuevo valor = " + x);
        
        /* PASO POR REFERENCIA */
        
        /* Al usar un objeto como parámetro, lo que realmente estaremos haciendo es pasar ese
        * objeto por referencia, indicando su posición en la memoria. */
        Persona p1 = new Persona();
        p1.nombre = "Mari";
        cambiaPersona(p1);

        /* La variable local al ser de tipo Object, está apuntando a la generada en la memoria
        * HEAP, y como esta referencia de memoria ha sido la usada desde el método, realmente
        * si estamos modificadno el objeto pasado por parámetro. */
        System.out.println("p1.nombre = " + p1.nombre);
    }
    
    public static void cambioValor(int arg1){
        /* Lo que se recibe en el argumento "arg1" es una copia del valor de la variable local "x" */
        System.out.println("arg1 = " + arg1);
        /* Por lo que si se modifica la variable local "arg1", no tiene afectación nincuna en la
         * variable "x". */
        arg1 = 15;
    }
    
    public static void cambiaPersona(Persona p){
        /* Lo que se recibe como argumento es la referencia de memoria HEAP del objeto pasado
        * como parámetro, y se crea una variable local al método, pero que apunta al mismo
        * objeto que la variable local del método invocador. */
        System.out.println("p.nombre = " + p.nombre);
        /* Por lo tanto, al modificar los atributos del objeto argumento, realmente estamos
        * modificando el objecto original en la memoria HEAP. */
        p.nombre = "Isra";
    }
}
