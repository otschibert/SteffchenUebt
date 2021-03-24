package Rekursionen;

public class RekursionenDiverse {

    //METHODEN

    public static long summiereRekursiv (long n){
        if (n == 0) return 0;
        return n + summiereRekursiv(n - 1);
    }// summiereRekursiv
    
    
    public static long fakRek (long n){
        if (n < 1) return 1;
        return n * fakRek(n-1);
    }//fakRek



    //METHODEN ENDE

    public static void main(String[] args) {
        System.out.println();

        System.out.println("summiereRekursiv(5) = " + summiereRekursiv(5));
        System.out.println();
        System.out.println("fakRek(7) = " + fakRek(7));


        System.out.println();
    }//psvm
}//pc
