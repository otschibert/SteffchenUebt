public class TurmRechnen {

    //METHODEN

    public static int turmRechnung (int wert) {

        System.out.println(wert);

        for (int i = 2; i <= 9; i++) {
            System.out.println(wert + " x " + i);
            wert = wert * i;
        }
        for (int i = 2; i <= 9; i++) {
            System.out.println(wert + " / " + i);
            wert = wert / i;
        }
        System.out.println(wert);
        return wert;
    }

    //METHODEN ENDE

    public static void main(String[] args) {
        System.out.println();


        int ausgangsZahl = 5;

        turmRechnung(5);


        System.out.println();
    }//psvm
}//pc
