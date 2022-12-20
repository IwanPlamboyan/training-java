package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = Arrays.asList("iwan", "naruto", "sakuke");

        for (String name: names) {
            System.out.println(name);
        }

        System.out.println("\nITERATOR");
        Iterator<String> iterator =  names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
