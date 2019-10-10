class Count
{
    private static int counter = 0; 
    public Count()
    {
        ++counter;
    }
    public static int getCounter()
    {
        return counter;
    }
}
class q15
{
    public static void main(String[] args)
    {
        Count obj1=new Count();
        Count obj2=new Count();
        Count obj3=new Count();
        Count obj4=new Count();
        System.out.println("\nNumber of objects created: "+Count.getCounter());
    }
}