import java.util.Scanner;

public class FtoC
{
    public static void main(String[] args)
    {
        //scanner and variable declarations
        Scanner in = new Scanner(System.in);
        double temp;
        double fahrenheit;
        double celsius;
        String choice = "";
        boolean done = false;
        String trash = "";

        do //do while loop that loops until proper input for F or C
        {
            System.out.print("Enter 'C' for Celsius or 'F' for Fahrenheit: ");
            choice = in.nextLine();
            //if statements checking for proper input or C or F
            if (choice.equalsIgnoreCase("C"))
            {
                do { //do while loop checking for proper number input, and converting C to F
                    System.out.print("Enter the Temperature in Celsius: ");
                    while (!in.hasNextDouble())
                    {
                        trash = in.nextLine();
                        System.out.print("Invalid Input! Enter a valid number: ");
                    }
                    temp = in.nextDouble();
                    fahrenheit = (temp * 9/5) + 32;
                    System.out.println(temp + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
                    done = true;
                }while (!done);
            }
            else if (choice.equalsIgnoreCase("F"))
            {
                do { //do while loop checking for proper number input, and converting F to C
                    System.out.print("Enter the Temperature in Fahrenheit: ");
                    while (!in.hasNextDouble())
                    {
                        trash = in.nextLine();
                        System.out.print("Invalid Input! Enter a valid number: ");
                    }
                    temp = in.nextDouble();
                    celsius = (temp - 32) * 5/9;
                    System.out.println(temp + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
                    done = true;
                }while (!done);
            }
            else //error message for invalid input
            {
                System.out.println("Invalid Choice! Please enter 'C' or 'F'. " + choice);
            }
        }while (!choice.equalsIgnoreCase("C") && !choice.equalsIgnoreCase("F"));

    }
}
