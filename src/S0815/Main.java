package S0815;

public class Main {

    public static void main(String[] args) {

        PiValue pi = () -> 3.1415;

        double value = pi.getPiValue();

        System.out.println("The Pi value is: " + value);


    }
}
