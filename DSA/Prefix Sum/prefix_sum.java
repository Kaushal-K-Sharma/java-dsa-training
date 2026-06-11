import java.util.*;
public class prefix_sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            System.out.println("Enter the value of l and r");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = 0;
            for(int j=l-1;j<r;j++){
                sum+=arr[j];
            }
            System.out.println("Sum is: " + sum);
        }
    
        sc.close();
    }
    
}
