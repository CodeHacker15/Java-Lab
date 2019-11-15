import java.util.Random;
class depositlimitexceed extends Exception
{
	depositlimitexceed()
	{
		super("The amount you entered to deposit is more than the limit");
	}
}
class withdrawnegative extends Exception
{
	withdrawnegative()
	{
		super("The amount you want to withdraw will make your balance negative!");
	}
}
class bank
{
	Random rand = new Random();
	double bal = rand.nextInt(50000);
	double dval;
	double wval;
	public void bank(double withdraw, double deposit) throws depositlimitexceed,withdrawnegative
	{
		dval = deposit;
		wval = withdraw;
		if((bal - wval)<0)
		{
			throw new withdrawnegative();
		}			
		else
		{
			bal = bal - wval;
			System.out.println("Amount Withdrawed is = "+wval);	
		}
		if(dval >= 100000)
		{
			throw new depositlimitexceed(); 
		}
		else
		{
			bal = bal + dval;
			System.out.println("Amount Deposited is = "+dval);
		}	
	}
}
class demo
{
	public static void main(String args[])
	{
		bank b = new bank();
		try
		{
			b.bank(100000,4000);
		}
		catch(depositlimitexceed de)
		{
			System.out.println(de);
		}	
		catch(withdrawnegative wn)
		{
			System.out.println(wn);
		}
	}
}