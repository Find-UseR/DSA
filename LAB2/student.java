package LAB2;
import java.util.*;
public class student {

	int id;
	String name;
	static int index;
	Scanner sc=new Scanner(System.in);
	public void insert(){
		System.out.println("Enter your id: ");
		id=sc.nextInt();
		System.out.println("Enter your name: ");
		name=sc.next();
	}
	public void display(){
		System.out.println("Your id is: "+id);
		System.out.println("Your name is: "+name);
	}
	public void search(student a[]){
		System.out.println("Enter your id you want to search");
		int sid=sc.nextInt();
		//boolean check=true;
		for(int i=0;i<index;i++){
			if(a[i].id==sid){
				System.out.println("Your record found at position "+(i+1));
				//check=false;
				break;
			}
			/*if(check==true){
				System.out.println("record not found");
			}*/
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		student obj=new student();
		student std[]=new student[10];
		int choice;
		do{
			System.out.println("Press 1 to insert: ");
			System.out.println("Press 2 to display: ");
			System.out.println("Press 3 to search: ");
			System.out.println("Press 4 to exit: ");
			choice=sc.nextInt();
			if(choice==1){
				std[index]=new student();
				std[index].insert();
				index++;
			}
			if(choice==2){
				for(int i=0;i<index;i++){					
					std[i].display();
				}
			}
			if(choice==3){
				obj.search(std);
			}
		}while(choice ==1 || choice ==2 || choice==3 );
	}

}


