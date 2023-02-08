package LAB13;
import java.util.*;
public class Student {
	int id;
	String name;
	Student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name:");
		name=sc.next();
	}
}