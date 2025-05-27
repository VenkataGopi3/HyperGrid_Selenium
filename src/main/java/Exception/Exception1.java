package Exception;

public class Exception1 {

    public static void main(String[] args) {
        int b;
        String str ;

        try {
            int[] a = {1,5,3,8};
            b = 5/0;
            System.out.println(b);
            System.out.println(a[3]);
            str = "Bablu";
            System.out.println(str.length());
        }
      /**  catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }
        catch (Exception e){
            System.out.println("Exception Handled");
        }*/
      catch(Exception e){
          System.out.println("Arithmetic Exception");
      }
    }
}
