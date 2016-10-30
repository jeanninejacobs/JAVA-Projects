import javax.swing.JOptionPane;
import java.util.Random;

/**
	This program will roll a six-sided die if user types yes.
*/

public class MakeMethod
{
	public static void main(String[] args)
	{
		String answer; 	//To hold user input
		int die; 		//To hold result of die roll

		//Ask user to role the die
		answer = JOptionPane.showInputDialog("Enter Y to roll the die or N to quit: ");

		//If user answers yes, role the die and display result
		if ("y".equals(answer) || "Y".equals(answer))
		{
			die = rollDie();												//Call method to "roll the die"
			JOptionPane.showMessageDialog(null, "You rolled a " + die);		//Display result
		}
		System.exit(0);						//Exit JOptionPane

	}

		//rollDie Method - get a random number between [0-6] and return result
		public static int rollDie()
		{
			Random rand = new Random();		//create new random object

			int roll;						//to hold random number
			roll = rand.nextInt(6) + 1;		//get random number
			return roll;					//return result
		}
}