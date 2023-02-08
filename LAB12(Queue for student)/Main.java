package LAB13;
import java.util.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue q=new Queue();
		int choice,arrysize,value;
		do
		{
			System.out.println("1:queue:");
			System.out.println("2:dequeue:");
			System.out.println("3:Display");
			System.out.println("4:delete at specific point");
			System.out.println("5:dispaly");
			System.out.println("Press 6 for exit:");
			choice=sc.nextInt();
			if(choice==1)
			{	
				System.out.println("\nhow many do u you Want to put in arry:  ");
				arrysize=sc.nextInt();
					for(int i=0;i<arrysize;i++)
					{
						 Student p=new Student();
						q.enque(p);              
					}
			}	
			if(choice==2)
			{	        
					q.exque();
					
			}	
			if(choice==3)
			{
				q.display();
			}
			if(choice==4)
			{
				System.out.println("Enter id that you want to delete:");
				int a=sc.nextInt();
				q.deleteatspecific(q.a,a);
				
			}
			
		}while(choice!=6);
	
}

}
