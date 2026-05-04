import java.util.Scanner;

public class Q8 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        System.out.println("Enter the value of radius: ");
        int radius = scanner.nextInt();

        System.out.println("V = " + (4.0/3) * (PI * Math.pow(radius,3)));
    }
}
