package Arrays;

import java.util.Arrays;

public class SmartphoneSales {

    public static void main(String[] args) {
        System.out.println();

        int [][] sales = {{1,50}, {2,40}, {1,60}, {3,40}, {6,10}};

        printMatrix(sales);

        System.out.println();

        System.out.println("salesAggr(sales) = " + Arrays.deepToString(salesAggr(sales)));





        System.out.println();
    }//psvm

    //METHODEN

    public static void printMatrix (int [][] matrix){
        for (int zeile = 0; zeile < matrix.length; zeile++) {
            for (int reihe = 0; reihe < matrix[zeile].length; reihe++) {
                System.out.print(matrix [zeile][reihe] + "\t");
            }
            System.out.println();
        }
    }//printMatrix


    public static int [][] salesAggr (int [][] matrix){
        int [][] verkaufsZahlen = new int [matrix.length][matrix[0].length];
        int sum = 0;
        int zeile = 0;
        int spalte = 0;

        while (zeile < matrix.length-1) {
            if (verkaufsZahlen[zeile][spalte] == verkaufsZahlen[zeile + 1][spalte]) {
                sum = sum + verkaufsZahlen[zeile][spalte + 1] + verkaufsZahlen[zeile + 1][spalte + 1];

            }

            zeile++;

        }





        return verkaufsZahlen;
    }//salesAggr



    //METHODEN ENDE

}//pc


