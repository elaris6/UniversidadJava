package es.local.clases;

import es.local.clases.contextoestatico.PersonaStatic;

public class UsoStatic {

    private int num;

    /* El método "main" se define como "static" porque lo requiere el
    * compilador para ejecutar dicho método desde fuera.
    * Clase.main(); */
    public static void main(String[] args) {

        PersonaStatic p1 = new PersonaStatic("Isra");
        System.out.println("p1 = " + p1);

        PersonaStatic p2 = new PersonaStatic("Mari");
        //System.out.println("p2 = " + p2);

        /* Desde un método "static" solo podemos usar métodos "static".
        * Esto es debido a que desde el contexto estático no se puede
        * acceder al dinámico, y al no haberse creado ningún objeto de
        * la clase principal, no podríamos invocar dicho método que
        * no está aún en memoria. */
        /* Aqune no es necesario, se incluye el nombre de clase delante
        * para remarcar lo indicado. */
        UsoStatic.imprimirPersona(p2);

        /* Por la misma razón, no se puede acceder desde un método "static"
        * a atributos de clase que no sean "static", pues no existirán en
        * su contexto. */
        //num = 10; --> Error

    }

    /* Los modificadores "public" y "static" se pueden poner en cualquier
    * orden, no afecta al resultado, aunque lo habitual es indicar en primer
    * lugar el modificar de acceso. */
    static public void imprimirPersona(PersonaStatic p){
        /* Dentro de un método "static" no podemos usar la palabra reservada
        * "this", pues no tiene sentido al no existir un objeto al que
        * referenciar. Desde el contexto estático, no se puede acceder al
        * contexto dinámico. */
        System.out.println("p = " + p);
    }

    public int getNum(){
        /* Desde un método que no sea "static", se podrá acceder sin problema
        * a un atributo de clase, pues existirá dentro de su contexto al
        * instanciar la clase y crear un objeto. */
        return this.num++;
    }
}
