import java.util.Scanner;
import java.util.*;
public class FindMaxNumber {
	
	public static void main (String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Arrya:");
		int size = sc.nextInt();
		
		int number [] = new int [size];
		
		System.out.println("Enter the Array element");
		for (int i=0; i<size; i++){
			number [i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<number.length; i++){
			if (number[i]<min){
				min=number[i];
			}
			
			if (number[i]>max){
				max = number[i];
			}
		}
		
		System.out.println("max number is : " +max);
		System.out.println("Min number is :" +min);
		
		
		
	}
}
