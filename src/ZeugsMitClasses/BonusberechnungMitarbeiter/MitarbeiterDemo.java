package BonusberechnungMitarbeiter;

public class MitarbeiterDemo {

    public static void main(String[] args) {
        System.out.println();

        ClassMitarbeiter persona1 = new ClassMitarbeiter();
        persona1.name = "Hugo";
        persona1.lastname = "Müller";
        persona1.number = 1;
        persona1.salary = 9_000;
        persona1.age = 41;

        ClassMitarbeiter persona2 = new ClassMitarbeiter();
        persona2.name = "Bastian";
        persona2.lastname = "Knolle";
        persona2.number = 2;
        persona2.salary = 15_000;
        persona2.age = 43;

        ClassMitarbeiter persona3 = new ClassMitarbeiter();
        persona3.name = "Bastian";
        persona3.lastname = "Knolle";
        persona3.number = 3;
        persona3.salary = 120_000;
        persona3.age = 45;

        System.out.println();
        persona1.yearlyPay();


        System.out.println();
        persona2.yearlyPay();


        System.out.println();
        persona3.yearlyPay();


        System.out.println();
    }//psvm

}//pc
