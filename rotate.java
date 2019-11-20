import java.util.Scanner;

	public class LinkedList5
	{
		static	Node  head;
		static class Node
		{
			int data;
			Node next;
			Node(int d)
			{
				data=d;
				next=null;
			}
		}
		public static LinkedList5 insert(int a,LinkedList5 li)
		{
			Node n=new Node(a);
			if(li.head==null)
			{
				li.head=n;
			}
			else
			{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=n;
			}
			return li;
		}
	public static LinkedList5 display(LinkedList5 li)
	{
		Node last=li.head;
		if(li.head==null)
		{
			System.out.println("NO list is present!!");
		}
		while(last.next!=null)
		{
			System.out.println(last.data);
			last=last.next;
		}
		System.out.println(last.data);
		return li;
	}
	public static LinkedList5 rotate(LinkedList5 li,int x)
	{
		if(li.head==null)
		{
			System.out.println("No such List exists..");
		}
		else
		{
			while(x>0)
			{
				Node last=li.head;
				Node temp=null;
				while(last.next!=null)
				{
				    temp=last;
					last=last.next;
				}
				temp.next=null;
				last.next=li.head;
				li.head=last;
				x--;
			}
		}
		return li;
	}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		    LinkedList5 li=new LinkedList5();
		  for(int i=0;i<n;i++)
		  {
			  int a=sc.nextInt();
			  insert(a,li);
		  }
		  int x=sc.nextInt();
		  rotate(li,x);
		  display(li);
		}

	}
