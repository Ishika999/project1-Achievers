import java.util.*;
public class DuplicateElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=1;
		boolean arr1[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr1[i]==true)
				continue;
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					{
						arr1[j]=true;
						count++;
					}
			}
			if(count>0)
			System.out.println(arr[i]+" comes: "+count+" times");
		}
	}
}

