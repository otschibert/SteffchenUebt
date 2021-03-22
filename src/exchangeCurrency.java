public class exchangeCurrency {

    //METHODEN

    public static double geldWechsler (String currencyID, double value){
        double ergebnis = 0;
        if (currencyID.equals("HUF")){
            ergebnis = value * 328.61;
        }
        else if (currencyID.equals("SEK")){
            ergebnis = value * 10.76;
        }
        else if (currencyID.equals("USD")){
            ergebnis = value * 1.12;
        }
        else if (currencyID.equals("CAD")){
            ergebnis = value * 1.47;
        }
        else {
            System.out.println("ERROR - PLEASE TRY AGAIN!");
        }
    return ergebnis;
    }//exchangeCurrency


    //METHODEN ENDE

    public static void main(String[] args) {
        System.out.println();


        System.out.println("geldWechsler(\"HUF\", 12) = " + geldWechsler("HUF", 12));
        System.out.println("geldWechsler(\"SEK\", 100) = " + geldWechsler("SEK", 100));



        System.out.println();
    }//psvm
}//pc
