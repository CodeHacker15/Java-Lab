import java.util.Scanner;
class Fibonacci
{
    private int a[],n;
    private double avg;
    public Fibonacci(int n)
    {
        this.n = n;
        a = new int[this.n];
        avg = 0.0;
    }
    public void avg()
    {
        int sum = 0,i;
        a[0] = a[1] = 1;
        for(i=2;i<n;i++)
            a[i]=a[i-1]+a[i-2];
        for(i=0;i<n;i++)
            sum+=a[i];
        avg=(double)(sum)/n;
    }
    public void show()
    {
        System.out.print("The first "+n+" Fibonacci numbers are: ");
        for(int i = 0;i < n-1;i++)
            System.out.print(a[i]+" ");
        System.out.println(a[n-1]);
        System.out.println("The average is "+avg);
    }
}
class q1
{
    public static void main(String[] args)
    {
        Fibonacci obj=new Fibonacci(Integer.parseInt(args[0]));
        obj.avg();
        obj.show();
    }
}