class Container<T>
{
	void show(T abc)
	{
		System.out.println(abc);
		System.out.println(abc.getClass().getName());
	}
}
class generic
{
	public static void main(String args[])
	{
		Container c = new Container();
		c.show("abc");
		c.show(2);
		c.show(true);
	}
}