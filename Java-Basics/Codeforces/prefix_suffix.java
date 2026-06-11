// import java.util.*;
// public class prefix_suffix{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();

//         String s = sc.next().toLowerCase();
//         String t = sc.next().toLowerCase();

//         boolean prefix = false;
//         boolean suffix = false;

//         prefix = t.startsWith(s);
//         suffix = t.endsWith(s);
        

//         // String s1 = t.substring(0,n-1);
//         // // String s2 = t.substring(m-1,m-n);

//         if((prefix == true) && (suffix == true)){
//             System.out.println(0);
//         }else if((prefix == true) && (suffix == false)){
//             System.out.println(1);
//         }else if((suffix == true) && (prefix == false)){
//             System.out.println(2);
//         }else{
//             System.out.println(3);
//         }

//         sc.close();
//     }
// }