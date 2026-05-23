import java.util.Scanner;

public class Q2 {
    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");

        double F = input.nextDouble();

        Temperature temp_02 = new Temperature(F);

        System.out.println("Temperature in Celsius: " + temp_02.setFahrenheit(F));
    }
}