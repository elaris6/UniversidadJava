package es.local.avanzados.modificadoresacceso.paquete1;

public class UsoClasesModificadores {

    public static void main(String[] args) {

        Clase1Default c1 = new Clase1Default();
        c1.atribDefault = "valor nuevo";
        c1.motodoDefault();
        System.out.println("c1 = " + c1);
        
        ClaseHijaClase1Default c11 = new ClaseHijaClase1Default();
        c11.atribDefault = "valorito nuevo";
        c11.motodoDefault();
        System.out.println("Clase hija de Clase1Default = " + c11);
        
        ClaseHijaClase1Private c111 = new ClaseHijaClase1Private();
        System.out.println("Clase hija de Clase1Private = " + c111);
        
    }
}
