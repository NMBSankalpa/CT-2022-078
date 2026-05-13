import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float total = 0;
        while (true) {
            System.out.println("\nChoose the category:");
            System.out.println("1. Entree");
            System.out.println("2. Side Dish");
            System.out.println("3. Drink");
            System.out.println("4. Exit");

            int category = scanner.nextInt();
            if (category == 4) {
                break;
            }
            int food;
            int quantity;
            float price = 0;

            switch (category) {
                case 1:
                    System.out.println("\n1.Tofu Burger $3.49");
                    System.out.println("2.Cajun Chicken $4.59");
                    System.out.println("3.Buffalo Wings $3.99");
                    System.out.println("4.Rainbow Fillet $2.99");

                    System.out.print("Enter food number: ");
                    food = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();

                    switch (food) {
                        case 1:
                            price = quantity * 3.49f;
                            break;
                        case 2:
                            price = quantity * 4.59f;
                            break;
                        case 3:
                            price = quantity * 3.99f;
                            break;
                        case 4:
                            price = quantity * 2.99f;
                            break;
                        default:
                            System.out.println("Invalid food");
                    }
                    break;
                case 2:
                    System.out.println("\n1.Rice Cracker $0.79");
                    System.out.println("2.No-Salt Fries $0.69");
                    System.out.println("3.Zucchini $1.09");
                    System.out.println("4.Brown Rice $0.59");

                    System.out.print("Enter food number: ");
                    food = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();

                    switch (food) {
                        case 1:
                            price = quantity * 0.79f;
                            break;
                        case 2:
                            price = quantity * 0.69f;
                            break;
                        case 3:
                            price = quantity * 1.09f;
                            break;
                        case 4:
                            price = quantity * 0.59f;
                            break;
                        default:
                            System.out.println("Invalid food");
                    }
                    break;
                case 3:
                    System.out.println("\n1.Cafe Mocha $1.99");
                    System.out.println("2.Cafe Latte $1.90");
                    System.out.println("3.Espresso $2.49");
                    System.out.println("4.Oolong Tea $0.99");

                    System.out.print("Enter drink number: ");
                    food = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();

                    switch (food) {
                        case 1:
                            price = quantity * 1.99f;
                            break;
                        case 2:
                            price = quantity * 1.90f;
                            break;
                        case 3:
                            price = quantity * 2.49f;
                            break;
                        case 4:
                            price = quantity * 0.99f;
                            break;
                        default:
                            System.out.println("Invalid drink");
                    }
                    break;

                default:
                    System.out.println("Invalid category");
            }

            total = total + price;

            System.out.println("Current food price: $" + price);
        }

        System.out.println("Total Bill: $" + total);
    }
}