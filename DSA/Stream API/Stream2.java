import java.util.*;
import java.util.stream.*;
public class Stream2 {
    public static void main(String[] args){
        //raw data list
        List <String> rawData = List.of("Apple", "Avocado", "Banana", "Papaya");

        // we have created a new list for holding final result.
        List <String> onlyAword = rawData.stream()  //stream start
                                         .filter(word -> word.startsWith("A")) //intermediate stage
                                         //.filter(word -> word.charAt(0) =='A') // other method
                                         .collect(Collectors.toList()); //terminal stage
        System.out.println("Original List:" +  rawData);
        System.out.println("New List:" +  onlyAword);

    }
}
