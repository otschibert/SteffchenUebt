package Strafe;

public class ClassStrafe {

    String name;
    String lastname;
    String licencePlate;
    int penaltyNumber;
    double penalty;
    int number;

    int[] penaltyCatalogue = {30, 50, 100, 500, 1500, 25, 100, 400, 1000, 5000};

    /* int [] penaltyCatalogue = new int[10];
        penaltyCatalogue[0]=30;

     */

    public void driverID (){
        System.out.println("Name des Fahrers: " + name + " " + lastname);
        System.out.println("Kennzeichen: " + licencePlate);
        System.out.println("Anzahl der bisherigen Strafen: " + number + " Vergehen");
        System.out.println("Stand Strafenkonto: " + penalty + " Euro");
    }//driverID

    public void penalty (int overspeeding){
        if (overspeeding > 0 && overspeeding <= 20){
            penalty = penalty + penaltyCatalogue[0];
            penaltyNumber ++;
            number ++;
            System.out.println("Vergehen Nr. " + penaltyNumber);
            System.out.println("Du warst "+ overspeeding + " km/h zu schnell! Dein Strafkonto erhöht sich um " + penaltyCatalogue[0] + " €!");
            System.out.println("Deine Anzahl an Vergehen erhöht sich auf: " + number);
            System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
        }
        else if (overspeeding > 20 && overspeeding <= 30){
            penalty = penalty + penaltyCatalogue[1];
            penaltyNumber ++;
            number ++;
            System.out.println("Vergehen Nr. " + penaltyNumber);
            System.out.println("Du warst "+ overspeeding + " km/h zu schnell! Dein Strafkonto erhöht sich um " + penaltyCatalogue[1] + " €!");
            System.out.println("Deine Anzahl an Vergehen erhöht sich auf: " + number);
            System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
        }
        else if (overspeeding > 30 && overspeeding <= 50){
            penalty = penalty + penaltyCatalogue[2];
            penaltyNumber ++;
            number ++;
            System.out.println("Vergehen Nr. " + penaltyNumber);
            System.out.println("Du warst "+ overspeeding + " km/h zu schnell! Dein Strafkonto erhöht sich um " + penaltyCatalogue[2] + " €!");
            System.out.println("Deine Anzahl an Vergehen erhöht sich auf: " + number);
            System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
        }
        else if (overspeeding > 50 && overspeeding <= 100){
            penalty = penalty + penaltyCatalogue[3];
            penaltyNumber ++;
            number ++;
            System.out.println("Vergehen Nr. " + penaltyNumber);
            System.out.println("Du warst "+ overspeeding + " km/h zu schnell! Dein Strafkonto erhöht sich um " + penaltyCatalogue[3] + " €!");
            System.out.println("Deine Anzahl an Vergehen erhöht sich auf: " + number);
            System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
        }
        else if (overspeeding > 100){
            penalty = penalty + penaltyCatalogue[4];
            penaltyNumber ++;
            number ++;
            System.out.println("Vergehen Nr. " + penaltyNumber);
            System.out.println("Du warst "+ overspeeding + " km/h zu schnell! Dein Strafkonto erhöht sich um " + penaltyCatalogue[4] + " €!");
            System.out.println("Deine Anzahl an Vergehen erhöht sich auf: " + number);
            System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
        }
        else {
            System.out.println("UNGÜLTIGE ANGABE!!");
        }

    }//penalty

    public void firstAidKit (){
        penalty = penalty + penaltyCatalogue[5];
        penaltyNumber ++;
        number ++;
        System.out.println("Du hast keinen Verbandskasten im Auto! Das kostet dich " + penaltyCatalogue[5] + " € Strafe!");
        System.out.println("Deine Anzahl an Vergehen erhöht sich auf: " + number);
        System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
    } //firstAidKit

    public void alcoholLevel(double prom){
        if (prom > 0.5 && prom <= 1.0){
            penalty = penalty + penaltyCatalogue[6];
            penaltyNumber ++;
            number ++;
            System.out.println("Vergehen Nr. " + penaltyNumber);
            System.out.println("Du hattest "+ prom + " Promille Alkohol im Blut! Dein Strafkonto erhöht sich um " + penaltyCatalogue[6] + " €!");
            System.out.println("Deine Anzahl an Vergehen erhöht sich auf: " + number);
            System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
        }
        else if (prom > 1.0 && prom <= 2.0){
            penalty = penalty + penaltyCatalogue[7];
            penaltyNumber ++;
            number ++;
            System.out.println("Vergehen Nr. " + penaltyNumber);
            System.out.println("Du hattest "+ prom + " Promille Alkohol im Blut! Dein Strafkonto erhöht sich um " + penaltyCatalogue[7] + " €!");
            System.out.println("Deine Anzahl an Vergehen erhöht sich auf: " + number);
            System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
        }
        else if (prom > 2.0 && prom <= 3.0){
            penalty = penalty + penaltyCatalogue[8];
            penaltyNumber ++;
            number ++;
            System.out.println("Vergehen Nr. " + penaltyNumber);
            System.out.println("Du hattest "+ prom + " Promille Alkohol im Blut! Dein Strafkonto erhöht sich um " + penaltyCatalogue[8] + " €!");
            System.out.println("Deine Anzahl an Vergehen erhöht sich auf: " + number);
            System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
        }
        else if (prom > 3.0){
            penalty = penalty + penaltyCatalogue[9];
            penaltyNumber ++;
            number ++;
            System.out.println("Vergehen Nr. " + penaltyNumber);
            System.out.println("Du hattest "+ prom + " Promille Alkohol im Blut! Dein Strafkonto erhöht sich um " + penaltyCatalogue[9] + " €!");
            System.out.println("Deine Anzahl an Vergehen erhöht sich auf: " + number);
            System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
        }
        else {
            System.out.println("Sehr vorbildlich! Dein Promillegehalt von " + prom + " liegt innerhalb des erlaubten Rahmens!");
        }
    }//alcoholLevel

    public void others (double otherPenalty){
        penalty = penalty + otherPenalty;
        penaltyNumber ++;
        number ++;
        System.out.println("Vergehen Nr. " + penaltyNumber);
        System.out.println("Beamtenbeleidigung! Dein Strafkonto erhöht sich um " + otherPenalty + " €!");
        System.out.println("Deine Anzahl an Vergehen erhöht sich auf: " + number);
        System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
    }//others

    public double getDiscount(){
        if (number == 1){
            double discount = 30;
            penalty = penalty * 0.7;
            System.out.println("Du hast bis jetzt " + number + " Vergehen auf dem Kerbholz.");
            System.out.println("Du erhältst " + discount + " % Gutschrift auf dein Strafkonto.");
            System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
        }
        if (number == 1){
            double discount = 30;
            penalty = penalty * 0.7;
            System.out.println("Du hast bis jetzt " + number + " Vergehen auf dem Kerbholz.");
            System.out.println("Du erhältst " + discount + " % Gutschrift auf dein Strafkonto.");
            System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
        }
        if (number == 3){
            double discount = 10;
            penalty = penalty * 0.9;
            System.out.println("Du hast bis jetzt " + number + " Vergehen auf dem Kerbholz.");
            System.out.println("Du erhältst " + discount + " % Gutschrift auf dein Strafkonto.");
            System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
        }
        if (number >= 4){
            System.out.println("Du hast bis jetzt " + number + " Vergehen auf dem Kerbholz.");
            System.out.println("Du erhältst keine Gutschrift auf dein Strafkonto.");
            System.out.println("Dein aktuelles Strafkonto beläuft sich auf: " + penalty + " €");
        }
        return penalty;

    }//getDisount


}//pc
