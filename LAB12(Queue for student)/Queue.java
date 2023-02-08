package LAB13;
import java.util.*;



public class Queue {
	int front;
	int rear;
	int maxSize;
	Student[] a;
	Queue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of queue:\t");
		 maxSize=sc.nextInt();
		a=new Student[maxSize];
		front=0;
		rear=-1;
	}
	public void enque(Student n)
	{
		if(rear==a.length-1)
		{
			System.out.println("que already full:");
		}
		else
			a[++rear]=n;
	}
	public Student exque()
	{
		if(rear==-1)
		{
			System.out.println("que is empty:");
			return null;
		}
		else if(front>rear){
			System.out.println("empty");
			return null;
		}
		else
			return a[front++];
			
	}
	public void display()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.println("id:"+a[i].id);
			System.out.println("name:"+a[i].name);
			
		}
	}
	public void deleteatspecific(Student[] q,int a)
	{
		Student[] a2=new Student[maxSize];
		for(int i=0;i<=rear;i++)
		{
			if(q[i].id!=a)
			{
				a2[i]=q[i];
			}
		}
		System.out.println("Delete at specific value:");
		for(int i=0;i<a2.length;i++)
		{
			System.out.println("id:"+a2[i].id);
			System.out.println("name:"+a2[i].name);
		}
		
	}
	
}