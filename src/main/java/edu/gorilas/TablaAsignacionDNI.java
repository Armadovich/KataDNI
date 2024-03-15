package edu.gorilas;

public class TablaAsignacionDNI {




    private final char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M',
                                  'Y', 'F', 'P', 'D', 'X', 'B',
                                  'N', 'J', 'Z', 'S', 'Q', 'V',
                                   'H', 'L', 'C', 'K', 'E'
    };

    public char numberToLetter(int posicion){
        try {
            return tabla[posicion];
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            throw   new ArrayIndexOutOfBoundsException("Entero introducido fuera de los límites del diccionario de datos");
        }
    }






}
