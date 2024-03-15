package edu.gorilas;

/**
 * Hello world!
 *
 */
public class CheckDNI
{


    private final String dniNumbers;
    TablaAsignacionDNI tabla = new TablaAsignacionDNI();

    public CheckDNI() {
        this.dniNumbers = "";
    }

    public CheckDNI(String dniNumbers) {
        this.dniNumbers = dniNumbers;
    }


    public char validatorDni() throws Exception {

        if (checkDniNumbersLenght(dniNumbers)){
            return tabla.numberToLetter(getNumber(dniNumbers));
        }

        throw new Exception("Longitud de la cadena incorrecta");

    }

    private int getNumber(String numbers){
        return Integer.parseInt(numbers)%23;
    }

    public boolean checkDniNumbersLenght(String numbers){
        return numbers.length() == 8;
    }




    @Override
    public String toString() {
        return "CheckDNI{" +
                "dniNumbers='" + dniNumbers + '\'' +
                ", tabla=" + tabla +
                '}';
    }



}
