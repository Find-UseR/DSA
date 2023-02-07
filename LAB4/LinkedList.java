package LAB5;



public class LinkedList {
	Node head;
	public void addFirst(int d)
	{
		Node n=new Node(d);
		if(head==null) {
			
			head=n;
		}
		else 
		{
			n.next=head;
			head=n;
		}
	}
	
	
	public void printList()
	{
	if(head==null) 
	{
		System.out.println("list empty");
	}
	else
	{
		
		Node CurrNode=head;
		while(CurrNode!=null)
		{
			System.out.println(CurrNode.data+"->");
			CurrNode=CurrNode.next;
		}
	}
	}
	public void addlast(int d)
	{
		Node t=new Node(d);
		if(head==null)
		{head=t;
		}
		else
		{
			Node CurrNode=head;
			while(CurrNode.next!=null)
			{
				
				CurrNode=CurrNode.next;
			}
			CurrNode.next=t;
		}
	}
	
	public void InsertNode(int loc, int val) {
		Node n =new Node(val);
		{if((loc-1)==0)
			{
			n.next=head;
			head=n;
			}
		else
		{Node currnode=head;
		for(int i=1;i<(loc-1);i++)
			{
			currnode=currnode.next;
			}
		n.next=currnode.next;
		currnode.next=n;
		
		}
		}
		

	}
	public void deletefirst()
	{
		if(head==null)
		{
			System.out.println("List Empty");
		}
		else
		{
			head=head.next;
		}
	}
	
	public void secondlast() {
		
		if(head==null) {
			System.out.println("Empty List");
		}
		else if(head.next==null) {
			head=null;
		}
		else {
			Node secondlast=head;
			while(secondlast.next.next.next!=null) {
				secondlast=secondlast.next;
			}
			secondlast.next=null;
		}
	}
	public void deletelast()
	{
		if(head==null)
		{
			System.out.println("List Empty");
		}
		 else if(head.next==null)
		{
			 head=null;
		}
		 else {Node seclast=head;
		 while(seclast.next.next!=null)
			 {
			 seclast=seclast.next;
			 }
		 seclast.next=null;
				 }
	}
}
