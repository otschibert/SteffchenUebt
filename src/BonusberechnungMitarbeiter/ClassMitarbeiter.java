package BonusberechnungMitarbeiter;

public class ClassMitarbeiter {

    String name;
    String lastname;
    int number;
    double salary;
    int age;

    public void personaData () {
        System.out.println("name = " + name);
        System.out.println("lastname = " + lastname);
        System.out.println("number = " + number);
        System.out.println("salary = " + salary);
        System.out.println("age = " + age);
    }//personaData

    public void yearlyPay () {
        double sozialVersicherung = 20;
        double nachSozi;
        double nachEkst;
        double ergebnis;
        System.out.println("Jahresabrechnung von: " + name + " " + lastname + ": ");
        System.out.println(salary + " € --> Jahresgehalt Brutto.");
        nachSozi = salary * 80/100;
        System.out.println(nachSozi + " €" + " --> Gehalt abzüglich " + sozialVersicherung + " % Sozialversicherung");
        System.out.println("Abzüge Einkommensteuer: ");
        if (nachSozi >50_000){
            nachEkst = (nachSozi - 40_000) * 0.60;
            System.out.println("- 1.000 € --> 10% von 10.000 €");
            System.out.println("- 2.000 € --> 20% von 10.000 € - 20.000€");
            System.out.println("- 3.200 € --> 32% von 20.000 € - 30.000€");
            System.out.println("- 4.500 € --> 45% von 30.000 € - 40.000€");
            System.out.println("- " + nachEkst + " €  --> 60% von " + (nachSozi - 40_000) + " €" );
            ergebnis = nachSozi - 10_700 - nachEkst;
            System.out.println(ergebnis + " € --> Ergebnis pro Jahr");
            System.out.println(ergebnis / 12 + " € --> Ergebnis pro Monat");
        }
        else if (nachSozi >= 20_000 && salary <= 30_000){
            nachEkst = (nachSozi - 20_000) * 0.32;
            System.out.println("- 1.000 € --> 10% von 10.000 €");
            System.out.println("- 2.000 € --> 20% von 10.000 € - 20.000€");
            System.out.println("- " + nachEkst + " €  --> 32% von " + (nachSozi - 20_000) + " €" );
            ergebnis = nachSozi - 3_000 - nachEkst;
            System.out.println(ergebnis + " € --> Ergebnis pro Jahr");
            System.out.println(ergebnis / 12 + " € --> Ergebnis pro Monat");
        }
        else if (nachSozi >= 10_000 && salary <= 20_000){
            nachEkst = (nachSozi - 10_000) * 0.20;
            System.out.println("- 1.000 € --> 10% von 10.000 €");
            System.out.println("- " + nachEkst + " €  --> 20% von " + nachSozi + " €" );
            ergebnis = nachSozi - 1_000 - nachEkst;
            System.out.println(ergebnis + " € --> Ergebnis pro Jahr");
            System.out.println(ergebnis / 12 + " € --> Ergebnis pro Monat");
        }
        else if (nachSozi < 10_000){
            nachEkst = nachSozi * 0.10;
            System.out.println("- " + nachEkst + " €  --> 10% von " + nachSozi + " €" );
            ergebnis = nachSozi - nachEkst;
            System.out.println(ergebnis + " € --> Ergebnis pro Jahr");
            System.out.println(ergebnis / 12 + " € --> Ergebnis pro Monat");
        }

    }//monthlyPay


}//ClassMitarbeiter
