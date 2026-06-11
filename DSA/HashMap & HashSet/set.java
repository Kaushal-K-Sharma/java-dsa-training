import java.util.*;
public class set {
    public static void main(String args[]){

        Set<String> a = new HashSet<>();
        Set<String> b = new TreeSet<>();
        
        a.add("Antariksh");
        a.add("kaushal");
        a.add("Dog");
        a.add("Cat");
        
        b.add("Dog");
        b.add("kaushal");
        b.add("Antariksh");
        b.add("Cat");

        System.out.println(a);
        System.out.println(b);

        
    }
}
