package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tengiz {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Steve");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            if (name.equals("Mary")) {
                iterator.remove();
            }

        }
        System.out.println(names);
    }
}

