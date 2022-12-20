package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        //Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("naruto");
        names.add("sasuke");
        names.add("luffy");
        names.add("zoro");
        names.add("sanji");
        names.add("usop");
        names.add("usop");
        names.add("usop");
        names.add("usop");

        for (String name:names) {
            System.out.println(name);
        }
    }
}
