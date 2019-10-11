import java.util.Scanner;
class q4
{
	public static void main(String args[])
	{
		int n,ans,c,d,swap,i,tmp=1;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of n = ");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" integers :");
		for(c = 0;c < n;c++)
		{
			System.out.print("Array["+c+"] = ");
			a[c] = s.nextInt();
		} 
        ans=1;
        for(c = 0;c < (n-1);c++)
		{
			for(d = 0;d < n-c-1;d++) 
			{
				if(a[d] > a[d+1])
				{
					swap = a[d];
					a[d] = a[d+1];
					a[d+1] = swap;
				}
			}
		}
        for(i = 1;i < n;i++)
        {
            if(a[i] == a[i-1]+1)
                tmp++;
            else
                tmp = 1;
            ans = Math.max(ans,tmp);
        }
		System.out.println("Length of longest consecutive element sequence: "+ans);
	}
}