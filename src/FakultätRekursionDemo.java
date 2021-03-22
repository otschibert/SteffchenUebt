public class FakultätRekursionDemo {
    
    //Methoden

    public static long fakRek (int n){
        if (n < 1) return 1;
        return n * fakRek(n-1);
    }//fakRek


    public static long fibRek (int zahl) {
        if (zahl < 2) return 1;
        else return fibRek(zahl-1) + fibRek(zahl-2);
    }//fibu



    //Methoden Ende

    public static void main(String[] args) {
        System.out.println();

        //FAKULTÄTEN

        System.out.println("fakRek(7) = " + fakRek(7));
        System.out.println();


        //FIBONACCI

        for (int i = 1; i <= 10; i++) {
            System.out.print(fibRek(i) + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("fibRek(1) = " + fibRek(1));
        System.out.println("fibRek(3) = " + fibRek(3));
        System.out.println("fibRek(5) = " + fibRek(5));
        System.out.println("fibRek(7) = " + fibRek(7));


        System.out.println();
    }//psvm
}//pc
