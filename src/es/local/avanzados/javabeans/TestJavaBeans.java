package es.local.avanzados.javabeans;

public class TestJavaBeans {

    public static void main(String[] args) {

        /* Normalmente los frameworks avanzados de Java lo que harán será crear
        * los objetos sin argumentos, por ello se requieren los constructores
        * vacíos. */
        EjemploJavaBean persona = new EjemploJavaBean();

        /* Para inicializar los valores usarán los métodos set correspondientes. */
        persona.setNombre("Israel");
        persona.setApellido("Balboa");

        System.out.println("persona = " + persona);

        /* Para acceder a los valores usarán los métodos get correspondientes. */
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());

    }
}
