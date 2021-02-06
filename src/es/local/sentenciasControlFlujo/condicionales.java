package es.local.sentenciasControlFlujo;

public class condicionales {

    public static void main(String[] args) {

        /* IF ELSE
        * Comprobaciones booleanas. */
        var condicion = true;
        //var condicion = false;
        if (condicion) {
            System.out.println("Condición verdadera");
        }
        else {
            System.out.println("Condición falsa");
        }

        /* IF ELSE IF ELSE
        * Comprobaciones booleanas. */
        var numero = 5;
        var numeroTexto = "Número desconocido";
        if (numero == 1){
            numeroTexto = "Número uno";
        }
        else if (numero == 2){
            numeroTexto = "Número dos";
        }
        else if (numero == 3){
            numeroTexto = "Número tres";
        }
        else {
            numeroTexto = "Número no encontrado";
        }
        System.out.println(numeroTexto);

        /* SWITCH
        * Comprobaciones con tipos numéricos o String. */
        var mes = 1;
        var estacion = "";
        switch (mes){
            case 1: case 2: case 12:
                estacion="Primavera";
                /* Si no se añade el "break", se siguen comprobando el resto de los casos.
                * Normalmente siempre deberemos añadir el "break". */
                break;
            case 3: case 4: case 5:
                estacion="Febrero";
                break;
            case 6: case 7: case 8:
                estacion="Verano";
                break;
            case 9: case 10: case 11:
                estacion="Otoño";
                break;
                /* La cláusula "default" no es obligatoria. */
            default:
                estacion="Estación no encontrado";
        }
        System.out.println("Estación: " + estacion);

        /* Estructura alternativa y simplificada para "switch" en la que
        el "break" está implícito. */
        mes = 2;
        estacion = switch (mes) {
            case 1, 2, 12 -> "Primavera";
            case 3, 4, 5 -> "Febrero";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Estación no encontrado";
        };
        System.out.println("Estación: " + estacion);
    }
}
