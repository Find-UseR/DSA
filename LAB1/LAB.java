package LAB1;
import java.util.*;
public class LAB {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] arr = {40, 60, 80, 90, 99};
		
		
		int choice;
		
		do {
			
		System.out.println("Press 1 to display array content");
		System.out.println("Press 2 to update element");
		System.out.println("Press 3 to add element at end of array");
		System.out.println("Press 4 to exit");
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			
			for(int i = 0; i < arr.length; i++) {
				
				System.out.println(arr[i]);
				
			}
			break;
			
		case 2:
			
			System.out.println("Enter array index:");
			int index = sc.nextInt();
			System.out.println("Enter Value to update:");
			int value = sc.nextInt();
			arr[index] = value;
			
			break;
		
		case 3:
		
			System.out.println("Enter a new value to add in the array:");
			value = sc.nextInt();
			
			int[] newArr = new int[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				
				newArr[i] = arr[i];
				
			}
			
			newArr[newArr.length-1] = value;
			System.out.println(newArr[newArr.length-1]);
			for (int i = 0; i < newArr.length; i++) {
				
				System.out.println(newArr[i]);
				
			}
			break;
		case 4:
			
			break;
		}
		
		
		
		}while(choice == 1 || choice == 2 || choice == 3 || choice==4);
		
		
		
	}

}
