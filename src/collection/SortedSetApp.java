package collection;

import collection.data.Person;
import collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());
        people.add(new Person("naruto"));
        people.add(new Person("sasuke"));
        people.add(new Person("luffy"));
        people.add(new Person("zoro"));
        people.add(new Person("sanji"));

        for (Person person:people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        //sortedSet.add(new Person("usop"));
    }
}
