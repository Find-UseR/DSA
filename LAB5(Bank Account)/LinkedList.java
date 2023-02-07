package LAB7;

public class LinkedList {

	
		Node head;



		public void createAccount(int aid,String fName,double cBal){
			Node n=new Node(aid,fName,cBal);
			if(head==null){
				head=n;
			}else{
				n.next=head;
				head=n;
			}
		}

		public void checkBalance(int account_id){
		Node curr=head;
			if(curr==null){
				System.out.println("Linked Not Exist");
			}else{
			while(curr!=null){
				
				if(curr.account_id==account_id){
					System.out.println(curr.currbal+" "+curr.account_id);
				}
				curr=curr.next;
			}//while

			}

		}


		public void withdraw(int account_id,int amount){
		Node curr=head;
			if(curr==null){
				System.out.println("Linked Not Exist");
			}else{
			while(curr!=null){
				
				if(curr.account_id==account_id){
					curr.currbal=curr.currbal-amount;
				}
				curr=curr.next;
			}//while

			}

		}




		public void deposit(int account_id,int amount){
		Node curr=head;
			if(curr==null){
				System.out.println("Linked Not Exist");
			}else{
			while(curr!=null){
				
				if(curr.account_id==account_id){
					curr.currbal=curr.currbal+amount;
				}
				curr=curr.next;
			}//while

			}

		}

		public void Display(int account_id){
		Node curr=head;
			if(curr==null){
				System.out.println("Linked Not Exist");
			}else{
			while(curr!=null){
				
				if(curr.account_id==account_id){
					System.out.println("Current Balance :"+curr.currbal+"Account ID: "+curr.account_id
							+"Name :"+curr.fullName);
				}
				curr=curr.next;
			}//while

			}

		}

}





