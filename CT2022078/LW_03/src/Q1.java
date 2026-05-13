import java.util.Scanner;

public class Q1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int Number1 = scanner.nextInt();

        System.out.println("Enter a number : ");
        int Number2 = scanner.nextInt();

        System.out.println("Enter a number again : ");
        int Number3 = scanner.nextInt();

        if (Number1 < Number2) {
            if (Number1 < Number3) {
                System.out.println("The smallest nujmber is : " + Number1);
            }
            else {
                System.out.println("The smallest number is : " + Number3);
            }
        } else if (Number2 < Number3) {
            System.out.println("The smallest number is : " + Number2);
        }
        else {
            System.out.println("The smallest number is : " + Number3);
    }
    }
}
