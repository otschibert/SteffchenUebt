import java.util.Arrays;

public class FizzBuzzZwei {

    //METHODEN

    public static String fizzBuzzString (int zahl){
        String Buzz = "Buzz";
        String Fizz = "Fizz";
        for (int i = 1; i <= zahl; i++) {
            if (i % 2 == 0) {
                System.out.print(Buzz + ", ");
            }
            else {System.out.print(Fizz + ", ");
            }
        }
        return Buzz;
    } //Methode fizzBuzzString Ende







    //METHODEN ENDE


    public static void main(String[] args) {
        System.out.println();

        int zahl = 15;

        System.out.println();

        // fizzBuzzString(zahl);

        System.out.println();
        System.out.println();

        String [] arr = {fizzBuzzString(zahl)};








        System.out.println();
    } //psvm


}//pc

