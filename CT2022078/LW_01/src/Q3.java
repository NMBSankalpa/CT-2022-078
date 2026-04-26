import java.util.Scanner;

public class Q3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstname = scanner.next();

        System.out.println("Enter middle name: ");
        String middlename = scanner.next();

        System.out.println("Enter last name: ");
        String lastname = scanner.next();

        System.out.println(firstname + " " + middlename.substring(0,1) + "."+ " " + lastname);
    }
}
