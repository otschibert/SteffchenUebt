public class FibonacciRekursion {
    
    //METHODEN

   
    public static void fibNormal (int zahl){
        int f1 = 0;
        int f2 = 1;
        int keep = 0;
        int sum = 0;
        for (int i = 0; i < zahl; i++) {
            keep = f1 + f2;
            f1 = f2;
            f2 = keep;
            sum = keep + sum;
            System.out.print(keep + ", ");
        }
    }//fibNormal

    public static long fibRek (int zahl){
        if (zahl < 2) return zahl;
        else return (fibRek(zahl-1)) + fibRek(zahl-2);

    }//fibRek
    
    
    //METHODEN ENDE

    public static void main(String[] args) {
        System.out.println();


        fibNormal(10);
        System.out.println();

        System.out.println("fibRek(6) = " + fibRek(5));
        System.out.println("fibRek(8) = " + fibRek(7));

        for (int i = 0; i <= 10; i++) {
            System.out.print(fibRek(i) + ", ");

        }


        
        
        System.out.println();
    }//psvm
}//pc
