import java.util.*;
public class hashmap {
    public static void main(String[] args){
    int[] arr = {2,1,2,3,1,4,2};
    HashMap<Integer, Integer> freq = new HashMap<>();
    for(int num:arr){
        freq.put(num, freq.getOrDefault(num,0)+1);
    }
    System.out.println(freq);
}

}
