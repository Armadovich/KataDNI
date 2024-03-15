package edu.gorilas;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckDNITest {


    @Test
    public void checkDNITest1(){
        CheckDNI dni = new CheckDNI("39466058");
        assertEquals('J',dni.validatorDni());
    }

    @Test
    public void checkDNITest2(){
        CheckDNI dni = new CheckDNI("36489574");
        assertEquals('M',dni.validatorDni());
    }

    @Test
    public void checkDNITest3(){
        CheckDNI dni = new CheckDNI("34978548");
        assertEquals('X',dni.validatorDni());
    }

}