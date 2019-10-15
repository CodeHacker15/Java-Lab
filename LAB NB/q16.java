import java.util.Scanner;
class ItemSheet
{
    private static ItemSheet instance = null;
    private String item_names[];
    private int count;
    private ItemSheet()
    {
        item_names = new String[100];
        count = 0;
    }
    public static ItemSheet getInstance()
    {
        if(instance==null)
            instance = new ItemSheet();
        return instance;
    }
    public void addItem(String name)
    {
        item_names[count++] = name;
    }
    public void displaySheet()
    {
        System.out.println("Total number of Items in list are = "+count);
        if(count>0)
        {
            System.out.println("Items : ");
            for (int i = 0; i < count; i++)
                System.out.println((i + 1) + ") " + item_names[i]);
        }
    }
}
class q16
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("To Stop Entering Items, enter \"Exit\".");
        while(true)
        {
            System.out.print("Enter Item Name = ");
            String item_name = s.nextLine();
            if(item_name.equalsIgnoreCase("Exit"))
                break;
            ItemSheet obj = ItemSheet.getInstance();
            obj.addItem(item_name);
        }
        ItemSheet obj = ItemSheet.getInstance();
        obj.displaySheet();
    }
}