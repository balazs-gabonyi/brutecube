import model.problem.PermutationGenerator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by bgabonyi on 2017. 03. 30..
 */
public class Main {
    public static void main(String[] args) {

        Integer[] numbers = new Integer[]{1, 2, 3, 4};

        List<List<Integer>> permutations = PermutationGenerator.getPermutations(numbers);

        List<Integer> randomList = new LinkedList<>(Arrays.asList(7,8,9));
        permutations.add(randomList);

        System.out.println("PermutationLists:");
        permutations.forEach(permutation -> {
            permutation.forEach(System.out::print);
            System.out.println();
        });

    }
}
