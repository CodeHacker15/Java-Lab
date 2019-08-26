class Calculate
{
	static int a=3;
	static int b;
	static void cube(int x)
	{
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
	}
	static
	{
		System.out.println("Output is = ");
		b=a*4;
	}
	public static void main(String args[])
	{
		Calculate.cube(5);
	}
}