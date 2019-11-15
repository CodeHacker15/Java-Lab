//if withdrawl amount is more than 50k then 1% will be deducted by sbi,25 by boi,3% by axis
import java.util.Scanner;
import java.util.Random;
class insufficient extends Exception
{
	insufficient()
	{
		super("The amount you want to withdraw will make your balance negative!");
	}
}
abstract class bank
{
	Random rand = new Random();
	Scanner s1 = new Scanner(System.in);
	public int acno;
	public double bal;
	public String b_name;
	public abstract void withdraw(double val);
	public abstract void deposit(double val);
	public abstract void show(int acno);
}
class SBI extends bank 
{
	String b_name = "SBI";
	double bal = rand.nextInt(50000);
	double val;
	public void withdraw(double val)
	{
		try
		{
			if((bal - val)<0)
			{
				throw new insufficient();
			}
			else
			{
				bal = bal - val;
				System.out.println("Amount Withdrawed is = "+val);	
			}
		}
		catch(insufficient i)
		{
			System.out.println(i);
		}	
	}
	public void deposit(double val)
	{
		bal = val + bal;
	}
	public void show(int acn)
	{
		acno = acn;
		System.out.println("============"+b_name+"============");
		System.out.println("Account No = "+acno);
		System.out.println("Bank Name = "+b_name);
		System.out.println("Current Balance = "+bal);
		System.out.println("==================================");
	}
}
class BOI extends bank
{
	String b_name = "BOI";
	double bal = rand.nextInt(50000);
	double val;
	public void withdraw(double val)
	{
		try
		{
			if((bal - val)<0)
			{
				throw new insufficient();
			}
			else
			{
				bal = bal - val;
				System.out.println("Amount Withdrawed is = "+val);	
			}
		}
		catch(insufficient i)
		{
			System.out.println(i);
		}
	}
	public void deposit(double val)
	{
		bal = val + bal;
	}
	public void show(int acn)
	{
		acno = acn;
		System.out.println("============"+b_name+"============");
		System.out.println("Account No = "+acno);
		System.out.println("Bank Name = "+b_name);
		System.out.println("Current Balance = "+bal);
		System.out.println("==================================");
	}
}
class AXIS extends bank
{
	String b_name = "AXIS";
	double bal = rand.nextInt(50000);
	double val;
	public void withdraw(double val)
	{
		try
		{
			if((bal - val)<0)
			{
				throw new insufficient();
			}
			else
			{
				bal = bal - val;
				System.out.println("Amount Withdrawed is = "+val);	
			}
		}
		catch(insufficient i)
		{
			System.out.println(i);
		}
	}
	public void deposit(double val)
	{
		bal = val + bal;
	}
	public void show(int acn)
	{
		acno = acn;
		System.out.println("============"+b_name+"============");
		System.out.println("Account No = "+acno);
		System.out.println("Bank Name = "+b_name);
		System.out.println("Current Balance = "+bal);
		System.out.println("===================================");
	}
}
class demo
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int acno;
		double val;
		int a = 0,ch = 0,chi = 0;
		System.out.print("Enter Account No = ");
		acno = s.nextInt();
		while(a != 2)
		{
			System.out.println("==========BANK==========");
			System.out.println("1. SBI");
			System.out.println("2. BOI");
			System.out.println("3. AXIS");
			System.out.println("4. Exit");
			System.out.print("Enter your choice = ");
			ch = s.nextInt();
			if(ch < 4)
				a = 1;
			else
				a = 2;
			bank b = new SBI();
			switch(a)
			{
				case 1:
					
					while(chi != 4)
					{
						System.out.println("1. Deposit");
						System.out.println("2. Withdraw");
						System.out.println("3. Show");
						System.out.println("4. Exit");
						System.out.print("Enter your choice = ");
						chi = s.nextInt();
						switch(chi)
						{
							case 1:
								System.out.print("Enter amount = ");
								val = s.nextDouble();
								b.deposit(val);
								System.out.println("========================\n");
								break;
							case 2:
								System.out.print("Enter amount = ");
								val = s.nextDouble();
								b.withdraw(val);
								System.out.println("========================\n");
								break;
							case 3:
								b.show(acno);
								System.out.println("========================\n");
								break;
							case 4:
								System.out.println("========================\n");
								break;
							default:
								System.out.println("Wrong Input! Try Again!");
								System.out.println("========================\n");
								break;
						}
					}
				case 2:
					System.out.println("========================\n");
					break;
				default:
					System.out.println("Wrong Input! Try Again!");
					System.out.println("========================\n");
					break;
			}
		}
	}
}