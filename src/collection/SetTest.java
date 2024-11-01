package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");

        // print
        for (String string : set) {
            System.out.println(string);
        }



    }
}
