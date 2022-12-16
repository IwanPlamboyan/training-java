package generic.boundedtypeparameter;

public class Constraint {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(2L);

        // NumberData<String> stringNumberData = new NumberData<>("yoo"); // ERROR karena String bukan turunan dari Number
    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
