public class VollkommeneZahlen {
    public static void main(String[] args) {
        System.out.println();


        System.out.println("vollkommen(6) = " + vollkommen(6));
        System.out.println("vollkommen(7) = " + vollkommen(7));
        System.out.println("vollkommen(28) = " + vollkommen(28));
        System.out.println();
        //System.out.println(vollkommenListe(10_000));
        vollkommenListe();


        System.out.println();
    }//psvm

    //METHODEN

    public static boolean vollkommen (int zahl){
        int sum = 0;
        for (int i = 1; i <= zahl / 2; i++) {
            if (zahl % i == 0){
                sum = sum + i;
            }
        }
        if (sum == zahl) {
            return true;
        } else {
            return false;
        }
    }//vollkommen

    public static void vollkommenListe (){
        for (int i = 0; i < 50_000; i++) {
            if (vollkommen(i) == true) {
                System.out.print(i + ", ");
            }

        }

    }//vollkommenListe

    //METHODEN ENDE

}//pc

