package generic.invariant;

import generic.classgeneric.MyData;

public class Main {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Iwan");

        //Error karena invariant bukan seperti polymorphism
        // doIt(stringMyData); // ERROR karena bersifat invariant
        // MyData<Object> objectMyData = stringMyData; // ERROR karena bersifat invariant

        MyData<Object> objectMyData = new MyData<>(1000);
        //MyData<Integer> integerMyData = objectMyData; // ERROR karena sama mau diturunin ke child atau ke parent sama saja karena bersifat invariant
        //doItInteger(objectMyData); // ERROR

    }

    public static void doIt(MyData<Object> objectMyData) {
        //do nothing
    }

    public static void doItInteger(MyData<Integer> objectMyData) {
        //do nothing
    }
}
