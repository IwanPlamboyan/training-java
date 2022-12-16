package generic.classgeneric;

public class Main {
    public static void main(String[] args) {
        MyData<String> dataString = new MyData<String>("Ini String");
        System.out.println(dataString.getData());
        dataString.setData("set data String");
        System.out.println(dataString.getData());

        MyData<Integer> dataInteger = new MyData<>(2);
        System.out.println(dataInteger.getData());

        System.out.println("------------------------");
        Pair<String, Integer> pair = new Pair<>("Ini string", 2);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
