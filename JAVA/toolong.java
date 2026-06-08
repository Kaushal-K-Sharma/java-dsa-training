import java.util.*;
public class toolong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n+1;i++){

        String s = sc.nextLine();
        if(s.length() <= 10){
            System.out.println(s);
        }
        else{
        
        StringBuilder sb = new StringBuilder(s);
        sb.delete(0,1);
        sb.delete(sb.length()-1,sb.length());
        String s1 = sb.toString();
        
        int a = s1.length();
        String A = Integer.toString(a);
        System.out.println(s.charAt(0)+ A + s.charAt(s.length()-1));
        
        }
            }        
        sc.close();
    }
}
