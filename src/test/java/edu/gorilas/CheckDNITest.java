package edu.gorilas;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckDNITest {


    @Test
    public void checkDNITest(){
        CheckDNI dni = new CheckDNI("39466058");
        assertEquals('J',dni.validatorDni());
    }

}