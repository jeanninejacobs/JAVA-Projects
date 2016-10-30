public class Stars
{
	public static void main(String[] args)
	{
		int j=1, end = 1;

		for (int i=0; i<10; i++)
		{
			while (j<=end)
			{
				System.out.print("*");
				j++;
			}

			System.out.println();
			end++;
			j=1;
		}

		System.out.println();

		end = 1;
		j = 1;
		int s = 10, space = 10;

		for (int i=0; i<10; i++)
				{
					while (j <= end)
					{
						while (s > 0)
						{
							System.out.print(" ");
							s--;
						}

						System.out.print("*");
						j++;
					}

					System.out.println();
					end++;
					j=1;
					s = space - 1;
					space--;
		}
	}
}