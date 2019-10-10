import java.util.Scanner;
class q12
{  
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);	
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		System.out.println("Enter Matrix A Data");
        for (int i = 0;i < 3;i++)
        {
			for (int j = 0;j < 3;j++)
            {
				System.out.print("Matrix A["+i+"]["+j+"] = ");
                a[i][j] = s.nextInt();
            }
		}
		System.out.println("Enter Matrix B Data");
        for (int i = 0;i < 3;i++)
        {
			for (int j = 0;j < 3;j++)
            {
				System.out.print("Matrix A["+i+"]["+j+"] = ");
                b[i][j] = s.nextInt();
            }
		}
		int c[][] = new int[3][3];
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++)
			{    
				c[i][j]=0;      
				for(int k=0;k<3;k++)         
					c[i][j]+=a[i][k]*b[k][j];      
				System.out.print(c[i][j]+" ");  
			}
			System.out.println();
		}
	}
}	