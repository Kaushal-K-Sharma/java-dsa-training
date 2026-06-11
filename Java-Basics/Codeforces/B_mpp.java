import java.util.*;
public class B_mpp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        int n = s.length();
        int[] arr = new int[26];
        
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }
        


        sc.close();


    }
}
