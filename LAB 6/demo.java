import java.util.Scanner;
abstract class shape
{
	Scanner s1 = new Scanner(System.in);
	public double r;
	public double area;
	public double side1,side2;
	public abstract void area();
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
		Scanner s1 = new Scanner(System.in);
		shape sc = new circle();
		shape sr = new rectangle();
		shape ss = new square();
		System.out.println("\n=========Circle!=========");
		sc.area();
		System.out.println("=========================");
		System.out.println("\n=========Rectangle!=========");
		sr.area();
		System.out.println("============================");
		System.out.println("\n=========Square!=========");
		ss.area();
		System.out.println("=========================");
	}
}
/*
System.out.println("1. Circle");
System.out.println("2. Rectangle");
System.out.println("3. Square");
System.out.print("Enter your choice = ");
int ch = s1.nextInt();
switch(ch)
{
	case 1:
		sc.area();
		break;
	case 2:
		sr.area();
		break;
	case 3:
		//ss.area();
		break;
	default:
		System.out.println("Wrong Input!");
		break;
	}
*/