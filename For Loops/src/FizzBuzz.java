import java.util.Scanner;
public class FizzBuzz 
{
	public static void main( String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		
		for ( int a = 1; a <= 100; a++ )
		{
			System.out.print("\n" + a + ".");
			if ( (a % 3) == 0 )
			{
				System.out.print("fizz");
			}
			if ( (a % 5) == 0 )
			{
				System.out.print("buzz");
			}
		}
	}
}
