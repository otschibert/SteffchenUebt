public class MultiplesOf3And5 {

    // METHODEN


    // METHODEN ENDE

    public static void main(String[] args) {
        System.out.println();

        int counter = 1;
        int summe = 0;

        while (counter < 1000) {
            if (counter % 3 == 0 || counter % 5 == 0) {
                System.out.print(counter + " ,");
                summe = summe + counter;
            }
            counter ++;
        }

        System.out.println();
        System.out.println("Die Summe beträgt: " + summe);





        System.out.println();
    }
}
