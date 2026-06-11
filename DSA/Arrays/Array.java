import java.util.*;
public class Array {
    public static void main(String args[]){
    List<Integer> c = new ArrayList<>();

    c.add(24);
    // insert another 24 at index 1 (use add to avoid IndexOutOfBounds)
    c.add(1, 24);
    c.add(26);
    c.add(27);
    c.sort(null);
    Collections.sort(c);

    for(Integer s:c){
        System.out.print(s + " ");
    }

}
}