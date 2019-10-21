import mypack2.info;
class stubasic
{
	String name;
	int roll;
	String city;
	String branch;
	long contact;
	public void stubasic(String n,int r,String c,String b,long co)
	{
		name = n;
		roll = r;
		city = c;
		branch = b;
		contact = co;
	}
	public void showbasic()
	{
		System.out.println("Name = "+name);
		System.out.println("Roll = "+roll);
		System.out.println("City = "+city);
		System.out.println("Branch = "+branch);
		System.out.println("Contact = "+contact);
	}
}
class academic extends stubasic implements info 
{
	double percentage;
	academic(double p)
	{
		percentage = p;
	}
	public void show()
	{
		stubasic("Siddharth",12,"Jaipur","CCE",9764);
		System.out.println("University Name = "+universityname);
		showbasic();
		System.out.println("Percentage = "+percentage+"%");
	}
}
class sports extends stubasic implements info
{
	int height;
	int weight;
	String game;
	sports(int h,int w,String g)
	{
		height = h;
		weight = w;
		game = g;
	}
	public void show()
	{
		stubasic("Siddharth",12,"Jaipur","CCE",9764);
		System.out.println("University Name = "+universityname);
		showbasic();
		System.out.println("Height = "+height);
		System.out.println("Weight = "+weight);
		System.out.println("Game = "+game);
	}
}
public class demo
{
	public static void main(String args[])
	{
		academic a = new academic(92);
		a.show();
		sports s = new sports(6,78,"Badminton");
		s.show();
	}
}

