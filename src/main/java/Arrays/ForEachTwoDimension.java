package Arrays;

public class ForEachTwoDimension {
    public static void main(String[] args) {

        int[][] s ={{1,2,3,4},{31,32,33},{100,101}};

        for(int[] m : s){
            System.out.println(m.length);
            System.out.println("*******************");
            for (int j:m){
                System.out.println(j);
            }
            System.out.println("*******************");
        }
    }
}
