import java.util.Random;
public class ShorterDoubleDice
{
	public static void main( String[] args )
	{
		Random r = new Random();
		int dice1, dice2;
		
		System.out.println( "HERE COME THE DICE!" );
		System.out.println();
		do
		{
			dice1 = 1 + r.nextInt(1);
			dice2 = 1 + r.nextInt(1);
			
			System.out.println( "Roll #1: " + dice1 );
			System.out.println( "Roll #2: " + dice2 );
			System.out.println( "The total is " + (dice1 + dice2));
			System.out.println();
		} while ( dice1 != dice2 );
		
		System.out.println( "The dice rolled a double!");
	}
}	