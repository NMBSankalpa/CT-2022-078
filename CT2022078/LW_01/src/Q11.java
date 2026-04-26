import java.util.Scanner;

public class Q11 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstname = scanner.nextLine();

        System.out.println("Enter your middle name: ");
        String middlename = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastname = scanner.nextLine();

        System.out.println(lastname+","+firstname+" "+middlename.substring(0,1)+".");
    }
}
