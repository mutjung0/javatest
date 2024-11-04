package string;

import java.util.Arrays;

public class StringMethod {

    public static void main(String[] args) {

        String s = "";

        String s1 = "0123456789";

        System.out.println(s1.length()); // 10

        System.out.println(s1.charAt(1)); // 1

        // substring(beginIndex, endIndex)
        // beginIndex <= index < endIndex
        System.out.println(s1.substring(1, 1)); //
        System.out.println(s1.substring(1, 3)); // 12

        // indexOf
        // equals

        // getChars: String의 일부분을 char 배열에 복사
        // Copy part of a string into a char array
        char[] dst = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(dst);

        String src = "abcdefg"; // source

        src.getChars(2,4, dst, 0);
        System.out.println(dst); // cd23456789


        // replace
        String ddd = "abcdefghijk";
        System.out.println(ddd.replace('a', 'p')); // pbcdefghijk

        // toCharArray()
        String myStr = "Hello";
        char[] myArray = myStr.toCharArray();
        System.out.println(myArray);

        // getBytes
        String a = "a";
        System.out.println(a.getBytes()); // [B@4eec7777 byte[]
        System.out.println(Arrays.toString(a.getBytes())); //[97]
        System.out.println(a.getBytes().length); // 1

        String b = "가";
        System.out.println(Arrays.toString(b.getBytes())); // [-22, -80, -128]
        System.out.println(b.getBytes().length); // 3


        // https://www.w3schools.com/java/java_ref_string.asp
    }
}
