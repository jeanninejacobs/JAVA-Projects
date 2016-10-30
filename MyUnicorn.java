public class MyUnicorn
{
	private String name;   		// private string variable name holds name of Unicorn
	private String color;		// private string variable name holds color or Unicorn

	public MyUnicorn(String unicornName, String unicornColor)  	// constructor, creates Unicorn object
	{
		name = unicornName;			// contains Unicorn's name
		color = unicornColor;		// contains Unicorn's color
	}

public String getName( )				//method to get name from class to display
{
	return name;
}

void setName( String unicornName )		//method to set name from user input
{
	name = unicornName;
}

public String getColor()				//method to get name from class to display
{
	return color;
}

void setColor ( String unicornColor )	//method to set name from user input
{
	color = unicornColor;
}

void remark()							//What's a Unicorn without a Python reference?
{
	System.out.println();
	System.out.println( "'And now for something completely different...'");
	System.out.println();
}

} // end class MyUnicorn