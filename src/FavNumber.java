import java.util.Scanner;
public class FavNumber {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int favInt = SafeInput.getInt(scanner, "Enter your favorite integer");
        System.out.println("You said your favorite integer is " +favInt);

        double favDouble = SafeInput.getDouble(scanner, "enter your favorite double ");
        System.out.println("You said your favorite double is " +favDouble);

    }
}
