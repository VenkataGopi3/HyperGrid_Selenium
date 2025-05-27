package Arrays;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Selenium");
        set.add("Appium");
        set.add("RestAssured");
        set.add("PlayWright");
        set.add("Selenium");
        set.add(null);
        //set.add(20);

        System.out.println(set);

        for (String s : set){
            System.out.println(set.size());
            System.out.println(set.equals("Appium"));
            System.out.println(set.contains("Selenium"));
            System.out.println(set.isEmpty());
            break;
        }

        /**List<String> list = new ArrayList<>();
        list.add("Selenium");
        list.add("Appium");
        list.add("RestAssured");
        list.add("Playwright");
        list.add("Playwright");
        list.add("Selenium");
        list.add(null);
        list.add(null);

        System.out.println( "index of ::  " + list.indexOf("Appium"));

        Set<String> hasSet = new HashSet<>(list);
        System.out.println(hasSet);

        List<String> arrayList = new ArrayList<>(set);
        System.out.println(arrayList);**/

    }
}
