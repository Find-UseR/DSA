package DirectedWeighted;

public class Main {

	public static void main(String[] args) {
		Graph g = new Graph();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int state;

		String menu = "1. Insert Company\n2. Insert Edge\n3. Display Matrix\n4. Display Caller Rates\nEnter Choice: ";

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
					System.out.println("Invalid!");
				else {
					System.out.print("Enter Destination: ");
					int dest = g.search(sc.nextLine());
					if (dest == -1)
						System.out.println("INVALID !");
					else {
						System.out.print("Enter Edge Value: ");
						double v = sc.nextDouble();
						g.insertEdge(source, dest, v);
					}
				}
			} 
			else if (state == 3)
				g.display2d();
			else if (state == 4) {
				System.out.print("Enter Company Name: ");
				int index = g.search(sc.nextLine());
				if (index == -1)
					System.out.println("Not Found!");
				else {
					for (int i = 0; i < 5; i++)
						if (g.x[index][i] != -1)
							System.out.println(g.company[i].name + ": " + g.x[index][i]);
				}
			}
		} while (true);
	}

}


