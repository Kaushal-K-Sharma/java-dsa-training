import java.util.*;
public class CF281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String c = s.charAt(0)+"";
        c = c.toUpperCase();
        StringBuilder sb = new StringBuilder(s);
        sb.delete(0,1);
        String s1 = sb.toString();
        c = c + s1;
        System.out.println(c);

        sc.close();
    }
}
