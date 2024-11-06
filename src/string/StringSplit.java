package string;

import java.util.Arrays;

public class StringSplit {

    public static void main(String[] args) {
        String a = "abcd";
        System.out.println(Arrays.toString(a.split(""))); // [a, b, c, d]

        String b = "boo:and:foo";
        System.out.println(Arrays.toString(b.split(":"))); // [boo, and, foo]
        System.out.println(Arrays.toString(b.split("o"))); // [b, , :and:f]
        // { "b", "", ":and:f"}


    }
}
