import java.util.*;
public class freqArr{
    public static void main(String[] args){
        int[] arr = {2,3,3,2,5,1,4};
        Arrays.sort(arr);
        int n = arr.length;
        int[] freq = new int[n+1];
        for(int num:arr){
            freq[num]++;
        }
        //System.out.println("Number\tFrequency");
        for(int i:freq){
            System.out.print(freq[i]+"\t");


    }
    }
}