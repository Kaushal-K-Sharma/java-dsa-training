//import java.util.*;
public class selection_sort_1{
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        int[] arr = {4,1,3,2,9,6,10};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            int min_value = arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j] < min_value){
                    min_index = j;
                    min_value = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = min_value;
            arr[min_index] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}