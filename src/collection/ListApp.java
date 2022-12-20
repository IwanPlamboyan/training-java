package collection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("naruto");
        strings.add("sasuke");
        strings.add("luffy");
        strings.add("zoro");

        strings.set(0, "budi");
        strings.remove(1);
        System.out.println(strings.get(0));

        for (String value:strings) {
            System.out.println(value);
        }
    }
}
