package LAB7;

import java.util.Scanner;


public class Main {

	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedList l=new LinkedList();
		int id,pos;String name;int amount;
		int cBal;
		int choice;
		do{
			System.out.println("Enter Your Choice");
			System.out.println("Enter 1 for  Create Account");
			System.out.println("Enter 2 for  Check Balance ");
			System.out.println("Enter 3 for Withdraw");
			System.out.println("Enter 4 for  Deposit");
			System.out.println("Enter 5 for  Display");
		
			
			
			System.out.println();
			choice=sc.nextInt();
			switch(choice){
			case 1:
				
				System.out.println("Enter Id :");
				id=sc.nextInt();
				System.out.println("Enter Name :");
				name=sc.next();
				System.out.println("Enter Balnce:");
			 cBal=sc.nextInt();
				l.createAccount(id, name, cBal);
				break;
				
			case 2:
				System.out.println("Enter Id :");
				id=sc.nextInt();
				
				l.checkBalance(id);
				break;
				
			case 3:
				System.out.println("Enter  amount");
				 amount=sc.nextInt();
				System.out.println("Enter Id :");
				id=sc.nextInt();
				
				l.withdraw(id, amount);
				
			break;
			
			case 4:
				System.out.println("Enter amount");
				 amount=sc.nextInt();
				System.out.println("Enter Id :");
				id=sc.nextInt();
				l.deposit(id, amount);
				break;
			case 5:
				System.out.println("Enter Id :");
				id=sc.nextInt();
				
				l.Display(id);
				break;
			
			
			}
		}while(choice != 6);
		
		
	}



}


