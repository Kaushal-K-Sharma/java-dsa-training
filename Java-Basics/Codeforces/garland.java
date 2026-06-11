import java.util.*;
public class garland{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){         
        
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        
        int arr[] = new int[3];
        arr[0] = r;
        arr[1] = g;
        arr[2] = b;
        
        Arrays.sort(arr);

        if(arr[0] + arr[1] < arr[2]){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }
        sc.close();
    }        


    }
