public class CtoFTableDisplay {
    public static void main(String[] args) {


        SafeInput.prettyHeader("Celsius to Fahrenheit Conversion Table");
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("-------------------");

               for (int celsius = -100; celsius <= 100; celsius++) {

            double fahrenheit = CtoF(celsius);

            System.out.printf("%d\t\t%.2f%n", celsius, fahrenheit);
        }
    }

    public static double CtoF(double celsius) {

        return (celsius * 9 / 5) + 32;
    }
}
