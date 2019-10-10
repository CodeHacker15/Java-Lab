import java.util.Scanner;

class SumDigits
{
    private int a[],n,len,sum;
    public void get(int n)
    {
        this.n = n;
        len = (int)(Math.log10(n))+1;
        a = new int[len];
        sum = 0;
    }
    public void sum()
    {
        int i,temp = n;
        for(i = len-1;i >= 0;i--)
        {
            a[i] = temp%10;
            temp/=10;
            sum+=a[i];
        }
    }
    public void show()
    {
        System.out.print("The sum of digits = ");
        for(int i = 0;i < len-1;i++)
            System.out.print(a[i]+" + ");
        System.out.print(a[len-1]);
        if(len>1)
            System.out.println(" = "+sum);
        else
            System.out.println();
    }
}
class q2
{
    public static void main(String[] args)
    {
		SumDigits obj = new SumDigits();
        obj.get(Integer.parseInt(args[0]));
        obj.sum();
        obj.show();
    }
}