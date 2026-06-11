
import java.util.*;
public class contest_QD {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            int count = 0;
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(j>i){
                        if((a[j]-a[i] == j-i)){
                            count++;
                        }
                    }   
                }
                
            }
            System.out.println(count);
        }
        sc.close();
        
    }
}
