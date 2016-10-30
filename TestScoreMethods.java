import java.util.Scanner;  //Needed for the Scanner class
import java.io.*;			//Needed to read/write to a file

public class TestScoreMethods
{
	//Method to print array

	public static void printArray(array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println(" ");
	}

	//Method to sort array in ascending order.

	public static void selectionSort (array)
	{
		double startScan, index, minIndex, minValue;

		for(startScan = 0.0; startScan < (array.length-1); startScan++)
		{
			minIndex = startScan;
			minValue = array[startScan];
			for(index = startScan + 1; index < array.length; index++)
			{
				if (array[index] < minValue)
				{
					minValue = array[index];
					minIndex = index;
				}
			}
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
		}
	}
}
