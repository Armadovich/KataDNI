package edu.gorilas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TablaAsignacionDNITest {

    private TablaAsignacionDNI tablaAsignacion = new TablaAsignacionDNI();
    @Test
    public void testLetraAsignada1(){
        assertEquals('X',tablaAsignacion.numberToLetter(10));
    }

    @Test
    public void testLetraAsignada2(){
        assertEquals('Q',tablaAsignacion.numberToLetter(16));
    }

    @Test
    public void testLetraAsignada3(){
        assertEquals('G',tablaAsignacion.numberToLetter(4));
    }



}
