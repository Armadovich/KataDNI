package edu.gorilas;

public class TablaAsignacionDNI {




    private final char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M',
                                  'Y', 'F', 'P', 'D', 'X', 'B',
                                  'N', 'J', 'Z', 'S', 'Q', 'V',
                                   'H', 'L', 'C', 'K', 'E'
    };

    char numberToLetter(int posicion){
        return tabla[posicion];
    }




}
