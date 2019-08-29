import java.util.Scanner;
class ComplexNumber
{
	private int real;
	private int img;
	private int sr;
	private int si;
	public void ComplexNumber(int real,int img)
	{
		this.real = real;
		this.img = img;
	}
	public void add(ComplexNumber g1,ComplexNumber g2)
	{
		ComplexNumber g = new ComplexNumber();
		g.sr = g1.real + g2.real; 
		g.si = g1.img + g2.img;
		System.out.println("Sum of the given two complex number :");
		System.out.println(g.sr+" + i"+g.si);
	}
	public void sub(ComplexNumber g1,ComplexNumber g2)
	{
		ComplexNumber g = new ComplexNumber();
		g.sr = g1.real - g2.real; 
		g.si = g1.img - g2.img;
		System.out.println("Sub of the given two complex number :");
		System.out.println(g.sr+" + i"+g.si);
	}
}
class ComplexNumberTest
{
 	public static void main(String args[])
 	{
 		Scanner temp = new Scanner(System.in);
		ComplexNumber c1 = new ComplexNumber();
		ComplexNumber c2 = new ComplexNumber();
		ComplexNumber c3 = new ComplexNumber();
		ComplexNumber c4 = new ComplexNumber();
 		System.out.print("Enter real value of first complex number = ");
 		int r1 = temp.nextInt();
 		System.out.print("Enter img value of first complex number = ");
 		int i1 = temp.nextInt();
 		c1.ComplexNumber(r1,i1);
		System.out.print("Enter real value of second complex number = ");
 		int r2 = temp.nextInt();
 		System.out.print("Enter img value of second complex number = ");
 		int i2 = temp.nextInt();
 		c2.ComplexNumber(r2,i2);
		c3.add(c1,c2);
		c4.sub(c1,c2);
 	}
 }