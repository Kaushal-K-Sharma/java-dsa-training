import java.util.*;
public class Recursion {
    
     static int func(int n){
        if(n==1||n==0){
            return 1;
        }
        return func(n-1)*n;
        }
     static int phebonaci(int n){
        if( n == 0){
            return 0;
        }
        return phebonaci(n-1)+n;
        }

    static void func1(int n){
        if(n==0){
            return;
        }
        func1(n-1);
        System.out.println(n);
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            int result = func(n);
            int result2 = phebonaci(n);
            func1(n);
            System.out.println(result);
            System.out.println(result2);
            sc.close();
        }


}