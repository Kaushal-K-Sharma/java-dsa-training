import java.util.*;
class sumofoddn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum1 = 0;
        //int sum2 = 0;

        for(int i=1; i<=n ; i+=2){
            sum1 += i;
            // if (i % 2 != 0){
            // sum1 += i; // sum = sum + i;
            // }
            // else{
            //     sum2 +=i;
            // }
        }
        
        System.out.println("The sum of odd " + n +  " numebrs is : " + sum1);
        // System.out.println("The sum of even " + n +  " numebrs is : " + sum2);
        sc.close();
    }
}
