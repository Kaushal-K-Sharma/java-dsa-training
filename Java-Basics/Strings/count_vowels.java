import java.util.*;
public class count_vowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1= s.toLowerCase();
        int n = s.length();
        int count = 0;

        for(int i=0;i<n;i++){
            char c = s1.charAt(i);
            if((c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='o') || (c=='u')){
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}