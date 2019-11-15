package food;
import supermart.supermart;
public class Food implements supermart
{
	String[] Food = new String[] {"Chips","Choclates","Biscuits","Cake","Milk","Bread"};
	int[] Price = new int[] {20,40,30,250,25,44};
	public String get_item(int x)
	{
		return Food[x];
	}
	public int get_price(int x)
	{
		return Price[x];
	}
}
