import java.util.Scanner;

public class UnicornTester2
{
    public static void main(String[] args)
    {
      	Scanner input = new Scanner(System.in);

		String unicornName;
		String unicornColor;

      	System.out.print( "What is your Unicorn's name?: ");
		unicornName = input.nextLine();

		System.out.print( "What color is your Unicorn?: ");
		unicornColor = input.nextLine();

		MyUnicorn myNewUnicorn = new MyUnicorn( unicornName, unicornColor );

		System.out.println();
		System.out.println( "**POOF!!**");
		System.out.println();
		System.out.printf( "You see a beautiful %s Unicorn standing before you.", myNewUnicorn.getColor() );
		System.out.println(); System.out.println();
      	System.out.printf( "'Hello, my name is %s.' the Unicorn says with a bow.", myNewUnicorn.getName() );
      	System.out.println(); System.out.println();
      	System.out.println( "Suddenly, the Unicorn rises up on her hind legs and says,");

     	myNewUnicorn.remark();

    } // end main

} // end MyUnicorn

