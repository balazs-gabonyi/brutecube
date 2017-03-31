import model.problem.NumberedCubeValidator;
import model.problem.PermutationGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by bgabonyi on 2017. 03. 30..
 */
public class Main {
    public static void main(String[] args) {

        Integer[] permutationSource = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};

        List<ArrayList<Integer>> permutations = PermutationGenerator.getPermutations(permutationSource);


        System.out.println("PermutationLists:");
        permutations.forEach(permutation -> {
            NumberedCubeValidator numberedCubeValidator = new NumberedCubeValidator(permutation);
        });

    }
}
