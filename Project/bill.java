import food.*;
import java.util.Scanner;
public class bill
{
	public static void main(String args[])
	{
		String[] sbill = new String[50];
		int[] tbill = new int[50];
		int[] qbill = new int[50];
		int count = 0;
		int p;
		int q;
		Scanner s = new Scanner(System.in);
		Food f = new Food();
		int ch = 0;
		System.out.println("==========Food==========");
		System.out.println("1. Chips");
		System.out.println("2. Choclates");
		System.out.println("3. Biscuits");
		System.out.println("4. Cake");
		System.out.println("5. Milk");
		System.out.println("6. Bread");
		System.out.println("7. Exit");
		while(ch != 7)
		{
			System.out.print("Enter your choice = ");
			ch = s.nextInt();
			switch(ch)
			{
				case 1:
					sbill[count] = f.get_item(ch-1);
					p = f.get_price(ch-1);
					System.out.print("Quantity = ");
					q = s.nextInt();
					qbill[count] = q;
						tbill[count] = p*q;
					System.out.println(sbill[count]+" "+qbill[count]+" "+tbill[count]);
					count = count + 1;
					break;
			}
		}
	}
}

