package RechteckMitClass;

public class RechteckApp {

    public static void main(String[] args) {
        System.out.println();

        ClassRechteck rechteck1 = new ClassRechteck();
        ClassRechteck rechteck2 = new ClassRechteck();

        rechteck1.laenge = 3;
        rechteck1.breite = 2;
        rechteck2.laenge = 5;
        rechteck2.breite = 4;

        System.out.println("rechteck1.flaeche() = " + rechteck1.flaeche());
        System.out.println("rechteck2.flaeche() = " + rechteck2.flaeche());
        System.out.println();
        rechteck1.zeigeRechteck();
        rechteck2.zeigeRechteck();
        rechteck1.skaliere(2);
        rechteck2.skaliere(5);
        System.out.println();
        rechteck1.zeigeRechteck();
        rechteck2.zeigeRechteck();





        System.out.println();
    }//psvm
}//pc
