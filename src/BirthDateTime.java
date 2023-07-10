import java.util.*;

class BirthDateTime
{
    //Main method
    public static void main(String[] args)
    {
//Scanner object
        Scanner pipe = new Scanner(System.in);

//Reading year
        int year = getRangedInt(pipe, "Enter Birth Year [1950-2015]: ", 1950, 2015);
        int month = getRangedInt(pipe, "Enter Birth Month [1-12]: ", 1, 12);

        int day=0;

//Switch for date
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: day = getRangedInt(pipe, "Enter Birth Day [1-31]: ", 1, 31); break;

            case 4:
            case 6:
            case 9:
            case 11: day = getRangedInt(pipe, "Enter Birth Day [1-30]: ", 1, 30); break;

            case 2: day = getRangedInt(pipe, "Enter Birth Day [1-29]: ", 1, 29); break;
        }

//Reading hours
        int hours = getRangedInt(pipe, "Enter Birth Time Hours [1-24]: ", 1, 24);
        int minutes = getRangedInt(pipe, "Enter Birth Time Minutes [1-59]: ", 1, 59);

//Printing output
        System.out.println("\n\nBirthday Date: " + day + "-" + month + "-" + year);
        System.out.println("\nBirthday Time: " + hours + ":" + minutes + "\n\n");
    }

    //Method that reads range
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int val=0;
        do
        {
//Printing prompt
            System.out.print(prompt);

            if(pipe.hasNext())
            {
//Reading value
                val = pipe.nextInt();
            }

//Reading trash
            pipe.nextLine();
        }while(val<low || val>high);

        return val;
    }
}


