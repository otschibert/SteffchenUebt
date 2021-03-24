package Arrays;

import java.util.Arrays;

public class LuckyLoser {

    public static void main(String[] args) {
        System.out.println();

        String[] firstOut = {"Steff", "Paul", "Peter", "Toni"};
        String[] secondOut = {"Steff", "Maya", "Martin", "Paul", "Rosamunde"};

        System.out.println("namesTrostpreis(firstOut,secondOut) = " + Arrays.toString(namesTrostpreis(firstOut, secondOut)));

        System.out.println();
    }//psvm

    //METHODEN

    public static String [] namesTrostpreis (String [] firstOut, String [] secondOut){
        int length = 0;

        if (firstOut.length > secondOut.length){
            length = firstOut.length;
        }
        else length = secondOut.length;

        String [] namesTrostpreis = new String[length];
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (firstOut[counter].equals(secondOut[i])){
                namesTrostpreis[i] = secondOut[i];
                counter ++;
            }
        }
        return namesTrostpreis;
    }//namesTrostpreis


    //METHODEN ENDE
}//pc
