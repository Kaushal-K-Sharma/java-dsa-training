import java.util.*;
public class CF41A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next().toLowerCase();
        String c = sc.next().toLowerCase();
        
        StringBuffer sb = new StringBuffer(c);
        String r = sb.reverse().toString();

        if(s.equals(r)){
            System.out.println("YES");
        }else{System.out.println("NO");}
        
        sc.close();

    }
}