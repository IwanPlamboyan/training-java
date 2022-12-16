package generic.wildcard;

import generic.boundedtypeparameter.MultipleConstraintApp;
import generic.classgeneric.MyData;

public class Main {
    public static void main(String[] args) {
        print(new MyData<Integer>(100));
        print(new MyData<String>("Iwan"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
