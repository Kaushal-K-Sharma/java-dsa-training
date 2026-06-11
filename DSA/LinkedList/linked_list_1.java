import java.util.*;
public class linked_list_1{
    public static void main(String[] args){
        LinkedList<Integer> l = new LinkedList<>(); // doubly linked list
        l.add(5);
        l.add(3);
        l.add(4);
        l.add(2);

        System.out.println("list after insertion: " + l); // list after insertion

        l.set(2,6);
        System.out.println("list after updation: " + l); // list after updation

        int c = l.get(2);
        System.out.println("Element accessed: " + c);

    }
}