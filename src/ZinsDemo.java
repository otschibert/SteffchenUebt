public class ZinsDemo {

    //METHODEN

    public static double zinsBerechnung (double ks, double zi){
        double laufzeitZinsen = (ks * zi / 100);
        return laufzeitZinsen;
    }

    // METHODEN ENDE

    public static void main(String[] args) {
        System.out.println();

        double kontostand = 5000;
        double zinsen = 2.25;
        double neuerKontostand = zinsBerechnung(kontostand, zinsen) + kontostand;

        System.out.println("Alter Kontostand: " + kontostand + " Euro.");
        System.out.println();
        System.out.println("Die Zinsen betragen: " + zinsBerechnung(kontostand, zinsen) + " Euro.");
        System.out.println();
        System.out.println("Der neue Kontostand beträgt: " + neuerKontostand + " Euro.");





    }
}
