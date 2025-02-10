public class Smallest {

    public static void main(String[] args) {
        
        int arr [] = {5, 15, 22, 1, -15, 24};
        int size = arr.length;
        int smallest = Integer.MAX_VALUE; 
        for(int i = 0; i < size; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        
        System.out.println("Smallest: " + smallest);
    }
   
}
