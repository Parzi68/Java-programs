import java.util.*;

public class linked_hashmap{
    public static void main(String [] args){
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("first", 1);
        linkedHashMap.put("second", 2);
        linkedHashMap.put("third", 3);
        System.out.println("Hashmap Elements: "+ linkedHashMap);
        System.out.println("Value of key second: "+linkedHashMap.get("second"));
        linkedHashMap.put("fourth", 4);
        linkedHashMap.put("fifth", 5);
        System.out.println("Updated Hashmap Elements: "+ linkedHashMap);
    }
}