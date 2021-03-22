public class UmrechnungenBeispiele {

    //METHODEN

    public static double kilometerToMiles (int kilometer){
        double miles = kilometer * 0.621371;
        return miles;

    }

    public static double milesToKilometer (int miles) {
        double kilometer = miles / 0.621371;
        return kilometer;
    }

    public static double celsiusToFahrenheit (double celsius){
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius (double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }

    //METHODEN ENDE

    public static void main(String[] args) {

        System.out.println();

        // Umrechnen Kilometer in Meilen
        int kilometerValue = 10;

        System.out.println(kilometerValue + " Kilometer sind " + kilometerToMiles(kilometerValue) + " Meilen.");

        System.out.println();

        // Umrechnen Meilen in Kilometer

        int milesValue = 10;

        System.out.println(milesValue + " Meilen sind " + milesToKilometer(milesValue) + " Kilometer.");

        System.out.println();

        // Umrechnen Celsius in Fahrenheit

        double currentTemperatureCelsisus = 20;

        System.out.println(currentTemperatureCelsisus + " Grad Celsius sind " + celsiusToFahrenheit(currentTemperatureCelsisus) + " Grad Fahrenheit.");

        System.out.println();

        // Umrechnen Fahrenheit in Celsius

        double currentTemperatureFahrenheit = 20;

        System.out.println(currentTemperatureFahrenheit + " Grad Fahrenheit sind " + fahrenheitToCelsius(currentTemperatureFahrenheit) + " Grad Celsius.");





    }

}
