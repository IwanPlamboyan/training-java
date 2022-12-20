package collection;

import java.util.*;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Arrays.asList("naruto", "sasuke", "luffy", "zoro", "sanji", "usop"));

        NavigableSet<String> namesReverse = names.descendingSet();

        for (String name: namesReverse) {
            System.out.println(name);
        }
    }
}
