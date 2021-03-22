public class Methoden {

    //  METHODEN

    public static void test (int a, int b){
        if (a>b){
            System.out.println(a);
            }
        else {
            System.out.println(b);
            }
        return;
    }

    public static int testParameter (int a, int b){
        int summe = a+b;
        return summe;
    }

    public static void main(String[] args) {

        System.out.println();

        test (25,30);

        int x = 12;
        int y = 10;
        int result = testParameter (x,y);
        System.out.println("Das Ergebnis lautet: " + result);


        System.out.println();
    } //psvm




} //pc
