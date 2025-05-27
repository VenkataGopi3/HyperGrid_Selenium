package oops_concept.Inheritance;

public class Child extends Parent {

    public static void login()
    {
        System.out.println("Test3 is completed");

    }
    public void register()
    {
        System.out.println("Test4 is completed");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.test1();


        int c = parent.test1(1,2);
        System.out.println("sum of two numbers"+c);
        login();
        child.register();

    }
}
