package collections4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemove {
    public static List<Integer> method(List<Integer> list) {
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer x = (Integer) itr.next();
            if (x % 2 == 1)
                itr.remove(); //Removing elements doesn't cause issues
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        for(int i= 1;i<=10;i++) {
            list.add(i);
        }
        System.out.println(method(list));
    }
}
