import model.problem.NumberedCube;
import model.problem.PermutationGenerator;
import model.problem.UniqueEdgeSumCubeGatherer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bgabonyi on 2017. 03. 30..
 */
public class Main {
    public static void main(String[] args) {

        Integer[] permutationSource = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};

        List<ArrayList<Integer>> permutations = PermutationGenerator.getPermutations(permutationSource);
        UniqueEdgeSumCubeGatherer uniqueEdgeSumCubeGatherer = new UniqueEdgeSumCubeGatherer();

        permutations.forEach(permutation -> {
            NumberedCube numberedCube = new NumberedCube(permutation);
            uniqueEdgeSumCubeGatherer.offerCube(numberedCube);
        });

        uniqueEdgeSumCubeGatherer.listUniqueCubesInOrder();

    }
}
