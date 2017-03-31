package model.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by bgabonyi on 2017. 03. 31..
 */
public class PermutationGenerator {

    private static List<ArrayList<Integer>> permutations = new LinkedList<>();

    private PermutationGenerator(){
        //hiding default constructor
    }

    public static List<ArrayList<Integer>> getPermutations(Integer[] array) {
        generatePermutations(array);
        return permutations;
    }

    private static void generatePermutations(Integer[] array) {
        permute(array, 0, array.length - 1);
    }

    private static void permute(Integer[] array, Integer start, Integer end) {
        int current;
        if (start == end) {
            ArrayList<Integer> permutation = deepCopyList(Arrays.asList(array));
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

    private static ArrayList<Integer> deepCopyList(List<Integer> source){
        ArrayList<Integer> copy = new ArrayList<>();
        source.forEach(copy::add);
        return copy;
    }
}
