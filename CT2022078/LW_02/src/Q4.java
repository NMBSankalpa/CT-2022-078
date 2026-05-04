import java.util.Scanner;

public class Q4 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your body weight: ");
        double body_weight = scanner.nextDouble();

        System.out.println("Calories count: " + body_weight * 19 );
    }
}
