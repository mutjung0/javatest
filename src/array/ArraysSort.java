package array;

import java.util.Arrays;

public class ArraysSort {

    public static void main(String[] args) {
        int[] n = {10,9,8,7,6,5,4,3,2,1};

        // print
        // Arrays.toString
        System.out.println(Arrays.toString(n)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        // Arrays.sort
        // 본래 배열의 정렬이 바뀜

        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
		/*
		 * [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
			[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		 */
    }
}
