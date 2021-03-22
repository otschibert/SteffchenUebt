public class WinterreifenpflichtDemo {

    //METHODEN

    public static String isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn){
        if ((temperatur < 10) && (rutschigeFahrbahn == true)){
            System.out.println("Bitte Winterreifen verwenden!");
        }
        else if (temperatur < 4){
            System.out.println("Bitte Winterreifen verwenden!");
        }
        else {
            System.out.println("Winterreifen sind nicht erforderlich!");
        }
        return "";
    }


    //METHODEN ENDE

    public static void main(String[] args) {
        System.out.println();

        int temperatur = 8;
        boolean rutschigeFahrbahn = false;

        isWinterreifenPflicht(temperatur, rutschigeFahrbahn);




        System.out.println();
    }//psvm
}//pc
