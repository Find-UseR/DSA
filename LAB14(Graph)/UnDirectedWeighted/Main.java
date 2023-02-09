package UnDirectedWeighted;

public class Main {

	public static void main(String[] args) {
		Graph gph = new Graph();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int state;

		String menu = "1. Insert Company\n2. Insert Edge\n3. Display Matrix\n4. Display Caller Rates\nEnter Choice: ";

		do {
			System.out.print(menu);
			state = sc.nextInt();
			sc.nextLine();

			if (state == 1) {
				System.out.print("Enter Name: ");
				gph.insert(new Company(sc.nextLine()));
			} else if (state == 2) {
				System.out.print("Enter Source: ");
				int source = gph.search(sc.nextLine());
				if (source == -1)
					System.out.println("Invalid Source!");
				else {
					System.out.print("Enter Destination: ");
					int dest = gph.search(sc.nextLine());
					if (dest == -1)
						System.out.println("Invalid Destination!");
					else {
						System.out.print("Enter Edge value: ");
						double v = sc.nextDouble();
						gph.insertEdge(source, dest, v);
					}
				}
			} 
			else if (state == 3)
				gph.display2d();
			else if (state == 4) {
				System.out.print("Enter Company Name: ");
				int index = gph.search(sc.nextLine());
				if (index == -1)
					System.out.println("Not Found!");
				else {
					for (int i = 0; i < 5; i++)
						if (gph.x[index][i] != -1)
							System.out.println(gph.company[i].name + " rate: " + gph.x[index][i]);
				}
			}
		} while (true);
	}

}







