package es.local.basicos.clases.contextoestatico;

/* CONTEXTO STATIC */

/* Los atributos o métodos sobre los que se aplique el modificador
* "static", hacen referencia a la propia clase, y son compartidos
* por todas las instancias de esa clase, pero no pertenecen a los
* objetos, sino a la propia clase.
* En el momento de crearse las clases están en el contexto estático
* y cuando ya se han cargado en memoria y podemos crear instancias
* pasan a crearse también en el contexto dinámico.
* Desde el contexto estático no se puede acceder al dinámico, pero
* desde el dinámico si se puede acceder al estático.
* Para acceder desde el contexto dinámico al estático, se deberá
* invocar al atributo o método estático precediéndolo del nombre de
* la clase a la que pertenezca, pues no pertenece a las instancias
* de dicha clase. */

public class PersonaStatic {

    private int idPersona;
    private String nombre;

    /* Se crea un atributo estático que pertenecerá a la clase y no
    * a sus instancias.
    * Si no fuese "static", un atributo de este tipo como un "id" que
    * queramos mantener común a todos los objetos no sería posible,
    * porque se crearía uno específico para cada objeto y se iniciaría
    * siempre al instanciar la clase de nuevo. */
    private static int contadorId;

    public PersonaStatic (String nombre){
        this.nombre = nombre;

        /* En el constructor de la clase invocaremos al atributo "static"
        * pero para ello no se debe usar el identificador "this", pues no
        * está asociado al objeto o instancia que se está creando, sino
        * a la propia clase. Es posible, pero no se debe hacer.
        * Podemos referenciarlo sin nada delante o con el nombre de la
        * clase delante (esto es la buena práctica). */
        PersonaStatic.contadorId++;
        this.idPersona = contadorId;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        PersonaStatic.contadorId = contadorId;
    }

    /* Si generamos la polimorfismo del método "toString()" con el IDE,
    * se agrega lo que se denomina una "notación", que en este caso indica
    * que estamos sobreescribiendo un método heredado. */
    @Override
    public String toString() {
        /* Por defecto no se generan para el "toString()" los atributos de
        * tipo "static", aunque podríamos hacerlo manualmente. */
        return "PersonaStatic{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
