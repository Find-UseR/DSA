package Indexing;
import java.util.*;


public class Indexing {

	Student arr[]= new Student[15];
	Scanner sc= new Scanner(System.in);
	
	char Alpha[]= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
			'P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	public Indexing() {
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Student();
			arr[i].id=-1;
		}
	}
	
	public void Insert() {
		
		if(Student.collision==arr.length) {
			
			System.out.println("Array is Full..!");
		}
		else {
			Student std=new Student();
			System.out.println("Enter Id");
			std.id=sc.nextInt();
			System.out.println("Enter Name");
			std.name=sc.next();
			int index=hashfunction(std.name);
			for(int i=0;i<arr.length;i++) {
				
				if(index==1) {
					if(arr[i].id==-1) {
						
						arr[index]=std;
					}//if inner
				}//if outer
					else {
						if(arr[index].n==null) {
							Student.collision++;
							arr[index].n=std;
						}//if
						else {
							Student.collision++;
							Student curr=arr[index].n;
							while(curr.n!=null)
								curr=curr.n;
							
							curr.n=std;
						}
					}//else
			
			}//for
		}//else
	}//function

	private int hashfunction(String name) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<name.length();i++)
		{
				for(int j=0;j<Alpha.length;j++)
				{
					if(Alpha[j]==name.charAt(i))
					{
						sum+=j+1;
					}//if
				}// inner for
				
		}// outer for
		System.out.println("Hash Value : "+sum%arr.length);
		return sum%arr.length;
	}
	
	public void Search() {
		
	}
}