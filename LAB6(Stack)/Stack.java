package LAB9;
import java.util.*;

	public class Stack {
	 int[] stack=new int[5];
	 int top=-1;
	 
	public int data;

	public  void push(int i){
		
		if(top==(stack.length-1)){
			System.out.println("Stack Over flow");
		}else{
			stack[++top]=i;
		}
	}

	public  int pop(){
		if(top==-1){
			System.out.println("stack Under flow");
			return -1;
		}
		else{
			return stack[top--];
		}

	}


	public  void print(){
		if(top==-1){
			System.out.println("Stack is empty");
			return;
		}
		else{
	for(int i=top;i>=0;i--){
			System.out.print(stack[i]+" ");
		}
			
		}
	}





	public  void copyReverseOrder(Stack s,Stack s2){

		for(int i=s.top;i>=0;i--){
			s2.push(s.pop());
		}
		s2.print();
	}




	public  void copySameOrder(Stack s,Stack s2){
	Stack temp=new Stack();
	for(int i=s.top;i>=0;i--){
		temp.push(s.pop());
	}

	for(int i=temp.top;i>=0;i--){
		s2.push(temp.pop());
		
	}
		
		s2.print();
		
	}



	public void deleteAllOccurences(Stack s,int val){
		Stack temp=new Stack();
		
			for(int i=s.top;i>=0;i--){
				int a=s.pop();
				if(a!=val){
		temp.push(a);
		}	
		}
			for(int i=temp.top;i>=0;i--){
				s.push(temp.pop());
			}
		s.print();
	}



	public void separateEvennOdd(Stack s){
		Stack even=new Stack();
		Stack odd=new Stack();
		int e=0,o=0;	int a;
		for(int i=s.top;i>=0;i--){
		 a =s.pop();
			if((a%2)==0){
				even.push(a);
				e++;
				
			}else{
				odd.push(a);
				o++;
			}
		}
		System.out.println("EVEN "+e);
		even.print();
		System.out.println("ODD "+o);
		odd.print();
		
	}
	






}
