public class WhileSchleifen {

    public static void main(String[] args) {
    System.out.println();

    // BEISPIEL WHILE SCHLEIFE

    int counter = 100;

    while (counter >= 10) {
        System.out.print(counter + ", ");
        counter --;
    }

    System.out.println();
    System.out.println();

    // BEISPIEL WHILE SCHLEIFE IF ELSE

    int counter2 = 1;

    while (counter2 <= 100){
        if (counter2 % 3 == 0 || counter2 % 5 == 0){
            System.out.print(counter2 + ", ");
        }
        counter2 ++;

    }


    System.out.println();
    } //psvm


} //pc
