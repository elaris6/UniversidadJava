package es.local.avanzados.enumeraciones;

public class UsoEnumeraciones {

    public static void main(String[] args) {

        System.out.println(Enumeraciones.DOMINGO);
        indicaDia(Enumeraciones.MARTES);

        /* Si una enumeración tiene atributos se podrá acceder a cada
        * elemento sin más, obteniendo el String del elemento, pero
        * también podremos acceder a los atributos de los elementos
        * usando los métodos getter creados al efecto. */

        System.out.println(EnumeracionesConAtributos.EUROPA.getPaises());
        System.out.println(EnumeracionesConAtributos.EUROPA.getHemisferio());

        /* Si se sobreescribe el método "toString" de la enumeración
        * se podrá conseguir una salida específica al invocar el elemento
        * sin más. */
        System.out.println(EnumeracionesConAtributos.EUROPA);
    }

    private static void indicaDia(Enumeraciones dias){
        switch (dias) {
            case LUNES -> System.out.println("Hoy es lunes");
            case MARTES -> System.out.println("Hoy es martes");
            case MIERCOLES -> System.out.println("Hoy es miércoles");
        }
    }
}
