import java.util.*;
public class petya{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 =s1.toLowerCase();
        s2 = s2.toLowerCase();
        int c = s1.compareTo(s2);
        if(c == 0){
            System.out.println(0);
        }
        else if(c < 0){
            System.out.println(-1);
        }
        else{
            System.out.println(1);
        }
        sc.close();
    }
}