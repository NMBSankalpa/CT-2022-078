import java.util.Scanner;

public class Q7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms: ");
        int weight = scanner.nextInt();
        System.out.println("Enter your height in centimeters: ");
        int height = scanner.nextInt();

        System.out.println("BMI = " + weight / Math.pow(height/100.0,2));

    }
}
