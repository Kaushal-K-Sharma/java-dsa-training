import java.util.*;
public class CF59A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cu = 0; 
        int cl = 0;
        for(int i=0;i<s.length();i++){
            String c = s.charAt(i) + "";
            if(c == c.toUpperCase()){
                cu+=1;
            }
            else if (c == c.toLowerCase()){
                cl+=1;
            }
        }
        //System.out.println("" + cu + " " + cl);
        if(cu > cl){
            s = s.toUpperCase();
        }else if(cl == cu){
            s = s.toLowerCase();
        }else{
            s = s.toLowerCase();
        }
        System.out.println(s);

        sc.close();
        }
        
    }
