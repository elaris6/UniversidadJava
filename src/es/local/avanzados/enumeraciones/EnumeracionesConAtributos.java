package es.local.avanzados.enumeraciones;

public enum EnumeracionesConAtributos {

    /* Se pueden indicar atributos en los elementos de la enumeración,
    * informando los mismos para cada elemento. */

    AFRICA(53,"sur"),
    EUROPA(46,"norte"),
    ASIA(44,"norte"),
    AMERICA(34,"norte y sur"),
    OCEANIA(14,"sur");

    /*El último elemento debe llevar punto y coma si se van a informar más
     * código en la enumeración*/

    /* Se puede crear un constructor como si de una clase se tratase.
    * Para ello deberán crarse también las variables de los atributos
    * que serán asignadas a los elementos. */

    private final int paises;
    private final String hemisferio;

    EnumeracionesConAtributos(int paises, String hemisferio){
        this.paises = paises;
        this.hemisferio = hemisferio;
    }

    /* Si una enumeración tiene atributos, deberán crearse los getter
    * necesarios para obtenerlos. */

    public int getPaises(){
        return this.paises;
    }

    public String getHemisferio() {
        return this.hemisferio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EnumeracionesConAtributos{");
        sb.append("paises=").append(paises);
        sb.append(", hemisferio='").append(hemisferio).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
