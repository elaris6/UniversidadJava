package es.local.avanzados.interfaces;

/* INTERFACES */

/* Por convención, la nomenclatura de las "interface" debe comenzar por una letra
* "I" mayúscula para indicar que son una interfaz. */

/* Las "interface" son un tipo en Java y por lo tanto, no heredan de la clase "Object".
* Las interfaces también implementan métodos abstractos como una clase abstracta y al
* ser un tipo y no una clase, no se pueden heredar. */

/* La diferencia de uso entre una CLASE ABSTRACTA y una INTERFAZ es que la clase abstracta
* deberemos usarla cuando deseemos que nuestras clases hijas hereden unas características
* en común, y las interfaces deberán usarse cuando se desee que se "herede" un comportamiento. */

/* Las interfaces no pueden heredar de otras clases, pues no son clases, pero si pueden
* "heredar" (implementar) con la palabra reservada "implements" otras interfaces. */

public interface IAccesoDatos {

    /* Los "atributos" declarados en una interfaz serán considerados como constantes con
    * sus modificadores "public static final", aunque no se indiquen al declararlos. */
    /* Las interfaces no tienen constructores al no ser clases, por lo que todos sus
    * "atributos" constantes deberán inicializarse al declararse. */

    int MAX_REGISTROS = 10;

    /* Los métodos de una interfaz serán considerados abstractos aunque no se indiquen
    * los modificadores "public abstract", que serán implícitamente añadidos. */

    void insertar();

    void listar();

    void actualizar();

    void eliminar();


}
