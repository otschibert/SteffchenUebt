package RechteckMitClass;

public class ClassRechteck {

    int laenge;
    int breite;

    public int flaeche (){
        return laenge * breite;
    }

    public void skaliere (int faktor){
        laenge = laenge + faktor;
        breite = breite + faktor;
    }

    public void zeigeRechteck (){
        System.out.println("laenge = " + laenge);
        System.out.println("breite = " + breite);
    }




}//pc
