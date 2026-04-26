import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        int width = scanner.nextInt();

        System.out.println("Enter height: ");
        int height = scanner.nextInt();

        System.out.println("Enter title: ");
        String title = scanner.next();

        JFrame jframe = new JFrame();
        jframe.setSize(width,height);
        jframe.setTitle(title);
        jframe.setVisible(true);

    }
}
