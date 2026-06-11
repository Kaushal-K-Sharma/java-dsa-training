import java.util.*;

public class prefix_sum_3 {
    public static void main(String[] args) {
        // Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal, without using nested loops.
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == goal) {
                    count++;
                }
            }
        }
        System.out.println("Number of subarrays with sum " + goal + " is: " + count);
        sc.close();
    }
}