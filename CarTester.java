import java.util.Scanner;

/**
This program creates and runs a car using the FuelGauge and Odometer classes.
*/

public class CarTester
{
	public static void main(String[] args)
	{
		//Variables
		int startingMileage; //to hold value for odometer constructor
		int startingFuel;	//to hold value for fuel tank constructor
		int gallons;	//to hold amount of fuel to put in tank
		int miles; 		//to hold miles on odometer
		String answer;	//to hold user answer to start program

		//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		//Ask user to start engine
		System.out.print("Would you like to go for a drive? Y or N? ");
		answer = keyboard.nextLine();

		if (answer.equalsIgnoreCase("Y"))
		{
			//Get starting mileage and fuel level
			System.out.print("Enter starting mileage: ");
			startingMileage = keyboard.nextInt();

			System.out.print("Enter starting amount of fuel: ");
			startingFuel = keyboard.nextInt();

			//Create a FuelGuage object
			FuelGauge carFuel = new FuelGauge(startingFuel);

			//Create a Odometer object
			Odometer carMiles = new Odometer(startingMileage);

			gallons = carFuel.getFuelLevel();
			miles = carMiles.getMileage();

			//outter loop controls fuel guage
			while (gallons > 0)
			{
				int i = 1;

				//innter loop controls odometer
				for (; i <= 24; i++)
				{
					carMiles.setMileage(1);
					try{Thread.sleep(100);}catch(Exception e){}
				}

				i = 1;

				//Ask to refuel when gas tank reaches 1 gal
				if (gallons == 1)
				{
					System.out.println("You are running low on fuel, would you like add gas?");
					System.out.println("If so, enter whole amount up to 14 gallons. If not, enter 0: ");
					int gas = keyboard.nextInt();

					//add gas to tank and display current fuel level
					if (gas <= 14 && gas >= 1)
					{
						carFuel.fillTank(gas);
						gallons = carFuel.getFuelLevel();
						System.out.println("Current fuel guage reading: " + gallons);
					}
					else
					{
						carFuel.fillTank(-1);
						gallons = carFuel.getFuelLevel();
					}
				}
				else
				{
					carFuel.fillTank(-1);
					gallons = carFuel.getFuelLevel();

				}

				//display current odometer reading
				miles = carMiles.getMileage();
				System.out.println("Current odometer reading: " + miles);
				System.out.println(" ");


			}
			System.out.println("Thanks for the ride!");
		}
		else
		{
			System.out.println("Thanks anyway!");
		}
	} //End main
} //End class




