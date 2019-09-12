import java.util.Scanner;
class employee
{
	private int emp_id;
	private String name;
	private String designation;
	private String dept;
	private int salary;
	private static int c = 0;
	public employee()
	{
		emp_id = ++c;
	}
	public employee(String name,String designation,String dept,int salary)
	{
		this.name = name;
		this.designation = designation;
		this.dept = dept;
		this.salary = salary;
		emp_id = ++c;
	}
	public void show()
	{
		System.out.println("===========ShowingData===========");
		System.out.println("Id = "+emp_id);
		System.out.println("Name = "+name);
		System.out.println("Designation = "+designation);
		System.out.println("Department = "+dept);
		System.out.println("Salary = "+salary);
		System.out.println("=================================");
	}
	public static void search(employee e[],int eid,int n)
	{
		for(int i = 0;i < n;i++)
		{
			if(e[i].emp_id == eid)
			{
				e[i].show();	
				return;
			}
		}
		System.out.println("Invalid ID");
	}
}
class data
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		System.out.print("How many employes are present in your company = ");
		int n = s1.nextInt();
		employee e[] = new employee[n];
		for(int i = 0;i < n;i++)
		{
			System.out.println("===========GettingData===========");
			System.out.print("Please enter your Name = ");
			String name = s2.next();
			System.out.print("Please enter your Designation = ");
			String designation = s2.next();
			System.out.print("Please enter your Department = ");
			String dept = s2.next();
			System.out.print("Please enter your Salary = ");
			int salary = s1.nextInt();
			e[i] = new employee(name,designation,dept,salary);
			System.out.println("=================================");
		}
		System.out.print("Enter the ID you want to show data of = ");
		int emp_id = s1.nextInt();
		employee.search(e,emp_id,n);
	}
}
