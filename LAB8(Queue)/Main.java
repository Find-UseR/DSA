package LAB11;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
	
			int choice;
			int a;
			QueueLinkedLIst l=new QueueLinkedLIst();
			Scanner sc= new Scanner(System.in);
			do{
				System.out.println("Press 1 for Enqueue");
				System.out.println("Press 2 for Dequeue");
				System.out.println("Press 3 for Display");
				choice=sc.nextInt();
				switch(choice){
				case 1:
					l.EnQueue();
					break;
				case 2:
					l.DeQueue();
					break;
				case 3:
					l.Display();
				}
			}while(choice!=4);
		}
	

 }
