import java.util.Scanner;
abstract class shape
{
	Scanner s1 = new Scanner(System.in);
	public double r;
	public double area;
	public double side1,side2;
	public abstract void area();
	void display()
	{
		System.out.println("Im am abstract class ka method");
	}
}
class circle extends shape
{
	public void area()
	{
		System.out.print("Enter radius = ");
		r = s1.nextDouble();
		area = 3.14 * r * r;
		System.out.println("Area of circle = "+area);
	}
}
class rectangle extends shape
{
	public void area()
	{
		System.out.print("Enter length of side 1 = ");
		side1 = s1.nextDouble();
		System.out.print("Enter length of side 2 = ");
		side2 = s1.nextDouble();
		area = side1 * side2;
		System.out.println("Area of rectangle = "+area);
	}	
}
class square extends shape
{
	public void area()
	{
		System.out.print("Enter length of side = ");
		side1 = s1.nextDouble();
		area = side1 * side1;
		System.out.println("Area of square = "+area);
	}
}
class demo
{
	public static void main(String args[])
	{
		int ch = 0;
		Scanner s1 = new Scanner(System.in);
		shape s;
		while(ch != 4)
		{
			System.out.println("==========MENU==========");
			System.out.println("1. Circle");
			System.out.println("2. Rectangle");
			System.out.println("3. Square");
			System.out.println("4. Exit");
			System.out.print("Enter your choice = ");
			ch = s1.nextInt();
			switch(ch)
			{
				case 1:
					s = new circle();
					s.area();
					System.out.println("========================\n");
					break;
				case 2:
					s = new rectangle();
					s.area();
					System.out.println("========================\n");
					break;
				case 3:
					s = new sqaure();
					s.area();
					System.out.println("========================\n");
					break;
				case 4:
					break;
				default:
					System.out.println("Wrong Input! Try Again!");
					System.out.println("========================\n");
					break;
			}
		}
	}
}
