import java.util.Scanner;

public class Q10 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the word: ");
        String input = scanner.nextLine();

        int noofcharacters = input.length();
        int mid_index = noofcharacters/2;
        if (noofcharacters%2 == 1) {
            System.out.println(input.substring(mid_index,mid_index+1));

        }
    }
}
