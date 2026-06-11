import java.util.*;

public class prefix_sum_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        
        // Size length + 1 simplifies the boundaries and avoids l-1 errors
        int[] prefix_sum = new int[arr.length + 1];

        // Build the prefix sum array (1-based indexing for ease)
        for (int i = 0; i < arr.length; i++) {
            prefix_sum[i + 1] = prefix_sum[i] + arr[i];
        }

        System.out.println("Enter number of queries:");
        int q = sc.nextInt();
        
        for (int i = 0; i < q; i++) {
            System.out.println("Enter the value of l and r (1-based indexing):");
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            // Formula changes to prefix_sum[r] - prefix_sum[l-1] directly
            int sum = prefix_sum[r] - prefix_sum[l - 1];
            
            System.out.println("Sum is: " + sum);
        }
    
        sc.close();
    }
}
