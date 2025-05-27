package oops_concept.Inheritance.Encapsulation;

public class Child extends Parent {

    public static void main(String[] args) {
        Parent parent = new Parent();

        parent.setId(3337);
        int k = parent.getId();
        System.out.println(k);

        parent.setName("Bablu");
        String s = parent.getName();
        System.out.println(s);

        parent.setNo(79.8);
        //double d = parent.getNo();
        System.out.println(parent.getNo());
    }
}
