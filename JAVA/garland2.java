import java.util.*;
public class garland2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int r  = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();

            int s = r+g+b;

            int m = Math.max(r, Math.max(g, b));
            int l = s-m;
            if(m<=l+1){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }

        }
        sc.close();
    }
}