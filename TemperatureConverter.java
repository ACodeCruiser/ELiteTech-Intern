package temperatureConverter;
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature value:");
        double tempValue = input.nextDouble();
        
        System.out.println("Enter temperature unit (C for Celsius, F for Fahrenheit, K for Kelvin):");
        char tempUnit = input.next().toUpperCase().charAt(0);
        
        switch (tempUnit) {
            case 'C':
                convertFromCelsius(tempValue);
                break;
            case 'F':
                convertFromFahrenheit(tempValue);
                break;
            case 'K':
                convertFromKelvin(tempValue);
                break;
            default:
                System.out.println("Invalid unit. Please enter C, F, or K.");
                break;
        }
    }

    public static void convertFromCelsius(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println(celsius + "°C = " + kelvin + "K");
    }

    public static void convertFromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = celsius + 273.15;
        System.out.println(fahrenheit + "°F = " + celsius + "°C");
        System.out.println(fahrenheit + "°F = " + kelvin + "K");
    }

    public static void convertFromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(kelvin + "K = " + celsius + "°C");
        System.out.println(kelvin + "K = " + fahrenheit + "°F");
    }
}
