package es.local.basicos;

public class VariablesDos {
    
    public static void main(String [] args){
        var usuario = "Isra";
        var titulo = "Estudiante";
        var union = usuario + " " + titulo;
        System.out.println(union);
        
        var i = 3;
        var j = 4;
        /* Contexto cadena. Se evalúa de izquierda a derecha.
        Si lo primero que se encuentra el compilador es una cadena, tomará el resto
        lo demás como una cadena. */
        // Se realiza la suma y luego concatena el String
        System.out.println(i + j + usuario);
        // Concatena y no realiza la suma
        System.out.println(usuario + i + j);
        /* Si se priorizan las concatenaciones agrupando con paréntesis, podemos
        hacer que el compilador evalúe en el orden que nos convenga. */
        System.out.println(usuario + (i + j));
    }
}
