import java.util.Scanner;
import java.util.Random;
public class NumbGuessCount
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int number = 1 + r.nextInt(10);
		int guess, counter = 1;

		System.out.println("I have choosen a number between 1 and 10. Try to guess it.");
		System.out.print("Your guess: ");
		guess = keyboard.nextInt();
		
		do
		{
			
			
			counter++;
			System.out.println("That is incorrect. guess again.");
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
		} 	while ( guess != number );
		
		System.out.println("That's right you are a good guesser");
		System.out.println("It only took you " + counter + " tries");
	}
}
