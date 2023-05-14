package iterators;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetExample {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);



        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
            if (element == 4) {
                iterator.remove();
            }
        }


        System.out.println("HashSet after removing 4: " + set);

    }}