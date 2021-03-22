package Strafe;

import Strafe.ClassStrafe;

public class StrafeDemo {

    public static void main(String[] args) {
        System.out.println();

        ClassStrafe otschibert = new ClassStrafe();

        otschibert.name = "Otschibert";
        otschibert.lastname = "Müller";
        otschibert.licencePlate = "G-666AA";
        otschibert.penaltyNumber = 000;
        otschibert.penalty = 0;
        otschibert.number = 0;


        otschibert.driverID();
        System.out.println();
        otschibert.penalty(20);
        System.out.println();
        otschibert.alcoholLevel(1.8);
        System.out.println();
        otschibert.others(70);
        System.out.println();
        otschibert.getDiscount();
        System.out.println();
        otschibert.driverID();





    }//psvm
}//pc
