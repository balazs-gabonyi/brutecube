package stackoverfloo;

import java.util.Arrays;

/**
 * Created by bgabonyi on 2017. 03. 30..
 */
public class PermutationSysOut {

    public static void permute(int[] array) {
        permute(array, 0, array.length - 1);
    }

    private static void permute(int[] array, int start, int end) {
        int current;
        if (start == end)
            System.out.println(Arrays.toString(array));
        else {
            for (current = start; current <= end; current++) {
                swap(array, start, current);
                permute(array, start + 1, end);
                swap(array, start, current); // backtrack
            }
        }
    }

    private static void swap(int[] array, int position1, int position2) {
        int temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;
    }

}
