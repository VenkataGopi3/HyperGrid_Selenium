package oops_concept.Inheritance.Polymrphism;

public class Parent {

    //@overloading
    public int Sum(int a, int b)
    {
    return (a+b);
    }

    public double Sum(double a, double b, double c)
    {
        return a+b+c;
    }
    public long Sum(long c, int d)
    {
        return c+d;
    }
    public char Sum(char c)
    {
        return c;
    }
    public double Sum(double a, double b)
    {
        return a+b;
    }

}
