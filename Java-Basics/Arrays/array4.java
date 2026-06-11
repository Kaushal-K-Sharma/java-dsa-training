import java.util.Scanner;
public class array4 {
    // MAX ELEMENT IN ARRAY
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of the array");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of the array are:");

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        int max = 0;
        for(int k=0;k<n;k++){
            if(arr[k]>max){
                max = arr[k];
            }
        }
        System.out.println("\nMaximum element in the array is: " + max);

        sc.close();
    }
}
