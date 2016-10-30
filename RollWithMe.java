import java.util.Random;			//To get a random number


public class RollWithMe				//class name
{
	private int die, result;

	void roll()						//method to get a random number between [1,6]
	{
		Random rand = new Random();		//Create new Random object

		die = rand.nextInt(6) + 1;		//Call method to get a random number
	}

	void setRoll( int die )			//method to set result of die roll
	{
		result = die;
	}

	public int getRoll()			//method to get value of die roll to display
	{
		return die;
	}
}									//end class