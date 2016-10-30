import java.util.Scanner; //Needed for Scanner class

public class SquareRootLoop
{
	public static void main(String[] args)
	{
		double number, guess, square, actualSquare;  //To hold input and answers
		int i = 0; //To hold increment of loop

		//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		//Ask user for a number
		System.out.print("Enter a number to find it's square root: ");
		number = keyboard.nextDouble();
		actualSquare = Math.sqrt(number);

		//Make a guess
		guess = number/2.0;

		//Find the square root
		while (i < 10)
		{
			guess = (guess + (number/guess)) / 2;
			System.out.println(guess);
			i++;
		}

		//Display the final guess and actual root
		System.out.println("The best guess is: " + guess);
		System.out.println("The actual square root is: " + actualSquare);
	}
}


