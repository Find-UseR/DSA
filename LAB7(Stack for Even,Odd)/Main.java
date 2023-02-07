package LAB10;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Stack s1=new Stack();
		Stack s2=new Stack();
		
		
		Scanner sc=new Scanner(System.in);
		
	
		int choice,value;
		do{
			System.out.println("Enter  Your Choice");
			
			System.out.println("Press 1 to PUsh");
			System.out.println("Press 2 to PUsh 2");
			System.out.println("Press 3 to Move Even number");

			System.out.println("Press 4 to Print");
			System.out.println("Press 5 to Pop");
			System.out.println("Press 6 to Exit");
		
			choice=sc.nextInt();
			
			switch(choice){
			case 1:
				System.out.println("Enter Data");
				value=sc.nextInt();
				s1.push(value);
			break;
			case 2:
				System.out.println("Enter Data");
				value=sc.nextInt();
				s1.push(value);
				s2.push(value);
			break;
			case 3:
			s1.MoveEvenNumber(s1);
			break;
			case 4:
				s1.print();
				break;
			case 5:
				int bb=s1.pop();
				s2.push(bb);
				break;
			}
			 
		}while(choice <=6);
	}

}
