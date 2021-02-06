package es.local.clases;

public class ejCaja {

    public static void main(String[] args) {

        Caja c1 = new Caja();
        c1.alto = 3;
        c1.ancho = 4;
        c1.profundo = 2;
        System.out.println("El volumen de la caja es: "+c1.getVolumen());

        Caja c2 = new Caja(5,3,7);
        System.out.println("El volumen de la caja es: "+c2.getVolumen());
    }
}

class Caja {

    int alto, ancho, profundo;

    public Caja(){
    }

    public Caja(int alto, int ancho, int profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public int getVolumen(){
        return this.alto * this.ancho * this.profundo;
    }

}
