import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstname = scanner.next();

        System.out.println("Enter last name: ");
        String lastname = scanner.next();

        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        JFrame myWindow = new JFrame();
        myWindow.setSize(800,600);
        myWindow.setTitle("James Bond");
        myWindow.setVisible(true);

    }
}
