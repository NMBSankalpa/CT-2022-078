import java.time.Year;
import java.util.Scanner;

public class Q6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inputs the year a person is born: ");
        int year = scanner.nextInt();

        // get the current year
        int current_year = Year.now().getValue();
        int age = current_year - year;

        System.out.println("Year a person is born: " + age);
    }
}
