package edu.gorilas;

/**
 * Hello world!
 *
 */
public class CheckDNI
{


    private final String dniNumbers;
    TablaAsignacionDNI tabla = new TablaAsignacionDNI();

    public CheckDNI(String dniNumbers) {
        this.dniNumbers = dniNumbers;
    }


    public char validatorDni(){
        return tabla.numberToLetter(getNumber(dniNumbers));
    }

    private int getNumber(String numbers){
        return Integer.parseInt(numbers)%23;
    }





    @Override
    public String toString() {
        return "CheckDNI{" +
                "dniNumbers='" + dniNumbers + '\'' +
                ", tabla=" + tabla +
                '}';
    }



}
