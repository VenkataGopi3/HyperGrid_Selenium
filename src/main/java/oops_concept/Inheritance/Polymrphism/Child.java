package oops_concept.Inheritance.Polymrphism;

public class Child extends Parent
{


    public static void Sum()
    {
        System.out.println("Over Loading Method");
    }

    public double Sum(double a, int b)
    {
        return (a+b);

    }
    public double Sum(int a, double b)
    {
        return a+b;
    }

    //@overloading
    public double Sum(double a, int b, double c)
    {
        return a+b+c;
    }

    //@override
    public double Sum(double a, double b, double c)
    {
        //double a = 21.5, b = 31.5, c=88;
        return a+b+c;
    }

    public static void main(String[] args) {
        Child child =new Child();
        System.out.println(child.Sum(33.3,12));
        System.out.println(child.Sum(7,12.5));
        System.out.println(child.Sum(7,12,35.9));
        System.out.println(child.Sum(7,12.9,35.9));


    }




}

