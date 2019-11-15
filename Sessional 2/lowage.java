package packageexception;
public class lowage extends Exception
{
	public lowage()
	{
		super("You are not eligible to vote ");
	}
}