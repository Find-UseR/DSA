package LAB5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		for(int i=0;;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Press 1 to Add at First Node");
			System.out.println("Press 2 to Add at Last Node");
			System.out.println("Press 3 to Add at Any Node");
			System.out.println("Press 4 to Delete From First Node");
			System.out.println("Press 5 to Delete Second Last Node");
			System.out.println("Press 6 to Delete From Last Node");
			System.out.println("Press 7 to Print All Nodes");
			System.out.println("Press any key to Exit");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter val");
				int a=sc.nextInt();
				l.addFirst(a);
			}
			else if(choice==2)
		{
				System.out.println("Enter val");
				int a=sc.nextInt();
		l.addlast(a);
		}
			else if(choice==3)
		{
				System.out.println("Enter loc");
				int a=sc.nextInt();
				System.out.println("Enter val");
				int b=sc.nextInt();
		l. InsertNode(a,b) ;
		}
		else if (choice==4) 
		{
			
		l.deletefirst();
		}
		else if(choice==5)
		{
		l.secondlast();
		}
		else if (choice==6)
		{
		l.deletelast();
		}
		else if (choice==7)
		{
		l.printList();
		}
		else
		{
			break;
		}
		}


	}

}
