import java.util.*;
public class contest_QB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = 2;
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            if(a[1] %2 ==0){
                System.out.println(0);
            }else if(a[1] %2 !=0){
                System.out.println(a[0]);
        }
    }
    sc.close();
    
}
}
