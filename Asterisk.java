import java.util.Scanner; //Needed for Scanner class

public class Asterisk
{
	public static void main(String[] args)
	{
		//Create a string with 10 asterisks
		String stars = "**********", line;
		int i = 0;

		//Print out first triangle of left justified decending stars
		while (i < 9)
		{
			line = stars.charAt(0);
			System.out.println(line);
			i++;
		}

		i = 0;

		while (i < 9)
		{
			line = stars.charAt(0);
			System.out.printf("%10s", line);
			i++;
		}
	}
}


