package generic.genericmethod.util;

public class ArrayHelper {

    //Generic method
    public static <T> int count(T[] array) {
        return array.length;
    }
}
