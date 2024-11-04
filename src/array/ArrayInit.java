package array;

import java.util.Arrays;

public class ArrayInit {

    public static void main(String[] args) {

        // 초기화
        int[] a1 = {};
        System.out.println(Arrays.toString(a1));
        //[]

        int[] a2 = {1,2,3};
        System.out.println(Arrays.toString(a2));
        //[1, 2, 3]

        int[] a3 = new int[5];
        System.out.println(Arrays.toString(a3));
        //[0, 0, 0, 0, 0]

        // String array
        String[] s1 = new String[5];
        System.out.println(Arrays.toString(s1));
        //[null, null, null, null, null]
        //if (s1[0].equals(null)) System.out.println("s1[0] = null");
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "s1[0]" is null
        if (s1[0] == null) System.out.println("s1[0] == null");

        char[] c1 = new char[5];
        System.out.println(c1);
        System.out.println(Arrays.toString(c1));
        //[ , , , , ]
        if (c1[0] == ' ') System.out.println("c1[0] == ' '");
        System.out.println("["+c1[0]+"]");
        System.out.println("["+(int)c1[0]+"]");

        char[] c2 = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(c2));

        // 다차원
        int[][] a4 = new int[5][5];
        System.out.println(Arrays.toString(a4));
        //[[I@4517d9a3, [I@372f7a8d, [I@2f92e0f4, [I@28a418fc, [I@5305068a]

        // 다차원 출력




        int n1 = 5;
        int[][] a5 = new int[n1][n1];
        System.out.println(Arrays.toString(a5));
        //[[I@1f32e575, [I@279f2327, [I@2ff4acd0, [I@54bedef2, [I@5caf905d]

        int e1 = 1;
        int[] a6 = {e1};
        System.out.println(Arrays.toString(a6));
        //[1]

        // List to array

    }
}
