package Arrays;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListCollection {

    public static void main(String[] args) {

        Collection collection= new ArrayList();
        collection.add("Bablu");
        collection.add("Venkat");
        collection.add(7);
        collection.add(33.3);
        collection.add('S');

        System.out.println(collection);
        System.out.println("*********************");
        collection.remove("Venkat");

        System.out.println(collection);
        System.out.println("*********************");
        collection.contains("Ba");

        //collection.size();
        System.out.println(collection.size());
        System.out.println("*********************");
        System.out.println(collection.isEmpty());



    }
}
