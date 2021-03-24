package Arrays;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        System.out.println();

        int [] arr = {3,7,55,2,99,3,1,7,55};

        printArray(arr);
        System.out.println();
        System.out.println("containsNumber(arr, 3) = " + containsNumber(arr, 3));
        System.out.println("containsNumber(arr, 4) = " + containsNumber(arr, 4));
        System.out.println();
        System.out.println("calculateSum(arr) = " + calculateSum(arr));
        System.out.println();
        printArray(arr);
        System.out.println();
        System.out.println("reverse(arr) = " + Arrays.toString(reverse(arr)));



        System.out.println();
    }//psvm


//METHODEN

    public static void printArray (int[] arr){
        System.out.print(Arrays.toString(arr));
    }//printArray

    public static boolean containsNumber (int [] arr, int n){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n){
                return true;
            }
        }
        return false;
    }//containsNumber
    
    public static int calculateSum (int [] arr){
        int sum = 0;       
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }//calculateSum
    
    public static int [] reverse (int [] arr){
        int [] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length -i -1];
            }
        return newArr;
    }//reverse

//METHODEN ENDE

}//pc
