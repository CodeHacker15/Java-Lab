import java.util.Scanner;
class q8
{
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		n = s.nextInt();
		for(i = 0;i < n;i++)
		{
			for(j = n;j > i;j--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
