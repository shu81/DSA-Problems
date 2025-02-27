import java.util.*;
public class CheckArraySort {
	public static void main ( String args []){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int number[] = new int [size];
		
		System.out.println("Enter the arrya element");
		for (int i =0; i<size; i++){
			number[i]=sc.nextInt();
		}
		
		boolean isAccending = true;
		
		for (int i = 0; i<number.length-1; i++){
		if(number[i]> number [i+1]){
			isAccending = false;
		}
		}
		
		
		
		
		if(isAccending){
		System.out.println("Array is Sorted");
	}
			else{
	System.out.println("Array is Not sorted");
	}
	}
	
	
}
