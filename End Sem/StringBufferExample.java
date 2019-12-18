class StringBufferExample
{
	public static void main(String args[])
	{
		StringBuffer sf = new StringBuffer("helloo");
		sf.append("java"); //appends java in the end 
		sf.insert(0,"java"); //inserts java at 0 index
		sf.replace(5,6,"java"); //replace element from index 5 to index 6 with java
		sf.delete(0,5); //delete element from index 0 to 4 
		sf.reverse(); //reverses string
		System.out.println(sf.charAt(2));
		System.out.println(sf.length());
		sf.substring(1);
		sf.substring(0,sf.length());
		System.out.println(sf.capacity());
		System.out.println(sf);
	}
}