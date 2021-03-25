package QuaderMitClass;

public class ClassQuader {

    double laenge;
    double breite;
    double hoehe;


    public double grundflaeche (){
        return laenge * breite;
    }

    public void skaliere (int wert){
        laenge = laenge + wert;
        breite = breite + wert;
        hoehe = hoehe+ wert;
    }

    public double volumen(){
        return laenge * breite * hoehe;
    }

    public double oberflaeche(){
        return (2*laenge*breite)+(2*laenge*hoehe)+(2*breite*hoehe);
    }




}
