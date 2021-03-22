import java.util.Arrays;

public class UebungArray {

    // METHODEN

    public static void arrangeOrder(int[] zahlenArray) {

        System.out.println("Arraylänge = " + zahlenArray.length);

        boolean hasChanged = true;

        while(hasChanged == true){
            hasChanged = false;

            for (int i = 0; i < zahlenArray.length -1; i++) {
                if (zahlenArray[i] > zahlenArray[i+1]) {
                    hasChanged = true;
                    int keep = zahlenArray[i];
                    zahlenArray[i] = zahlenArray[i+1];
                    zahlenArray[i+1] = keep;
                }
            }
        }

    } // Methode arrangeOrder ENDE




    //METHODEN ENDE

    public static void main(String[] args) {
        System.out.println();

        int [] zahlenArray = new int[5];
        zahlenArray[0] = 8;
        zahlenArray[1] = 5;
        zahlenArray[2] = 1;
        zahlenArray[3] = 9;
        zahlenArray[4] = 0;

        arrangeOrder(zahlenArray);

        System.out.println();

        System.out.println("Sortierte Zahlen: " + Arrays.toString(zahlenArray));


    } //psvm
} // pc


