import java.util.Scanner;
class q3
{
	public static void main(String args[])
	{
		int a[],n,i,j,len;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter original length of array = ");
		n = s.nextInt();
		a = new int[n];
		for(i = 0;i < n;i++)
		{
			System.out.print("A["+i+"] = ");
			a[i] = s.nextInt();
		}
		len = 0;
		for(i = 0;i < n;i++)
		{
			a[len++] = a[i];
			for (j = 0;j < len-1;j++)
			{
				if (a[i] == a[j])
				{
					len--;
					break;
				}
			}
		}
		n = len;
		System.out.println("Length after removal of duplicates: "+n);
	}
}
