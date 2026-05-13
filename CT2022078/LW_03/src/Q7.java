import java.util.Scanner;

public class Q7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        String Number  = scanner.next();
        int number  = Integer.valueOf(Number);

        while (number > 0) {
            System.out.println(Number.length() + " digits");

            System.out.println("Enter the number : ");
            Number  = scanner.next();
            number  = Integer.valueOf(Number);



        }
    }
}
