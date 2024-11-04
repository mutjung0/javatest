package string;

import java.util.Arrays;

public class StringToCharArray {

    public static void main(String[] args) {

        // toCharArray()
        String myStr = "Hello";
        char[] myArray = myStr.toCharArray();
        System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
