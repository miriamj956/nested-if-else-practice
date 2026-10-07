// Import the input scanner. this will make user input possible
import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        // start with asking(printing) the question
        System.out.println("Is it raining True or false?");
        /*like any class you declare it and create an object for it (System.in is something 
        you must add in, probably importing functions or someting) */
        Scanner scan = new Scanner(System.in);
        /* make a variable, and then use the scan.nextwtv depending on what kind 
        of value you are looking for */
        boolean isRain = scan.nextBoolean();
        // i want two questions asked seperately so i put this question here
        System.out.println("Is it cold True or false?");
        //again making another variable
        boolean isCold = scan.nextBoolean();
        
        // making an if statement to check is it true or not
        if (isRain == true)
        {
            // if its true this is printed
            System.out.println("Grab an umbrella!");
        }
            // check if it is true (user input)
            if (isCold == true)
            {
                // print if true
                System.out.println("Make sure you wear a jacket!");
            }
        // elif,, also instead of 'and' as a connector, in java you use &&
        else if(isRain == false && isCold == false)
        {
            // printed it the conditions are met
            System.out.println("Enjoy the weather!");
        }
    }
}
