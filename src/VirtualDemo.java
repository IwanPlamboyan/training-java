public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Mohn Motashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Bostom, MA", 2, 2400.00);
        System.out.println("call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employe reference--");
        e.mailCheck();
    }
}
