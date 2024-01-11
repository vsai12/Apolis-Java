package collections1;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        int size = myList.size();
        System.out.println("Size: " + size);

        String firstElement = myList.get(0);
        System.out.println("First Element: " + firstElement);

        boolean containsBanana = myList.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        int indexOfOrange = myList.indexOf("Orange");
        System.out.println("Index of Orange: " + indexOfOrange);

        myList.remove("Banana");
        System.out.println("List after removing Banana: " + myList);

        myList.remove(0);
        System.out.println("List after removing first element: " + myList);

        myList.clear();
        System.out.println("List after clearing: " + myList);

        boolean isEmpty = myList.isEmpty();
        System.out.println("Is list empty? " + isEmpty);

        //There's also addAll() which adds one collection to another
        //toArray converts collection to array
    }
}
