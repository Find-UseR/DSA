package LAB9;
import java.util.Scanner;

	public class Main {

		
		public static void main(String[] args) {
			
			int choice,val;
			Scanner sc=new Scanner(System.in);
		Stack s=new Stack();
	Stack s1=new Stack();
		Stack s2=new Stack();

	do{
		System.out.println();
		System.out.println("Press 1 to insert");
		System.out.println("Press 2 to Pop");
		System.out.println("Press 3 to Print");
		System.out.println("Press 4 to Copy Reverse");
		System.out.println("Press 5 to Copy Same");
		System.out.println("Press 6 to Separate Even and ODD");
		System.out.println("Press 7 to Remove Occurance");
		System.out.println("Press 8 to Exit");
		 choice=sc.nextInt();
		 switch(choice){
		 case 1:
			 System.out.println("Enter Data");
			 s.data=sc.nextInt();
			 s.push(s.data);
			 break;
		 case 2:
			int p= s.pop();
			 System.out.println("Pop "+p);
			 break;
		 case 3:
			 System.out.println("");
			 s.print();
			 break;
		 case 4:
			 s.copyReverseOrder( s, s2);
			
			 break;
		 case 5:
			 s.copySameOrder( s, s2);
			 break;
		 case 6:
			 s.separateEvennOdd(s);
			 System.out.println();
			 break;
		 case 7:
			 System.out.println("ENter VAlue To delete Occurance");
			 val=sc.nextInt();
			 s. deleteAllOccurences(s, val);
			 break;
		 case 8:
			System.exit(0);
			 break;
		 }
			 
		 
		
	}while(choice!=8);
		}
}


