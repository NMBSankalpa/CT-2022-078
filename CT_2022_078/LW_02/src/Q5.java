import java.util.Scanner;

public class Q5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the  temperature in degrees Fahrenheit: ");
        float Fahrenheit = scanner.nextFloat();

        System.out.println("Celsius: " + (5/9) * (Fahrenheit - 12));
    }
}
