import java.util.Scanner;
public class ArrayOperation {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
        // Creating Array 
        int[]  arr = {1,2,3,4,5,5,6,7,8,9};
        
        // Accepting value from the user using loop
        // int[] arr2= new int[5];

        // for(int i=0;i<5;i++){
        //     arr[i]=sc.nextInt();
        // }   

        // display the element from array using loop
        
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr2[i] + ", ");
        // }

        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
       
       
       
    }
}
