import java.util.Scanner;
public class maxwindowsubarray {

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
		System.out.println("Enter k window size");
		int k=sc.nextInt();
		for(int i=0;i<n-k+1;i++)
		{
			int maxel=0;
			for(int j=i;j<i+k;j++)
			{
				if(array[j]>=maxel)
					{
					maxel=array[j];
					}
			}
			System.out.println(maxel+" ");
		}
	}
}
