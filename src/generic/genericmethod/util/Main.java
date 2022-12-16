package generic.genericmethod.util;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Iwan", "Plamboyan", "Ucok"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        //Tidak wajid menyebutkan Stringnya
        System.out.println(ArrayHelper.<String>count(names));
        //contohnya
        System.out.println(ArrayHelper.count(names));


        //Tidak wajid menyebutkan Stringnya
        System.out.println(ArrayHelper.<Integer>count(numbers));
        //contohnya
        System.out.println(ArrayHelper.count(numbers));
    }
}
