public class NotenErmittlung {

    //METHODEN

    public static String getNotentext(int wert) {
        if (wert > 90) {
            System.out.println("Die Note ist ein SEHR GUT!");
        }
        else if ((wert <= 89) && (wert >=78)){
            System.out.println("Die Note ist ein GUT!");
        }
        else if ((wert <= 77) && (wert >= 65)){
            System.out.println("Die Note ist ein BEFRIEDIGEND!");
        }
        else if ((wert <= 64) && (wert >= 51)){
            System.out.println("Die Note ist ein GENÜGEND!");
        }
        else if (wert <= 50) {
            System.out.println("Die Note ist ein NICHT GENÜGEND!");
        }
        else {
            System.out.println("Die Eingabe war nicht korrekt, bitte versuchen Sie es erneut!");
        }
        return "";

    }//getNotentext Ende


    //METHODEN ENDE


    public static void main(String[] args) {
        System.out.println();

        int punkte = 78;

        getNotentext(punkte);





    }//psvm

}//pc
