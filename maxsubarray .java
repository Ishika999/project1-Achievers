import java.util.Scanner;
public class maxsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the arrayay");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter value of k");
		int k1=sc.nextInt();
		int count=0;
		int array1[]=new int[500];
		for (int i=0; i <n; i++) 
		{
			for (int j=i; j<n; j++)   
			{
				int max=0;
				for (int k=i; k<=j; k++) 
 
				{
					
				if(array[k]>max)
				{
					max=array[k];
					
				}
					
				}
				array1[count]=max;
				count++;
			}
		}
		int sum=0;
		for(int i=0;i<count;i++)
		{
			if(array1[i]>k1)
			{
				sum++;
			}
		}
		System.out.println("The times max was greater than k is: "+ sum);
	}
}
