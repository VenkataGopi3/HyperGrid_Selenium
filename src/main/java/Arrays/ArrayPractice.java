package Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,0};
       // for(int i=0;i<a.length-1;i++){
         for(int k:a){
          System.out.println(k);
         }

         int[][] b = {{1,3,4,6},{8,9,35,7}};
        System.out.println(b[0][2]);
        System.out.println("****************************************");

        for (int j=0; j<=b.length-1; j++){
            for(int k=0; k<=b[j].length-1 ; k++){
                System.out.println(b[j][k]);

            }

        }
    }
}

