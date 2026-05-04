import java.util.Scanner;

public class Q9 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how much dollars: ");
        int P = scanner.nextInt();
        System.out.println("Enter interest percent: ");
        double R = scanner.nextDouble();
        System.out.println("Enter how many years: ");
        int N = scanner.nextInt();

        System.out.println("Amount of money: " + P * Math.pow((1 + R/100),N));
    }
}
