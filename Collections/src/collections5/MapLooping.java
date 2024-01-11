package collections5;

import java.util.HashMap;
import java.util.Map;

public class MapLooping {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Orange", 8);

        // can use map.keySet() if interested in keys and map.values() for values
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

    }
}
