import java.util.Scanner; // import scanner for user input

public class CheckOut {

    public static void main(String[] args) {
        // initialize scanner for user input
        Scanner scanner = new Scanner(System.in);
        double cost = 0.0; // establish/initialize variable for the total cost

        // continues to loop as long as user inputs yes
        do {
            // asks for user input of price as double
            double itemPrice = SafeInput.getRangedDouble(scanner, "Enter the price of your item ($0.50 - $10.00): ", 0.5, 10.0);
            cost += itemPrice; // adds the price to the total cost
        } while (SafeInput.getYNConfirm(scanner, "Do you have more items to enter? (Y/N): "));
        // outputs the results with 2 decimal points
        System.out.printf("Total cost: $%.2f%n", cost);
    }
}