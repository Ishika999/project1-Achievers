import java.util.Scanner;
public class linkedlist3 {
Node head;
static int count=0;
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
public static void insert(linkedlist3 li,int data)
{
	Node newNode=new Node(data);
	newNode.next=null;
	if(li.head==null)
	{
		li.head=newNode;
	}
	else
	{
		Node temp=li.head;

		while(temp!=null)
		{
			if(temp.data==data)
			{
				count++;
				break;
			}
			temp=temp.next;
		}
		if(count==0)
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
		last.next=newNode;
		}
	}

}

public static void display(linkedlist3 li)
{
	Node current=li.head;
	System.out.println("The LinkedList is as follows: ");
	while(current.next!=null)
	{
		System.out.println(current.data);
		current=current.next;
	}
	System.out.print(current.data);
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	linkedlist3 li=new linkedlist3();
	System.out.println("Enter the size of the list");
	int n=sc.nextInt();
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++) 
	{
		int a=sc.nextInt();
		insert(li, a);
	}
	System.out.println("After removing the duplicates");
	display(li);

}

}

