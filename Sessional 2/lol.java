class lol
{
	static int counter;
	lol()
	{
		counter++;
		System.out.println(counter);
	}	

}
class demo
{
	public static void main(String arg[])
	{
		lol s1 = new lol();
		lol s2 = new lol();
		lol s3 = new lol();
	}
}