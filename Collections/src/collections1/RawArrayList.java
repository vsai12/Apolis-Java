package collections1;

import java.util.ArrayList;
import java.util.List;


public class RawArrayList {
    public static void main(String[] args) {
        List list = new ArrayList(); // raw type ArrayList
        list.add("Hello");
        list.add(1);
        list.add(2.345);
        list.add(true);
        System.out.println(list);
    }
}
