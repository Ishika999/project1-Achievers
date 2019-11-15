import java.util.*;
public class ReverseString {
	public static void main(String args1[])
	{
		Scanner s1c=new Scanner(System.in);
		String s1=new String();
		s1=s1c.next();
		char char1[]=new char[s1.length()];
		char char2[]=new char[s1.length()];
		int a=0,b=0;
		int n=s1.length();
		for(int i=0;i<n;i++)
		{
			char ch=s1.charAt(i);
			if(ch>=33&&ch<=64||ch>=91&&ch<=96)
			{
				char1[a]= ch;
				a++;
			}
			else
			{
				char2[b]=ch;
				b++;
			}
		}
		char char4[]=new char[b];
		for(int i=0;i<b;i++)
		{
			char4[i]=char2[b-i-1];
		}
		char char3[]=s1.toCharArray();
		int e=0,f=0;
		for(int i=0;i<n;i++)
		{
			if(char3[i]>=33&&char3[i]<=64||char3[i]>=91&&char3[i]<=96)
			{
				System.out.print(char1[e]);
				e++;
			}
			else
			{
				System.out.print(char4[f]);
				f++;
			}
		}
	}
}
