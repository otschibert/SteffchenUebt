package Arrays;

import java.util.Arrays;

public class Mittelwerte2DArray {

    public static void main(String[] args) {
        System.out.println ();

        float [][] doubleArray = {{1,1,1,1}, {2,2,2,2}, {3,3,3,3}, {4,4,4,4}};

        printMatrix(doubleArray);

        System.out.println();

        System.out.println("Arrays.toString(newArray(doubleArray)) = " + Arrays.toString(newArray(doubleArray)));





        System.out.println();
    }//psvm

    //METHODEN

    public static void printMatrix (float [][] matrix){
        for (int zeile = 0; zeile < matrix.length; zeile++) {
            for (int reihe = 0; reihe < matrix.length; reihe++) {
                System.out.print(matrix [zeile][reihe] + "\t");
            }
            System.out.println();
        }
    }//printMatrix


    public static float [] newArray (float[][] doubleArray){
        float [] newArr = new float[doubleArray.length];
        float sum = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                sum = sum + doubleArray[i][j];
                newArr[i] = sum / doubleArray[i].length;
            }
            sum = 0;
        }
        return newArr;
    }//newArray


    //METHODEN ENDE
}//pc
