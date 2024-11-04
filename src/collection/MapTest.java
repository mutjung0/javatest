package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "s1");
        map.put(2, "s2");

        // print
        // java 8 Map.forEach
        map.forEach((key, value) -> System.out.println(key + " " + value));

        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });

        map.forEach((k,v)->System.out.println(k+":"+v));

        // entry
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // keySet
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            System.out.println(integer + " " + map.get(integer));
        }

        for (int key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

        // Iterator
        Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
            Integer key = entry.getKey();
            String val = entry.getValue();
            System.out.println(key + " " + val);
        }

        it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



    }
}
