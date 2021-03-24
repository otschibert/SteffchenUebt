package Arrays;

public class summeGegendiagonale {

    public static void main(String[] args) {
        System.out.println();

        int [][] doubleArr = {{1,2,3,4}, {5,6,7,8}, {9,1,2,3}, {4,5,6,7}};

        printMatrix(doubleArr);


        System.out.println();

        System.out.println("summeGegendiagonale(doubleArr) = " + summeGegendiagonale(doubleArr));

        System.out.println();

    }//psvm



    public static void printMatrix (int [][] matrix){
        for (int zeile = 0; zeile < matrix.length; zeile++) {
            for (int reihe = 0; reihe < matrix.length; reihe++) {
                System.out.print(matrix [zeile][reihe] + "\t");
            }
            System.out.println();
        }
    }//printMatrix


    public static int summeGegendiagonale (int [][] matrix){
        int sum = 0;
        int counter = matrix[0].length -1;
        for (int zeile = 0; zeile < matrix.length; zeile++){
                sum = sum + matrix[zeile][counter];
                counter --;
        }
        return sum;
    }//summeGegendiagonale

    //METHODEN ENDE

}//pc
