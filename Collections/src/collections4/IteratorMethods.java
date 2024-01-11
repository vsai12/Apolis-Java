package collections4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorMethods {
    public static List<Integer> method(List<Integer> list) {
        ListIterator<Integer> itr = list.listIterator(list.size());
        while (itr.hasPrevious()) {
            Integer x = (Integer) itr.previous();
            System.out.println(x);
            if (x % 2 != 0) //removes odds
                itr.remove();
            if (x == 8)
                itr.set(100); //changes curr element
            if (x == 4)
                itr.add(200); //adds element to next spot
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(method(list));
    }
}
