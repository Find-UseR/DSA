package LAB12;
import java.util.*;
public class Main {

	public static void main(String [] args) {
		
		int choice = 0 ;
		Scanner sc= new Scanner(System.in);
		Process P=new Process();
		RR R=new RR();
		
	do{
		System.out.println("Enter choice");
		System.out.println("1 Arrival");
		System.out.println("2 Allocate");
		System.out.println("3 Display");
		choice=sc.nextInt();
		switch(choice){
		case 1:
		System.out.println("Enter name ");
		P.name=sc.next();
		System.out.println("Enter time ");
		P.time =sc.nextInt();
		break;
		
		case 2:
		R.Allocate();
		break;
		case 3:
			R.Display();
		break;
		
	}
	}while(choice!=3);
	
	}
}
