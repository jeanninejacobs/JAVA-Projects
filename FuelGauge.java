/**
	The FuelGauge class holds data and methods for the Fuel Guage
*/

public class FuelGauge
{
	//Fields
	private int fuelTank;		//Current amount of fuel in the tank.
	private final int MAXTANK = 15;	//Maximum capacity of fuel tank.

	/**
		constructor
		@param f The amount of fuel in tank to start with.
	*/

	public FuelGauge(int f)
	{
		fuelTank = f;
	}

	/**
		fillTank method
		@param f The amount of fuel to add or subtract from the fuel tank.
	*/

	public void fillTank(int f)
	{
		if (fuelTank + f < MAXTANK)
		{
			fuelTank += f;
			if (fuelTank == MAXTANK)
			{
				System.out.println("Your tank is full!");
			}
			else
			{
				System.out.println("You have " + fuelTank + " gallons in your tank.");
			}
		}
		else
		{
			System.out.println("Too much fuel, you can only add "
				+ (MAXTANK - fuelTank) + " gallons.");
		}
	}

	/**
		getFuelLevel method
		@return The current amount of fuel in the tank.
	*/

	public int getFuelLevel()
	{
		return fuelTank;
	}

} //End Class

