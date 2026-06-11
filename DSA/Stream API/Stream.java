import java.util.*;
public class Stream{
    public static void main(String[] args){
        //source data
        List <Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.println("Keeping only Even numbers.");

        //Start conveyer belt-> stream
        numbers.stream() //  dont close ;

        //intermediate stage
        .filter(n -> n%2==0) // Rule dont close ;  its running from .stream()

        //terminal stage
        .forEach(n -> System.out.println(n));  // or System.out::println
        // .forEach(System.out::println);
    }
}