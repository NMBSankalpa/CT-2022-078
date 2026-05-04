import java.util.Scanner;

public class Q10 {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Annual interest rate: ");
        double interest = scanner.nextDouble();
        System.out.println("Loan amount: ");
        int loan_amount = scanner.nextInt();
        System.out.println("Loan period: ");
        int L_period = scanner.nextInt();

        double monthlyInterestRate = interest / 100.0 / 12;
        int numberOfPayments = L_period * 12;

        double monthlyPayment = (loan_amount * monthlyInterestRate) / ( 1 - Math.pow(1/( 1 + monthlyInterestRate), numberOfPayments));

        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total payment: " + monthlyPayment * numberOfPayments);
    }
}
