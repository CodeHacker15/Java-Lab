package toiletries;
import supermart.supermart;
public class toiletries implements supermart
{
	String[] Toiletries = new String[] {"Soap","Shampoo","Towel","Handwash","Brush","Paste"};
	int[] Price = new int[] {30,400,200,150,30,35};
	public String get_item(int x)
	{
		return Toiletries[x];
	}
	public int get_price(int x)
	{
		return Price[x];
	}
}