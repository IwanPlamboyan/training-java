package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList();

        collection.add("naruto");
        collection.add("sasuke");
        collection.add("itachi");
        collection.add("luffy");
        collection.add("luffy");
        collection.addAll(Arrays.asList("zoro", "Usop"));

        collection.remove("sasuke");
        collection.remove("luffy");
        boolean cek = collection.remove("budi");
        System.out.println(cek);

        for (String value: collection) {
            System.out.println(value);
        }

        //cek data di collection
        System.out.println(collection.contains("zoro"));
        System.out.println(collection.containsAll(Arrays.asList("zoro", "Usop", "itachi")));
        System.out.println(collection.contains("iki"));

        //cek jumlah colection
        System.out.println(collection.size());
    }
}
