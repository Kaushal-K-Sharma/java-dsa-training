import java.util.*;
public class CF231A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int finalcount = 0;
        int count = 0;

        for(int j=0;j<n;j++){
            count=0;

            int[] arr1 = new int[3];

            for(int i =0;i<3;i++){
                arr1[i] = sc.nextInt();
                if(arr1[i]==1){
                    count++;
                }
            }
            if(count>=2){
                finalcount++;
            } 
        }
        System.out.println(finalcount);
        sc.close();    
    }
}