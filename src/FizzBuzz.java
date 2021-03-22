import java.util.Arrays;

public class FizzBuzz {

    //METHODEN

    public static void fizzBuzz(int zahl) {

        for (int i = 1; i <= zahl; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz, ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz, ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz, ");
            } else {
                System.out.print(i + ", ");
            }
        }

    } //Methode fizzBuzz Ende


    public static String fizzBuzzPrint(int i) {   //Erzeugt einzelne Strings
        String fizzBuzz = "";
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz = "FizzBuzz";
            } else if (i % 5 == 0) {
                fizzBuzz = "Buzz";
            } else if (i % 3 == 0) {
                fizzBuzz = "Fizz";
            } else {
                fizzBuzz = String.valueOf(i);
            }

        return fizzBuzz;

    } //Methode fizzBuzzPrint Ende

    public static String [] fizzBuzzRange(int zahl){  // neuer Array, um die Strings darin zu speichern
        String[] fizzBuzzString = new String[zahl];
        for (int i = 0; i < zahl; i++) {
            fizzBuzzString [i] = fizzBuzzPrint(i+1);
        }
        return fizzBuzzString;

    } // Methode fizzBuzzRange Ende

    public static void printWithNewLines (String[] string_array){  //Ausgabe der einzelnen Strings aus dem neuen Array
        for (int i = 0; i < string_array.length; i++) {
            System.out.print(string_array[i] + ", "); // Hier könnte schon das Ende der Methode sein
        }
        System.out.println();
        System.out.print(Arrays.toString(string_array) + ", "); // damit ich die [] in der Ausgabe sehe :)

    } //Methode printWithNewLines Ende



    //METHODEN ENDE


    public static void main(String[] args) {
        System.out.println();

        int zahl = 15;

        System.out.println("Ausgabe Methode fizzBuzz: ");
        fizzBuzz(zahl);

        System.out.println();
        System.out.println();

        System.out.println("Ausgabe Methode fizzBuzzPrint: ");
        System.out.println(fizzBuzzPrint(zahl));

        System.out.println();

        System.out.println("Ausgabe Methode fizzBuzzString mit Array: ");
        int [] arr = new int [zahl];
        System.out.println("arr.lenght = " + arr.length);
        System.out.println();

        String [] arrString = new String [zahl];
        System.out.println("String Array mit Fizz Buzz: ");

        printWithNewLines(fizzBuzzRange(zahl));


        System.out.println();

    } //psvm




}//pc
