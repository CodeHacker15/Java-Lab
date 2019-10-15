import java.util.Scanner;
import java.util.Random;
class customer
{
	private int C_Id,IFSC,C_Bal;
	private String C_Name,B_Name;
	public customer()
	{
		Random rand = new Random();
		C_Bal = rand.nextInt(999999);
		IFSC = rand.nextInt(9999);
	}
	public void get(int cid,String cname,String bname)
	{
		C_Id = cid;
		C_Name = cname;
		B_Name = bname;
	}
	public int check_id(int cid)
	{
		if(C_Id == cid)
			return 1;
		else
			return 0;
	}
	public void show()
	{
		System.out.println("============"+B_Name+"============");
		System.out.println("Customer Id = "+C_Id);
		System.out.println("Customer Name = "+C_Name);
		System.out.println("Bank Name = "+B_Name);
		System.out.println("IFSC Code = "+"IFSC"+IFSC);
		System.out.println("Current Balance = "+C_Bal);
		System.out.println("==================================");
	}
}
class demo
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		customer c1 = new customer();
		System.out.println("=========Welcome to World Wide Bank Services=========");
		System.out.print("Please enter your Customer Id = ");
		int cid = s1.nextInt();
		System.out.print("Please enter your Name = ");
		String cname = s2.nextLine();
		System.out.print("Please enter your Bank Name = ");
		String bname = s2.nextLine();
		System.out.println("======================Thank You======================\n");
		c1.get(cid,cname,bname);
		System.out.print("Enter your Customer Id to show your data = ");
		int cid_check = s1.nextInt();
		int val = c1.check_id(cid_check);
		if(val != 1)
			System.out.println("Invalid Id!");
		else
		{
			System.out.print("Correct Id! \n");
			c1.show();
		}
	}
}