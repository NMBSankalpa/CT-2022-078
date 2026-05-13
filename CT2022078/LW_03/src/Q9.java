import java.util.Scanner;

public class Q9 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for show the Asteric pyramid: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}