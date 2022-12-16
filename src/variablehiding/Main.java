package variablehiding;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "wan";
        child.doIt();
        System.out.println(child.name);

        Parent parent = child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
