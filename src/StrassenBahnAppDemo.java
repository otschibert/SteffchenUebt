public class StrassenBahnAppDemo {

    //METHODEN

    public static void ziel (int station, int problem, int dauer){
        int [] fahrZeiten = {20, 16, 15, 10,3 ,0};

        switch (station) {
            case 1:
                int zeit = fahrZeiten[0];
                System.out.println("Du bist bei Station Nr. " + station + " - noch " + zeit + " Minuten bis zum Ziel!");
                break;
            case 2:
                zeit = fahrZeiten[1];
                System.out.println("Du bist bei Station Nr. " + station + " - noch 16 Minuten bis zum Ziel!");
                break;
            case 3:
                zeit = fahrZeiten[2];
                System.out.println("Du bist bei Station Nr. " + station + " - noch 15 Minuten bis zum Ziel!");
                break;
            case 4:
                zeit = fahrZeiten[3];
                System.out.println("Du bist bei Station Nr. " + station + " - noch 10 Minuten bis zum Ziel!");
                break;
            case 5:
                zeit = fahrZeiten[4];
                System.out.println("Du bist bei Station Nr. " + station + " - noch 3 Minuten bis zum Ziel!");
                break;
            case 6:
                zeit = fahrZeiten[5];
                System.out.println("Du hast dein Ziel erreicht! STEIG AUS!!");
                break;
        }

            if (station < fahrZeiten.length && station == problem){
                int delay = (fahrZeiten[station-1] + dauer);
                System.out.println("Es liegt eine Störung vor! Die Fahrzeit bis zum Ziel erhöht sich um " + dauer + " Minuten!");
                System.out.println("Neue Fahrzeit bis zum Ziel: " + delay + " Minuten.");
            }
            else if (station == fahrZeiten.length && station == problem) {
                System.out.println("An deiner Endstation ist ein Problem aufgetreten. Das Aussteigen kann sich bis zu " + dauer + " Minuten verzögern. Wir bitten um Geduld!");
            }


    } //ziel Ende


    //METHODEN ENDE

    public static void main(String[] args) {
        System.out.println();

        int station = 5;
        int problem = 6; // bei welcher Station, 0 = kein Problem
        int dauer = 6; //zusätzliche Dauer wegen Störung

        ziel(station, problem, dauer);


        System.out.println();
    }//psvm
}//pc
