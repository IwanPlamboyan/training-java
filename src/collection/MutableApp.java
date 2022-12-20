package collection;

import collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Naruto");

        person.addHobby("game");
        person.addHobby("coding");

        doSomethingWithHobbies(person.getHobbies());

        for (String hobby:person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan hobby");
    }
}
