package LinkedList;
import java.util.*;


public class Main {

	 public static void main(String[] args) {
	        NetworkGraph graph = new NetworkGraph(5);
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter source and destinaion: ");
	        int source=sc.nextInt();
	        int destination=sc.nextInt();
	        graph.addLink(source, destination);
//	        graph.addLink(0, 2);
//	        graph.addLink(1, 2);
//	        graph.addLink(1, 3);
//	        graph.addLink(3, 4);
	        graph.setRateCharge(0, 10.5);
	        graph.setRateCharge(1, 15.0);
	        graph.setRateCharge(2, 20.0);
	        graph.setRateCharge(3, 5.0);
	        graph.setRateCharge(4, 25.0);
	        System.out.println("Rate charge between network: " + graph.getRateCharge(source, destination));
	        
	    }
}
