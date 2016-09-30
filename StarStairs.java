public class StarStairs
{
	
	public static void main(String[] args)
	{
		descending(4);
		ascending(4);
	}
	
	public static void descending(int n)
	{
	
		int y = 0;
		int z = n;
		while (y < n)
		{
			int x = 0;
			while (x < z)
			{
				System.out.print("*");
				x ++;
			}
			System.out.println("");
			z = z - 1;
			y ++;
		}
	}
	
	public static void ascending(int n)
	{
		int z = 1;
		while (z <= n )
		{
			int x = 0;
			while (x < z)
			{
				System.out.print("*");
				x ++;
			}
			System.out.println("");
			z ++;
			
		}
	}
	






















}