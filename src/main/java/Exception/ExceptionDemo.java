package Exception;

public class ExceptionDemo {
    static int i=10;
    static{
        System.out.println("Charan kumar reddy");
    }

    public static void chandu() {

        try {
            System.out.println("Bablu");


            chandu();
            //throw new StackOverflowError();
        }
        catch (StackOverflowError soe)
        {

            //soe.printStackTrace();
            throw new StackOverflowError();
        }
    }
    public static void main(String[] args)   {
        chandu();
    }
       /** static {
            System.out.println("Chandu");
    }**/

}
