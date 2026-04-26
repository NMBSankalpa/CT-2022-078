import java.util.Scanner;

public class Q9 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        int noofcharacters = input.length();

        System.out.println(noofcharacters);
        System.out.println(input.substring(0,1));
        System.out.println(input.substring(noofcharacters-1));

    }
}
