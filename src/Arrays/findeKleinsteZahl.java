package Arrays;

public class findeKleinsteZahl {
    public static void main(String[] args) {
        System.out.println();

        int [] arr = {5,6,8,7,1,3};


        System.out.println("findSmallestNumber(arr) = " + findSmallestNumber(arr));


        System.out.println();
    }//spvm

    //METHODEN

    public static int findSmallestNumber (int [] arr){
        int keep = 0;
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[i+1]){
                keep = arr[i+1];
            }
        }
        return keep;
    }//findSmallestNumber



    //METHODEN ENDE

}//pc
