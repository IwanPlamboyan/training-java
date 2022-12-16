package generic.typeerasure;

import generic.classgeneric.MyData;

public class Main {
    public static void main(String[] args) {
        MyData myData = new MyData("Iwan");

        //akan ERROR pada saat dirunning karena type generic tidak dituliskan
        MyData<Integer> integerMyData = myData;
        Integer integer = integerMyData.getData();
    }
}
