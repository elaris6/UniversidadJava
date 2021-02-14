package es.local.avanzados.polimorfismo;

public enum TipoLiteratura {

    CLASICA("Literatura clásica"),
    NOVELA("Literatura novelesca"),
    FICCION("Literatura de ficción"),
    TECNICA("Libros técnicos");


    private String descLiteratura;

    private TipoLiteratura(String descLiteratura){
        this.descLiteratura = descLiteratura;
    }

    public String getDescLiteratura() {
        return this.descLiteratura;
    }
}
