package es.local.avanzados.bloquesinicializacion;

public class UsoBloquesInicializacion {

    public static void main(String[] args) {

        ClaseEjemplo objeto1;

        ClaseEjemplo objeto2 = new ClaseEjemplo();
        System.out.println(objeto2.getIdClase());

        objeto1 = new ClaseEjemplo();
        System.out.println(objeto1.getIdClase());
    }
}
