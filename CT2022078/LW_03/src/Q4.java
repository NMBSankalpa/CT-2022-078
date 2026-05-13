import java.util.Scanner;

public class Q4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year  = scanner.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " is leap Year.");
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " is leap Year.");
        }
        else {
            System.out.println(year + " isn't a leap year");
        }
    }
}
