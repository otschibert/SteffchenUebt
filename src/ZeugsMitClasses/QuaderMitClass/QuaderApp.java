package QuaderMitClass;

public class QuaderApp {

    public static void main(String[] args) {
        System.out.println();

        ClassQuader quader1 = new ClassQuader();
        quader1.laenge = 4;
        quader1.breite = 5;
        quader1.hoehe = 2;

        ClassQuader quader2 = new ClassQuader();
        quader2.laenge = 5;
        quader2.breite = 2;
        quader2.hoehe = 1;

        System.out.println("quader1.grundflaeche() = " + quader1.grundflaeche());
        System.out.println("quader2.grundflaeche() = " + quader2.grundflaeche());
        System.out.println("quader1.volumen() = " + quader1.volumen());
        System.out.println("quader2.volumen() = " + quader2.volumen());
        System.out.println("quader1.oberflaeche() = " + quader1.oberflaeche());
        System.out.println("quader2.oberflaeche() = " + quader2.oberflaeche());
        System.out.println();
        quader1.skaliere(-1);
        quader2.skaliere(2);
        System.out.println("quader1.grundflaeche() = " + quader1.grundflaeche());
        System.out.println("quader2.grundflaeche() = " + quader2.grundflaeche());
        System.out.println("quader1.volumen() = " + quader1.volumen());
        System.out.println("quader2.volumen() = " + quader2.volumen());
        System.out.println("quader1.oberflaeche() = " + quader1.oberflaeche());
        System.out.println("quader2.oberflaeche() = " + quader2.oberflaeche());




    }
}
