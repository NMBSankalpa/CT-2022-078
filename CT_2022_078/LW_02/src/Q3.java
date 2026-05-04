import java.util.Scanner;

public class Q3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the  temperature in degrees Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("temperature in degrees Fahrenheit: " + (celsius * 1.8) + 32 );
    }
}
