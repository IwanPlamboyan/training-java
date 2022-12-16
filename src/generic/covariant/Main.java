package generic.covariant;

import generic.classgeneric.MyData;

public class Main {
    // Covariant bisa melakukan subtitusi subtype(child) dengan supertype(parent)
    // Covariant dari chill ke parent

    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Iwan");

        //valid karena menggunakan covariant
        process(stringMyData);
        MyData<? extends Object> myData = stringMyData;
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());

        //myData.setData(1); // tidak boleh karena berbahaya
    }
}
