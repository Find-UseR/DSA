public class Array {
	
	private int index = -1;
	private int[] array = new int[ 5 ];
	
	public void insertAtFirst(int val) {
		insert(0, val);
	}
	
	public void insertAtLast(int val) {
		insert(index + 1, val);
	}
	
	public void insertAtSpecificIndex(int val){
		int offset = getIndexByUser();
		
		insert(offset, val);
	}
	
	public void deleteFirst() {
		delete(0);
	}
	
	public void deleteLast() {
		delete(index);
	}
	
	public void deleteByIndex() {
		int offset = getIndexByUser();
		delete(offset);
	}
	
	public int search(int val) {
		int offset = -1;
		for (int i = 0; i <= index; i++) {
			if (array[ i ] == val) {
				offset = i;
				break;
			}
		}
		return offset;
		
	}
	
	public void deleteByValue(int val) {
		int loc = search(val);
		
		if (loc == -1) 
			System.out.println("Not Found..");
		else 
			delete(loc);
	}
	
	private void delete(int ind) {
		if (index == -1) {
			System.out.println("Array is empty..");
			return;
		}
	
		if (ind != index) 
			for (int i = ind; i <= index; i++) 
				array[ i ] = array[ i + 1 ];
		
	
		index--;
		
		display();
		
	}
	
	private void insert(int ind, int val) {
		if (index == -1) {
			array[ ++index ] = val;
			return;
		}
		
		if (index == array.length - 1)
			growArray();
		
		if (ind == 0) {
			for (int i = getSize(); i > 0; i--)
				array[ i ] = array[ i - 1 ];
			
			array[ 0 ] = val;
			index++;
		}
		else if (ind == (getSize())) 
			array[ ++index ] = val;
		else {
			for (int i = getSize(); i >= ind; i--) 
				array[ i + 1 ] = array[ i ];
			display();
		}
		
	}
	
	private void growArray() {
		int[] temp = new int[ array.length + 5 ]; 
		
		for (int i = 0; i < array.length; i++)
			temp[ i ] = array[ i ];
		
		array = temp;
	}
	
	private int getIndexByUser() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Available Indices: ");
		for (int i = 0; i <= index; i++) 
			System.out.print(i + " ");
		System.out.println();
		int offset = -1;
		do {
			System.out.print("Enter Your Choice: ");
			offset = input.nextInt();
		} while(offset < 0 || offset > index);
		
		return offset;
		
	}

	public void display() {
		if (index == -1) {
			System.out.println("Array is empty..");
			return;
		}
		System.out.print("[ ");
		for (int i = 0; i <= index; i++)
			System.out.print(array[ i ] + " ");
		System.out.println("]");
	}
	
	public int getSize() {
		return (index + 1);
	}
	
}