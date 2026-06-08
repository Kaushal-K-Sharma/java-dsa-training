import java.util.*;
public class sumofdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;

        while(n>0){
            sum += n%10;
            n/=10;
        }
        System.out.println("The sum of digits is: " + sum);

        if(sum%6==0 && sum%5==0){
            System.out.println("Yes.");
        }else if(sum%6==0 && sum%5!=0){
            System.out.println("Maybe.");
        }else if(sum%6!=0 && sum%5==0){
            System.out.println("No");

        }else{
            System.out.println("Invalid.");
        }
    sc.close();

    }

}

