package UnDirectedUnweighted;

public class Main {

	public static void main(String[] args) {
		Graph g = new Graph();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int state;

		String menu = "1. Insert Company\n2. Insert Edge\n3. Display Matrix\nEnter Choice: ";

		do {
			System.out.print(menu);
			state = sc.nextInt();
			sc.nextLine();

			if (state == 1) {
				System.out.print("Enter Name: ");
				g.insert(new Company(sc.nextLine()));
			} else if (state == 2) {
				System.out.print("Enter Source: ");
				int source = g.search(sc.nextLine());
				if (source == -1)
					System.out.println("Invalid");
				else {
					System.out.print("Enter Destination: ");
					int dest = g.search(sc.nextLine());
					if (dest == -1)
						System.out.println("Invalid");
					else {
						g.insertEdge(source, dest);
					}
				}
			} 
			else if (state == 3)
				g.display2d();
		} while (true);
	}

}



