import java.util.Scanner;  //Needed for the Scanner class
import java.io.*;			//Needed to read/write to a file

public class TestScoresCalculator
{
	public static void main(String[] args) throws IOException
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
		System.out.println("The scores you entered are: ");
		printArray(scores);

		//Sort array least to greatest score
		double minValue;
		int index, startScan, minIndex;

		for(startScan = 0; startScan < (scores.length-1); startScan++)
		{
			minIndex = startScan;
			minValue = scores[startScan];

			for(index = startScan + 1; index < scores.length; index++)
			{
				if (scores[index] < minValue)
				{
					minValue = scores[index];
					minIndex = index;
				}
			}
			scores[minIndex] = scores[startScan];
			scores[startScan] = minValue;
		}

		//Print array
		System.out.println("Your scores in ascending order are: ");
		printArray(scores);

		//Save array in a file
		try
		{
			PrintWriter outputFile = new PrintWriter("TestScores.txt");
			for(int i = 0; i < numScores; i++)
			{
				outputFile.println(scores[i]);
			}
			outputFile.close();
		}
		catch(Exception e)
		{
		    e.printStackTrace(); // output an error to user
		}

		System.out.println("Your scores have been saved to TestScores.txt ");
		System.out.println(" ");

		//open file
		File file = new File("TestScores.txt");
		Scanner inputFile = new Scanner(file);

		//Read lines until no more are left.
		int count = 0;
		while (inputFile.hasNext())
		{
			//Read the next name.

			double number = inputFile.nextDouble();
			scores[count] = number;
			count++;
		}

		//Close the file
		inputFile.close();

		printArray(scores);

		//Process test scores and apply curve (4x/5+20)
		for(int i = 0; i < numScores; i++)
		{
			scores[i] = (scores[i] * 4) / 5 + 20;
		}

		//Print array
		System.out.println("Your scores after applying a curve are: ");
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
			System.out.println(" ");
		}

}
