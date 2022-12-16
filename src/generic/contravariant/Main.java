package generic.contravariant;

import generic.classgeneric.MyData;

public class Main {

    // Contravariant bisa melakukan subtitusi supertype(parent) dengan subtype(child)
    // Contravariant kebalikan dari covariant
    // covariant tidak bisa melakukan setter sedangan contravariant tidak bisa melakukan getter

    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Iwan");

        //Contravariant
        MyData<? super String> myData = objectMyData;
        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        //String value = myData.getData(); //gak valid
        String value = (String) myData.getData();
        System.out.println("Process parameter " + value);

        myData.setData("wan");
    }
}
