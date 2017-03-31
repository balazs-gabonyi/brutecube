package badidea_lol;

import java.util.Arrays;

/**
 * Created by bgabonyi on 2017. 03. 31..
 */
public class PermutationIterator {

    private int[] source;
    private int[] current;

    public PermutationIterator(int[] source) {
        this.source = source;
        current = Arrays.copyOf(source, source.length);
    }

    private PermutationIterator() {
        //hiding default constructor
    }

    public void permute() {
        permute(0, source.length - 1);
    }

    private void permute(int start, int end) {
        int current_index;
        if (start == end)
            System.out.println(Arrays.toString(current));
        else {
            for (current_index = start; current_index <= end; current_index++) {
                swap(start, current_index);
                permute(start + 1, end);
                swap(start, current_index); // backtrack
            }
        }
    }

    private void swap(int position1, int position2) {
        int temp = current[position1];
        current[position1] = current[position2];
        current[position2] = temp;
    }
}
