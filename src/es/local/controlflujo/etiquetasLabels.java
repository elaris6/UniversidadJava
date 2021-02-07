package es.local.controlflujo;

public class etiquetasLabels {

    public static void main(String[] args) {

        /* El uso del control de flujo mediante etiquetas o labels está totalmente
        * DESACONSEJADO, solo se explica para que se sepa interpretar en caso de
        * encontrarlo. */

        /* El uso es acompañando a las instrucciones "continue" y "break", se indica
        * el nombre de la etiqueta a la que se desea saltar.
        * De esta forma sería incluso posible romper bucles anidados. */

        inicio:
        /* No se puede poner ninguna instrucción entre la etiqueta y la estructura
         del bucle. */
        for (int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                if(i == 3 && j == 3){
                    break inicio;
                    /* Si simplemente usamos un "break" saldrá del bucle interno,
                    * pero volverá al bucle principal y seguirá con la ejecución. */
                }
                System.out.println(i + " X " + j);
            }
            System.out.println("Fin bucle anidado vuelta: "+i);
        }
    }
}
