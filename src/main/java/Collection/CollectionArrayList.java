package Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList {
    public static void main(String[] args) {

        Collection collection = new ArrayList(6);

        collection.add("Selenium");
        collection.add("Postman");
        collection.add(4.31);
        collection.add(true);
        collection.add('S');
        collection.add(4);
        collection.add("Selenium");


        System.out.println(collection);
        System.out.println("*******************");

        List <String>list = new ArrayList();
        list.add("Selenium");
        list.add("Appium");
        list.add("RestAssured");
        list.add("Playwright");


         int[] a ={1,2,3,4,5,6,7};

        for (String str: list){
            System.out.println(str);
        }
        System.out.println("*******************");

        List<String> list1 = new ArrayList<>();
        list1.add("Selenium");
        list1.add("Appium");
        list1.add("RestAssured");
        list1.add("Playwright");
        list1.add("Playwright");
        list1.add("Selenium");

        for (String str: list1){
            System.out.print(str);
        }System.out.println();
        System.out.println("*******************");

        for (int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }System.out.println();
        System.out.println("*******************");


        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(iterator.hasNext());


        }
        System.out.println("*******************");

        System.out.println(list1);
        System.out.println("*******************");

        System.out.println(list1.get(1).equals("Appium"));
    }

}
