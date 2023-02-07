package LAB11;
import java.util.Queue;
import java.util.*;
public class QueueLinkedLIst {

	Complain c;
	private Complain c1;
	public QueueLinkedLIst(){
		c=null;
	}
	public void EnQueue(){
		Complain x= new Complain();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		x.id=sc.nextInt();
		System.out.println("Enter name");
		x.name=sc.next();
		System.out.println("Enter Complain");
		x.Complain=sc.next();
		
		if(c==null){
			c=x;
		}
		else{
			Complain t=c;
			while(t.n!=null){
				t=t.n;
			}
			t.n=x;
		}
	}
	public void DeQueue(){
		if(c==null){
			System.out.println("list is Empty");
		}
		else{
			c=c.n;
		}
		
	}
	public void Display(){
		if(c==null){
			System.out.println("list is Empty");
		}
		else{
			Complain t=c;
			while(t!=null){
				System.out.println("ID :"+t.id+"Name :"+t.name+"Complian :"+t.Complain);
				t=t.n;
			}
		}
	}
}