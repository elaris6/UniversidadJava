package es.local.basicos.clases;

public class UsoThis {

    public static void main(String[] args) {
        Personas p1 = new Personas("Mari","Cuesta");
        System.out.println(p1);
        System.out.println(p1.nombre+" "+p1.apellido);

    }
}

class Personas {
    String nombre;
    String apellido;

    Personas (String nombre, String apellido) {

        /* Aunque no lo veamos, al crear un objeto de una clase, hay una llamada
        * implícita al constructor de la clase padre, en este caso "Object". Si
        * la llamada estuviese escrita sería simplemente "super();". Esta línea
        * sería la primera del constructor y es quien se encarga de reservar el
        * espacio en memoria. */

        this.nombre = nombre;
        this.apellido = apellido;
        /* Al usar la palabra reservada "this" dentro de una clase, lo que hacemos
        * es hacer referencia al objeto que se esté manejando en el momento en el
        * que se lea ese fragmento de código. */
        /* Aquí ya podemos conocer el espacio reservado de memoria, porque se ha
        * encargado de ello el constructor de la clase "Object". */
        System.out.println("Persona desde constructor: "+this);
        new ImprimirPersonas().imprimir(this);
    }
}

class ImprimirPersonas {

    /* El constructor vacío por defecto no es necesario indicarlo si no lo vamos
    * a usar, pero se crea aunque no lo veamos, y en él se llama al constructor
    * de la clase padre (Object), que será el encargado de reservar el espacio
    * en la memoria HEAP para el objeto que estamos creando. */
    public ImprimirPersonas(){
        super();
    }

    public void imprimir(Personas p){
        /* Esta línea lo que imprimirá es el objeto (su referencia de memoria)
        * que se ha pasado como parámetro desde el constructor de "Personas". */
        System.out.println("Persona desde imprimir: "+p);
        /* En cambio si usamos "this" aquí, lo que estaremos referenciando es
        * el objeto "ImprimirPersonas" que es lo que representa en ese momento
        * de ejecución el objeto "this". */
        System.out.println("Impresión del objeto actual (this): "+this);
    }
}
