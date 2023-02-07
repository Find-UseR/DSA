package LAB10;

public class Stack {

	Node top;

	Stack(){
		
		top=null;
	}

	//insert at first
	public void push(int d){
		Node n=new Node(d);
		if(top==null){
			top=n;
		}
		else{
			n.next=top;
			top=n;
		}
	}


	//delete first
	public int pop(){
		if(top==null){
			System.out.println("Stack is empty");
		return -1;
		}
		else{
			int d=top.data;
			top=top.next;
			return d;
		}
	}


	public void print(){
		Node curr=top;
		while(curr!=null){
		
			System.out.println(curr.data+"-> ");
		curr=curr.next;
		}
}
	/*
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
	odd.print();*/
	
	public void MoveEvenNumber(Stack s){
		Stack even=new Stack();
		Stack odd=new Stack();
		Node curr=top;
		while(curr!=null){
			int a=s.pop();
		if(a%2==0){
			even.push(a);
		}else{
			odd.push(a);
		}
			curr=curr.next;
		}
		Node c=odd.top;
		while(c!=null){
			
			c=c.next;
		}
		
		
		System.out.println("Even Number");
		even.print();
		System.out.println("ODD Number");
		odd.print();
	}
}

