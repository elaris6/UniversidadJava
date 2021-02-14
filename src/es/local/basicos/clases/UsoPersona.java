package es.local.basicos.clases;

public class UsoPersona {

    public static void main(String[] args) {
        // Creamos una instancia de la clase "Persona", instanciamos la clase, creamos un objeto de clase
        Persona p1 = new Persona();
        
        // Asignamos valores a los atributos del objeto de la clase "Persona"
        p1.nombre = "Israel";
        p1.apellidos = "Balboa";
        
        // Invocamos el método creado de la clase "Persona", que imprime sus atributos
        p1.infoPersona();
        
        Persona p2 = new Persona();
        // Si imprimimos una instancia, lo que se muestra es su referecia de memoria.
        System.out.println("p2 = " + p2);
        /* Si se intenta acceder a un atributo no inicializado se devolverá el
        valor "null" si es un String o "0" si es un tipo primitivo. */
        p2.infoPersona();
    }
}
