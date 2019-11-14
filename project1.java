package Assignment;
import java.util.*;

public class SubArrays {

	public static void main(String[] args) {
		int count=0,x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0;i<n;i++)
		{
		   arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value of sum");
	     int sum=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			count=arr[i];
		
				for(int j=i+1;j<arr.length;j++)
				{
					count=count+arr[j];
					if(count==sum)
					{
						x++;
						System.out.println("Starting index: "+i);
						System.out.println("Ending index: "+j);
					}
					}
				}
		
				if(x==0)
				{
					System.out.println("Invalid Input!!!");
				}
		

	}



}
