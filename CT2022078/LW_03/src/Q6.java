import java.util.Scanner;

public class Q6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int number  = 10;
        while (number <= 49) {
            System.out.print(" " + number);
            number++;
            if (number % 10 == 0) {
                System.out.println();
            }
        }
    }
}
