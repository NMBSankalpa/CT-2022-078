import java.util.Scanner;

public class Q8 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for Multiplication table: ");
        int number = scanner.nextInt();
        int index = 1;

        while (index <= 10) {
            System.out.println(number + "x" + index + "=" + number*index);
            index++;
        }
    }
}
