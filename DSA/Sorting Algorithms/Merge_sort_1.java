import java.util.*;
public class Merge_sort_1 {
    public int[] merge_sort(int low, int high, int[] arr){
        if(low<high){
            int mid = low+(high-low)/2;
            merge_sort(low, mid, arr);
            merge_sort(mid+1, high,arr);
            merge(low,mid,high,arr);
        }        
        return arr;
    }

    public int[] merge(int low,int mid, int high, int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left<=mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    
    return arr;
    }
    public static void main(String[] args){
        int[] arr = {4,1,2,3,7,6,9,8,0};
        int n = arr.length;
        Merge_sort_1 obj = new Merge_sort_1();
        int[] ans = obj.merge_sort(0, n-1, arr);
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++){
        System.out.print(ans[i]+" ");
        }
    }
}
