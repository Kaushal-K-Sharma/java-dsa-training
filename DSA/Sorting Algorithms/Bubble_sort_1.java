public class Bubble_sort_1 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int counter = 0;
        for(int i=n-1; i>=0 ;i--){
            for(int j=0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    counter+=1;
                }
            }
            if(counter ==0){
                System.out.println("Array is already sorted");
                break;
            }
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
