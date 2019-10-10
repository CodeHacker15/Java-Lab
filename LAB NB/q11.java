import java.util.Scanner;
class q11
{  
	public static void main(String args[])
	{  
		int n,i,key,first = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Input number of integers to sort = ");
		n = s.nextInt();
		int last = n;
		int arr[] = new int[n];
		System.out.println("Enter "+n+" integers :");
		for (i = 0;i < n;i++)
		{
			System.out.print("Array["+i+"] = ");
			arr[i] = s.nextInt();
		}
		System.out.print("Input number to be searched = ");
		key = s.nextInt();
		int mid =(first+last)/2;  
			while(last >= 0)
			{  
				if(arr[mid] < key )
				{  
					first = mid + 1;
				}					
				else if(arr[mid] == key )
				{  
					System.out.println("Element is found at index : "+mid);  
					break;  
				}
				else					
					last = mid - 1;    
			mid = (first+last)/2;  
			}  
		if(first > last)  
			System.out.println("Element is not found!");  
	}  
} 