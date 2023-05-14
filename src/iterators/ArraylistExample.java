package iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample {
    public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    list.add("apple");
    list.add("banana");
    list.add("orange");

    // Iterate over the list using a foreach loop
    for (String fruit : list) {
        System.out.println(fruit);
    }

    // Iterate over the list using an iterator
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
        String fruit = iterator.next();
        System.out.println(fruit);
        iterator.remove();
    }
        System.out.println("-------");
        System.out.println(list);

}
}





