import java.util.*;
public class CF133A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = 0;
        
        for(int i = 0;i<s.length();i++ ){
            if(s.charAt(i) == 'H' || s.charAt(i) == 'Q' || s.charAt(i) == '9'){
                a=1;
               break;
            }
            else{
                a=0;              
            }
            
        }
        if(a==1){System.out.println("YES");}
        else{System.out.println("NO");}
       
        sc.close();
    }
}