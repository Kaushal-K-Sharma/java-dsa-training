import java.util.*;
public class CF734A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s = s.toUpperCase();
        int ca = 0;
        int cd = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'A'){
                ca+=1;
            }else if(s.charAt(i) == 'D'){
                cd+=1;
            }
        }
        if(ca > cd){
            System.out.println("Anton");
        }else if(cd == ca){
            System.out.println("Friendship");
        }else{
            System.out.println("Danik");
        }
        sc.close();
    }
}
