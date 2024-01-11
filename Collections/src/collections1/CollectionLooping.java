package collections1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionLooping {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");
        for(String item : list) { //for-each loop
            System.out.println(item);
        }

        Iterator<String> Iterator = list.iterator(); //iterator
        while (Iterator.hasNext()) {
            String item = Iterator.next();
            System.out.println(item);
        }
    }
}
