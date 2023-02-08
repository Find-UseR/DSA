package LAB12;

public class RR {
	
	int front=0;
	int rear=-1;
	int flag=0;
	Process []x=new Process[5];
	
	public RR() {
		
		for(int i=0; i< x.length;i++) {
			
			x[i]=new Process();
		}
		
	}
	public void ProcessArrival(Process P) {
		
		if(flag==0 && front==rear) {
			
			System.out.println("Queue is full");
		
	}
		else {
			x[rear++]=P;
			if(rear==x.length) {
				
				rear=0;
				flag=1;
			}
		}

	}
		public void Allocate() {
	
			if(flag==0 && front == rear) {
				
				System.out.println("Queue is Empty");
			}
			else {
				System.out.println(x[front]+"Allocate");
				if(x[front].time-4>0) {
					x[front].time=4;
					ProcessArrival(x[front]);
				}
				front++;
			}
		
		}

		public void Display(){
			if(flag==0 && front==rear){
				System.out.println("Empty...!");
			}
			else{
				if(flag==0){
				for(int i=front;i<rear;i++){
					System.out.println(x[i].name);
					System.out.println(x[i].time);
				}
				}
				else{
					for(int i=front;i<x.length;i++){
						System.out.println(x[i].name);
						System.out.println(x[i].time);
					}
					
					for(int i=0;i<rear;i++){
						System.out.println(x[i].name);
						System.out.println(x[i].time);
					}
				}
			}
		}
}
