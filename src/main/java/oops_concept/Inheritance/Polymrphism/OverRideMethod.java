package oops_concept.Inheritance.Polymrphism;

public class OverRideMethod extends OverRide
{
    public void Payments()
    {
        System.out.println("This Method is OverRide");
    }

    public static void main(String[] args) {
        OverRideMethod overRideMethod = new OverRideMethod();
        overRideMethod.Payments();
        OverRide overRide = new OverRide();
        overRide.Payments();
        OverRide overRide1 = new OverRideMethod();
        overRide1.Payments();
        overRide.Sum();

    }
}
