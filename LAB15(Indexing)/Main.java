package Indexing;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		boolean check=true;
		Indexing ind=new Indexing();
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Enter 1 for Insert");
			System.out.println("Enter 2 for Search");
			System.out.println("Enter 3 for Count");
			System.out.println("Enter 4 for Exit");
			int choice=sc.nextInt();
			
			if(choice==1) {
				ind.Insert();
			}
			else if(choice==2) {
				ind.Search();
				
			}
		}while(check);
	}
}
