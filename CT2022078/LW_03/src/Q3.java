import java.util.Scanner;

public class Q3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for the power(6,9,12,etc.) : ");
        int power = scanner.nextInt();
        String number = "";

        switch (power) {
            case 6:
                number = "Million";
                break;
            case 9:
                number = "Billion";
                break;
            case 12:
                number = "Trillion";
                break;
            case 15:
                number = "Quadrillion";
                break;
            case 18:
                number = "Quintillion";
                break;
            case 21:
                number = "Sextillion";
                break;
            case 30:
                number = "Nonillion";
                break;
            case 100:
                number = "Googol";
                break;
            default:
                System.out.println("Invalid Number.");
                break;
        }
    System.out.println("Number : " + number);
    }
}
