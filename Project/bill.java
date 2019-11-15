import food.*;
import java.util.Scanner;
public class bill
{
	public static void main(String args[])
	{
		String[] sbill = new String[50];
		int[] tbill = new int[50];
		int[] qbill = new int[50];
		int count = 0,bs = 0;
		int p,q,ch;
		Scanner s = new Scanner(System.in);
		while(bs != 5)
		{
			System.out.println("=========="+name+"==========");
			System.out.println("1. Food");
			System.out.println("2. Electronics");
			System.out.println("3. Clothing");
			System.out.println("4. Toiletries");
			System.out.println("5. Exit");
			System.out.print("Enter your choice = ");
			bs = s.nextInt();
			switch(bs)
			{
				case 1:
					ch = 0;
					Food f = new Food();
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
						if(ch<7)
						{
							sbill[count] = f.get_item(ch-1);
							p = f.get_price(ch-1);
							System.out.print("Quantity = ");
							q = s.nextInt();
							qbill[count] = q;
							tbill[count] = p*q;
							System.out.println(sbill[count]+" "+qbill[count]+" "+tbill[count]);
							count = count + 1;
						}
						else if(ch>7)
						{
							System.out.println("Wrong choice entered!");
						}
						else
						{
							System.out.println("=========================");
						}
					}
					break;
				case 2:
					ch = 0; 
					//aadithya
					break;
				case 3:
					ch = 0;
					//kaveri
					break;
				case 4:
					ch = 0;
					Toiletries t = new Toiletries();
					System.out.println("==========Toiletries==========");
					System.out.println("1. Soap");
					System.out.println("2. Shampoo");
					System.out.println("3. Towel");
					System.out.println("4. Handwash");
					System.out.println("5. Brush");
					System.out.println("6. Paste");
					System.out.println("7. Exit");
					while(ch != 7)
					{
						System.out.print("Enter your choice = ");
						ch = s.nextInt();
						if(ch<7)
						{
							sbill[count] = t.get_item(ch-1);
							p = t.get_price(ch-1);
							System.out.print("Quantity = ");
							q = s.nextInt();
							qbill[count] = q;
							tbill[count] = p*q;
							System.out.println(sbill[count]+" "+qbill[count]+" "+tbill[count]);
							count = count + 1;
						}
						else if(ch>7)
						{
							System.out.println("Wrong choice entered!");
						}
						else
						{
							System.out.println("==============================");
						}
					}
					break;
				default:
					System.out.println("Wrong choice entered!");
			}
		}
	}
}

