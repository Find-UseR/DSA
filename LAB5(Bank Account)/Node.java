package LAB7;

public class Node {


	int account_id;
	String fullName;
	double currbal;
	Node next;
	Node(int aid,String fName,double cBal){
		account_id=aid;
		fullName=fName;
		currbal=cBal;
		next=null;
	}
}

