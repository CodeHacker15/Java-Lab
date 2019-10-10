import java.util.Scanner;
class q9
{
	public static void main(String args[])
	{
		double basic,gross,net;
		double DA,HRA,PF;
        final double CCA=240,PT=100;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Employee No = ");
		int empno = s.nextInt();
		System.out.print("Enter Salary = ");
		String empname = s.next();
		System.out.print("Enter Basic = ");
		basic = s.nextDouble();
        DA=basic/2; 
        HRA=basic/4;
        PF=basic/10;
        gross=basic+HRA+DA+CCA;
        net=gross-PF-PT;
		System.out.println("==========Data==========");
		System.out.println("Name : "+empname);
        System.out.println("Employee No : "+empno);
        System.out.println("Basic salary : Rs. "+basic);
        System.out.println("Gross salary : Rs. "+gross);
        System.out.println("Net salary : Rs. "+net);
		System.out.println("========================");
	}
}
