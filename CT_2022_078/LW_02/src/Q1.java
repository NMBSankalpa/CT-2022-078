import java.util.Scanner;

public class Q1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        /*Finding the square root*/
        /*
        System.out.println("Enter value for B: ");
        int B =scanner.nextInt();
        System.out.println("Enter value for A: ");
        int A =scanner.nextInt();
        System.out.println("Enter value for C: ");
        int C =scanner.nextInt();
        */

        double result = Math.sqrt(Math.pow(B,2) + 4 * A * C );
       /* System.out.println("Square root of B^2 + 4AC : " + result);

        System.out.println("Enter value for X: ");
        int X =scanner.nextInt();
        System.out.println("Enter value for Y: ");
        int Y =scanner.nextInt();*/

        double Square_root = Math.sqrt( X + 4 * Math.pow(Y,3));
       /* System.out.println("Square root of X + 4Y^3 : " + Square_root); */

        double cube_root = Math.cbrt( X * Y );
       /*  System.out.println("Cube root of the product of X and Y : " + cube_root); */
        /*
        final double PI = 3.14;
        System.out.println("Enter the area of the circle: ");
        double radius = scanner.nextInt();
        */
        System.out.println("area of the circle: " + PI * Math.pow(radius,2));
    }
}
