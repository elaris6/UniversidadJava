package es.local.basicos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ObtenerFechaActual {

    public static void main(String[] args) {

        System.out.println(getFechaActual());
    }
    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }
}
