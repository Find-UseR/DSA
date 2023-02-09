package UnDirectedUnweighted;
public class Graph {
	
	Company[] company = new Company[5];
	int index = 0;
	int[][] x = new int[5][5];
	
	
	public Graph() {
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				x[i][j] = 0;
		
		for (int i = 0; i < company.length; i++)
			company[i] = new Company();
	}
	
	public void insert(Company c) {
		if (index == company.length) {
			System.out.println("Full size");
			return;
		}
		
		company[index++] = c;
	}
	
	public void insertEdge(int source_index, int dest_index) {
		x[source_index][dest_index] = 1;
		x[dest_index][source_index] = 1;
	}
	
	public int search(String n) {
		for (int i = 0; i < index; i++)
			if (company[i].name.equalsIgnoreCase(n))
				return i;
		
		return -1;
	}
	
	
	public void display1d() {
		for (int i = 0; i < index; i++)
			System.out.print(company[i].name + " ");
		
		System.out.println();
	}
	
	public void display2d() {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++)
				System.out.print(x[i][j] + "\t");
			
			System.out.println();
		}
				
	}
}






