package model.problem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by bgabonyi on 2017. 03. 31..
 */
public class PermutationGenerator {

    private static List<List<Integer>> permutations = new LinkedList<>();

    public static List<List<Integer>> getPermutations(Integer[] array) {
        generatePermutations(array);
        return permutations;
    }

    private static void generatePermutations(Integer[] array) {
        permute(array, 0, array.length - 1);
    }

    private static void permute(Integer[] array, Integer start, Integer end) {
        int current;
        if (start == end) {
            List<Integer> permutation = deepCopyList(Arrays.asList(array));
            permutations.add(permutation);
        } else {
            for (current = start; current <= end; current++) {
                swap(array, start, current);
                permute(array, start + 1, end);
                swap(array, start, current);
            }
        }
    }

    private static void swap(Integer[] array, int position1, int position2) {
        int temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;
    }

    private static void printList(List<Integer> list) {
        list.forEach(System.out::print);
        System.out.println();
    }

    private static List<Integer> deepCopyList(List<Integer> source){
        List<Integer> copy = new LinkedList<>();
        source.forEach(copy::add);
        return copy;
    }
}
