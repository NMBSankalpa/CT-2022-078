import java.util.Scanner;

public class Q2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of centimeters : ");
        double cm = scanner.nextInt();

        double inch = cm / 2.54;
        double feet = inch / 12;
        double Tot_inch = inch % 12;

        System.out.println("Feet: " + feet + " Inches : " + Tot_inch );
    }
}
