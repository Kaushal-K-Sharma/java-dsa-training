import java.util.*;
public class array2 {
    public static void main(String[] args){
        // SUM OF ARRAY
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of array : "+sum);
        
        // for(int i=0; i<arr.length;i++){
        //     System.out.print(arr[i]+" " + "\n");
        // }



        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i] + " " + "\n");
        // }
        
        // System.out.println("Sum of array : "+sum);
        sc.close();
    }
}
