import java.util.Scanner;			//Needed to get user input

public class RollWithMeTrial		//Class name
{
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);		//Create new Scanner object

		String userInput;							//To hold user input
		int result;									//To hold the result of the die roll

		System.out.print( "Would you like to roll the die? Y or N: ");		//Asks user for input
		userInput = input.nextLine();										//Stores input into variable

		RollWithMe myDieRoll = new RollWithMe();	//Create new myDieRoll object

		if ("y".equalsIgnoreCase(userInput))		//Evaluate user input
		{
			myDieRoll.roll();						//Call die roll method
			result = myDieRoll.getRoll();			//Store result as variable

			System.out.printf("You rolled a %s ", myDieRoll.getRoll() );	//Display result of die roll
			System.out.println();
		}
	}			//exit main
}			//exit class



