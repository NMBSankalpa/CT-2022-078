import java.util.Scanner;

public class Q12 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Enter the replace word: ");
        String old_word = scanner.nextLine();

        System.out.println("Enter the replacement word: ");
        String new_word = scanner.nextLine();

        String new_one = sentence.replace(old_word,new_word);

        System.out.println(new_one);
    }
}
