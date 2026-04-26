import java.util.Scanner;

public class Q8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string with the Exclamation mark: ");
        String statement = scanner.nextLine();

        int exclamationindex = statement.indexOf('!');

        System.out.println(statement.substring(0,exclamationindex));

        int index = exclamationindex + 1;

        System.out.println(statement.substring(index));
    }
}

