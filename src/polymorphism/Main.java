package polymorphism;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("wan");
        employee.sayHello("cuy");

        employee = new Manager("wan");
        employee.sayHello("cuy");

        employee = new VicePresident("wan");
        employee.sayHello("cuy");

        sayHello(new Employee("wan"));
        sayHello(new Manager("naruto"));
        sayHello(new VicePresident("itachi"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
