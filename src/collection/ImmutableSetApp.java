package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("naruto");

        Set<String> mutable = new HashSet<>();
        mutable.add("naruto");
        mutable.add("sasuke");

        Set<String> immutable = Collections.unmodifiableSet(mutable);
        //Set<String> set = Set.of("naruto", "sasuke", "luffy");

        //set.add("naruto"); error
        //set.remove("naruto"); error
    }

}
