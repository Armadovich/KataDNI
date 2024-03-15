package edu.gorilas;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckDNITest {


    @Test
    public void checkDNITest1() throws Exception {
        CheckDNI dni = new CheckDNI("39466058");
        assertEquals('J',dni.validatorDni());
    }

    @Test
    public void checkDNITest2() throws Exception {
        CheckDNI dni = new CheckDNI("36489574");
        assertEquals('M',dni.validatorDni());
    }

    @Test
    public void checkDNITest3() throws Exception {
        CheckDNI dni = new CheckDNI("34978548");
        assertEquals('X',dni.validatorDni());
    }

    @Test
    public void dniLenghtTest() {
        CheckDNI dni = new CheckDNI("1846684651648");
        Exception thrown = Assertions.assertThrows(Exception.class, dni::validatorDni);
        Assertions.assertEquals("Longitud de la cadena incorrecta", thrown.getMessage());
    }


}