import java.util.Scanner;
class Shapes
{
    private double area;
    public void calcArea(double a)
    {
        area=a*a;
    }
    public void calcArea(double a, double b)
    {
        area=a*b;
    }
    public void calcArea(double a, double b, double c)
    {
        double semi=(a+b+c)/2;
        area=Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c));
    }
    public void display()
    {
        System.out.println("Area is: "+area+" square units");
    }
}
class q13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
		Shapes s = new Shapes();
        System.out.println("==========SQUARE==========");
        System.out.print("Enter the side of square = ");
        a=sc.nextDouble();
        s.calcArea(a);
        s.display();
		System.out.println("==========================\n");
        System.out.println("=========RECTANGLE=========");
        System.out.print("Enter the length of the rectangle = ");
        a=sc.nextDouble();
		System.out.print("Enter the breadth of the rectangle = ");
        b=sc.nextDouble();
        s.calcArea(a,b);
        s.display();
		System.out.println("==========================\n");
        System.out.println("==========TRIANGLE==========");
        System.out.print("Enter Side 1 = ");
        a=sc.nextDouble();
		System.out.print("Enter Side 2 = ");
        b=sc.nextDouble();
		System.out.print("Enter Side 3 = ");
        c=sc.nextDouble();
        s.calcArea(a,b,c);
        s.display();
		System.out.println("==========================");
    }
}