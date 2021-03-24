package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ExamplesWithArray {

    //METHODEN

    // TODO 1: Write a method, finding and returning the smallest number
    public static int findSmallestNumber(int[] arr){
        int keep = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < keep) {
                keep = arr[i];
            }
        }
        return keep;
    }//findSmallestNumber

    // TODO 2: Write a method, finding and returning the biggest number
    public static int findBiggestNumber(int[] arr){
        int keep = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > keep) {
                keep = arr[i];
            }
        }
        return keep;
    }//findBiggestNumber


    // TODO 3: Write a method, calculating and returning the sum of all numbers with a while loop
    public static double calcSum (int [] arr){
        int counter = 0;
        double sum = 0;
        while (counter <= arr.length - 1){
            sum = sum + arr[counter];
            counter ++;
        }
        return sum;
    }//calcSum

    // TODO 4: Write a method, calculating and returning the average over all numbers
    public static double averageAllNumbers (int [] arr){
        double average = calcSum(arr) / arr.length;
        return average;
    }//averageAllNumbers
    

    // TODO 5 (complicated): Write a method, which returns an array with duplicated numbers (81, 51)
    public static int [] duplicatedNumbers (int [] arr){
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                        counter ++;
                        j = arr.length;
                }
            }
        }
        int [] duplicates = new int[counter];
        int counter2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    duplicates[counter2] = arr[i];
                    counter2 ++;
                    j = arr.length;
                }
            }
        }
    return duplicates;
    }//duplicatedNumbers


    // TODO 6: Write a method, to calculate the average over all values (think about datatype)
    

    // TODO 7: Write a method, which replaces one number by a new new number => public static void replace(int searchNumber, int newNumber)
    
    public static void replace (int [] arr, int searchNumber, int newNumber){
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == searchNumber){
                arr[i] = newNumber;
                System.out.println(Arrays.toString(arr));
                i = arr.length;
            }
        }
    }//replace


    // TODO 8 (complicated): Write a method which extends an array by one number. You need to create a new array with a length + 1 and copy existing values to array and add the new number at end
    public static int [] extended (int [] arr, int newNumber){
        int [] newarr = new int [arr.length + 1];
        int counter = 0;
        while (counter <= arr.length -1){
            newarr[counter] = arr[counter];
            counter ++;
        }
        newarr[counter] = newNumber;
        System.out.println(Arrays.toString(newarr));
    return newarr;
    }//extended

    //METHODEN ENDE

    public static void main(String[] args) {
        System.out.println();


        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8, 0};
        

        System.out.println("arr.length = " + arr.length);
        System.out.println();
        System.out.println("findSmallestNumber(arr) = " + findSmallestNumber(arr));
        System.out.println();
        System.out.println("findBiggestNumber(arr) = " + findBiggestNumber(arr));
        System.out.println();
        System.out.println("calcSum() = " + calcSum(arr));
        System.out.println();
        System.out.println("averageAllNumbers() = " + averageAllNumbers(arr));
        System.out.println();
        System.out.println("Duplikate sind: " + Arrays.toString(duplicatedNumbers(arr)));
        System.out.println();
        System.out.println("Array mit getauschter Nummer: ");
        replace(arr, 111, 333);
        System.out.println();
        System.out.println("Array mit zusätzlicher Nummer: ");
        extended(arr, 33);



        
        


    }//psvm


}//pc

