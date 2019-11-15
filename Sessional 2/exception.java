import packageexception.lowage;
class test
{
	public void check(int x) throws lowage
	{
		if(x < 18)
		{
			throw new lowage();
		}
		else
		{
			System.out.println("Valid Age");
		}
	}
}
class exp55
{
	public static void main(String args[])
	{
		test t1 = new test();
		try
		{
			t1.check(14);
		}
		catch(lowage e)
		{
			System.out.print(e);
		}
		finally 
		{
			System.out.print("kokoko");
		}
	}
}

