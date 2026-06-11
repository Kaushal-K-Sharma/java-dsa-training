import java.util.*;
public class CF266A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        String s = sc.next();
        //String s = "RRG";
        //int n = s.length();     
        for (int i=0;i<n-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count+=1;
            } 
        }
        System.out.println(count);
        sc.close();
    }
}
