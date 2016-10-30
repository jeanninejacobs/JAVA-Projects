/**
	The Odometer class holds data and methods for the Odometer
*/

public class Odometer
{
	//Fields
	private int mileage;	//current mileage of car.
	final int MAXMILEAGE = 999999;	//maxium amout of mileage allowed on car.

	/**
		constructor
		@param m The car's initial mileage.
	*/

	public Odometer(int m)
	{
		if (m < MAXMILEAGE)
		{
			mileage = m;
		}
		else
		{
			System.out.println("Please enter a mileage under 999,999 ");
		}
	}

	/**
		setMileage method
		@param m Increment mileage by one mile.
	*/

	public void setMileage(int m)
	{
		if (mileage + m < MAXMILEAGE)
		{
			mileage += m;
		}
		else
		{
			mileage = 0;
		}
	}


	/**
		getMileage method
		@return The current mileage of the car.
	*/

	public int getMileage()
	{
		return mileage;
	}
}
