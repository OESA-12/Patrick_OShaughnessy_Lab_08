import java.util.Scanner;
public class SafeInput
{
    /**
     *Get a response from the user
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
      */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
     String retString = ""; //Set this to zero length. Loop runs until it isn't
     do {
         System.out.println("\n" + prompt + ": "); // show prompt add space
         retString = pipe.nextLine();
     } while(retString.length() == 0);
     return retString;
     }

    /**
     * Get integer from User
     * @param pipe a Scanner opened to read from System.in
     * @param prompt the user for an integer
     * @return response that is an integer
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retInteger = 0;
        String trash = "";
        boolean integer = false;

        do
        {
            System.out.println("\n" +prompt);
            if (pipe.hasNextInt())
            {
                retInteger = pipe.nextInt();
                pipe.nextLine();
                integer = true;
            }
            else {
                trash = pipe.nextLine();
                System.out.println("Enter a valid integer, instead of  \"" +trash+ "\"");
            }
        } while (!integer);
        return retInteger;
    }

    /**
     * get double from User
     * @param pipe a Scanner opened to read from System.in
     * @param prompt the user for a double
     * @return response that is a double
     */

    public static double getDouble(Scanner pipe, String prompt)
    {
    double retDouble = 0;
    String trash = "";
    boolean double1 = false;

    do
    {
        System.out.println("\n" +prompt);

        if (pipe.hasNextDouble())
        {
            retDouble = pipe.nextDouble();
            pipe.nextLine();
            double1 = true;
        }
        else
        {
            trash = pipe.nextLine();
            System.out.println("Enter a valid double instead of \"" +trash+ "\"");
        }

    } while(!double1);

    return retDouble;
    }

/**
 * get ranged integer from User
 *
 * @param pipe   a Scanner opened to read from System.in
 * @param prompt the user
 * @return response that is an integer in a range
 */

public static int getRangedInt(Scanner pipe, String prompt)
{
    int retInt = 0;
    String trash = "";
    boolean integer1 = false;

    do {
        System.out.println("\n" +prompt);

        if (pipe.hasNextInt())
        {
            integer1 = true;
        }
        else
        {
            trash = pipe.nextLine();
            System.out.println("Enter a valid integer instead of \"" +trash+ "\"");
        }
    } while (!integer1);
    return retInt;
}

/**
 * get ranged double from User
 * @param pipe a Scanner opened to read from System.in
 * @param prompt the user for a double
 * @param low low end of the range
 * @param high high end of the range
 * @return response that is a ranged double
 */

public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
{
    double retDouble = 0;
    boolean double1 = false;
    String trash = "";

    do
    {
        System.out.print("\n" + prompt);

        if (pipe.hasNextDouble())
        {
            retDouble = pipe.nextDouble();
            pipe.nextLine();
            if (retDouble >= low && retDouble <= high)
            {
                double1 = true;
            }
            else
            {
                System.out.println("You entered \"" + retDouble + "\"");
                System.out.println("Enter a valid double [" + low + "-" + high + "]");
            }
        }
        else
        {
            trash = pipe.nextLine();
            System.out.println("Enter a valid double not \"" + trash + "\"");
        }
    }while(!double1);

    return retDouble;
}

/**
 * prompt get yes or no from User
 * @param pipe a Scanner opened to read from System.in
 * @param prompt the user for a yes or no
 * @return response that is an answer to a yes or no question
 */

public static boolean getYNConfirm(Scanner pipe, String prompt)
{
    boolean retYesNo = false;
    boolean input = false;
    String response;

    do
    {
        System.out.print("\n" + prompt);
        response = pipe.nextLine();
        if(response.equalsIgnoreCase("Y"))
        {
            retYesNo = true;
            input = true;
        }
        else if(response.equalsIgnoreCase("N"))
        {
            retYesNo = false;
            input = true;
        }
        else
        {
            System.out.println("Invalid Input. Enter [Y/N]");
        }
    }while(!input);
    return retYesNo;
}

    /**
     * @param pipe
     * @param prompt
     * @param regEx
     * @return
     */

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        boolean value = false;
        String trash;
        String retValue;

        do
        {
            System.out.print(prompt + " " + regEx + ": ");
            retValue = pipe.nextLine();

            if (retValue.matches(regEx))
            {
                value = true;
            }
            else
            {
                System.out.println("Enter a matching pattern instead of: " + retValue);
            }
        }while(!value);

        return retValue;
    }

    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int messageWidth = msg.length();
        int padding = (totalWidth - messageWidth - 6) / 2; // Calculate the padding on each side


        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();


        System.out.print("***");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }

        if (messageWidth % 2 != 0) {
            System.out.print(" ");
        }
        System.out.println("***");


        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

