import java.util.Scanner;  //Needed for the Scanner class
import java.io.*;			//Needed to read/write to a file

public class TestScoresCalculatorTest
{
	public static void main(String[] args)
	{
		int numScores = 0;	//To hold the number of test scores to be entered.

		//Create new Scanner object.
		Scanner keyboard = new Scanner(System.in);

		//Ask user how many test scores they want to process.

		System.out.print("How many test scores would you like to enter? ");
		numScores = keyboard.nextInt();

		//Loop to fill array
		double[] scores = new double[numScores];  //Array to hold test scores.

		for(int i=0; i < numScores; i++)
		{
			//Ask for test score.
			System.out.print("Enter a test score: ");
			scores[i] = keyboard.nextDouble();
		}

		//Print array
		printArray(scores);
	}
		/** The printArray method accepts an array as an argument and displays its contents.
			@param array A reference to the array.
		*/

		public static void printArray(double[] array)
		{
			for(double value : array)
			{
				System.out.println(value);
			}
		}
}