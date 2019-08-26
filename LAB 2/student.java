class student 
{
	private int roll,marks;
	private String name,city;
	/*public student(int r,int m,String n,String c)
	{
		roll=r;
		marks=m;
		name=n;
		city=c;
	}*/
	public void getdata(int r,int m,String n,String c)
	{
		roll=r;
		marks=m;
		name=n;
		city=c;
	}
	public void showdata()
	{
		System.out.println("Name = " +name);
		System.out.println("Roll = " +roll);
		System.out.println("Marks = " +marks);
		System.out.println("City = " +city);
	}
}
class demo
{
	public static void main(String arg[])
	{
		student s1=new student();
		//s1.showdata();
		// this will give default value of int and string which is 0 and null respectively
		s1.getdata(10,90,"Sid","Jaipur");
		//s1.roll=20;
		//wont work as roll is private data member and cant be accessed from a diff class 
		s1.showdata();
		/* ===================================================== 
		student s1=new student(10,90,"Sid","Jaipur");
		instead of using getdata we can enter in student just like done above 
		also if you wanna add student s2=new student();
		you will have to add default constructor student();
		*/
	}
}