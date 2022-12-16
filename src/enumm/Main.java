package enumm;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("wan");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

        //konversi dari enum ke string
        System.out.println("=========Konversi dari enum ke string=======");
        String levelCustomer = customer.getLevel().name();
        System.out.println(levelCustomer);
        System.out.println(Level.VIP.name());

        //konversi dari string ke enum
        System.out.println("==========Konversi dari string ke enum========");
        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        //cek jumlah enum
        System.out.println("-----Cek jumlah enum-----");
        Level[] levels = Level.values();
        System.out.println(levels);

        for (Level value : levels) {
            System.out.println(value);
        }
    }
}
