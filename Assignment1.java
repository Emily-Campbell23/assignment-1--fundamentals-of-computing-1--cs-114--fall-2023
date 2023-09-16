import java.util.Scanner;
import java.util.Random;
/*Goal: Print out initials using letters, E and C. User input, asking for 
degrees Fahrenheit and convert to Celsius, User input, asking for a 5 character string,
reverse it and remove first and last characters, generate a random number between 32 and 16,384 
inclusive, print everything out
 */ 
public class Assignment1 {
  public static void main(String[] args) {
    // prints out initials
    System.out.println("EEEEEEE    CCCCCCCCC");
    System.out.println("EEEEEEE    CCCCCCCCC");
    System.out.println("E          CC");
    System.out.println("EEEEE      CC");
    System.out.println("E          CC");
    System.out.println("EEEEEEE    CCCCCCCCC");
    System.out.println("EEEEEEE    CCCCCCCCC");
    

    // Fahrenheit to Celsius
    Scanner input = new Scanner(System.in); {
    System.out.println("\nPlease enter a number in degrees Fahrenheit: ");
    int farenheit = input.nextInt();
    int celcius = (farenheit - 32) * 5/9; // converts farenheit to celcius
    

    // takes five character string, reverses it and removes the first and last characters
    System.out.println("Please enter a five character string: ");
    String inputString = input.next();
    String reverseString = new StringBuilder(inputString.substring(1, 4)).reverse().toString();
    
    // asks for a random number between 32 and 16384 inclusive
    Random rand = new Random();
    int randomNumber = rand.nextInt(16384 - 32 + 1) + 32;
   
    // prints out celcius, the string, and the random number
    System.out.println(celcius + " " + reverseString + " " + randomNumber);

    
     input.close();
    }
  }
}
