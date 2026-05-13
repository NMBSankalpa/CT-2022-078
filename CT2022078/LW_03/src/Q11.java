import java.util.Random;
import java.util.Scanner;

public class Q11 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the guessing number : ");
        int number = scanner.nextInt();

        Random random_num = new Random();
        int r_number = random_num.nextInt(100)+1;

        while (r_number != number){
            if (r_number < number) {
                System.out.println("Your number is greater than to random number.");
                System.out.println("Enter the guessing number : ");
                number = scanner.nextInt();
                r_number = random_num.nextInt(100)+1;
            }
            else{
                System.out.println("Your number is less than to random number.");
                System.out.println("Enter the guessing number : ");
                number = scanner.nextInt();
                r_number = random_num.nextInt(100)+1;
            }
        }
        System.out.println("Both are Equal.");

    }
}
