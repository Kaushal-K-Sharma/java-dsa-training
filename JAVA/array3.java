import java.util.*;
public class array3 {
    // AVG OF ARRAY
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of the array");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of the array are:");

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        int sum = 0;
        for(int j=0; j<n;j++){
            sum+=arr[j];
        }
        System.out.println("\nSum of the array is: " + sum);
        System.out.println("Average of the array is: " + (sum/n));

        sc.close();
        
    }
}
