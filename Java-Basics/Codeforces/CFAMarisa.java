import java.util.*;
public class CFAMarisa {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int b = 0;
        int a = 0;
        int zero = 0;
        int count = 0;

        
        for(int i=0;i<n;i++){
            int an = sc.nextInt();
            int[] arr = new int[an];
            for(int j=0;j<an;j++){
                arr[j] = sc.nextInt();
            }
            int[] freq = new int[3];
            for(int num:arr){
                freq[num]++;
            }
            zero = freq[0];
            if(freq[1]>freq[2]){
                a=freq[2];
                b = freq[1]-freq[2];
                }
            else if(freq[1]<=freq[2]){
                a = freq[1];
                b = freq[2]-freq[1];
            }   
            count = zero+a+(b/3);  // a is for pairs, b/3 is for remaining 1s and 2s


            System.out.println(count);              

        }

        
        sc.close();
    }
}
