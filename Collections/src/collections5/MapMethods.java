package collections5;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Orange", 8);

        int size = map.size();
        System.out.println("Size: " + size);

        int appleCount = map.get("Apple");
        System.out.println("Apple Count: " + appleCount);

        boolean containsBanana = map.containsKey("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        map.remove("Orange");
        System.out.println("Map after removing Orange: " + map);

        map.put("Apple", 20); //use put with same key to update value
        int newCount = map.get("Apple");
        System.out.println("Apple Count: " + newCount);
    }
}
