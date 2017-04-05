import model.problem.NumberedCube;
import model.problem.PermutationGenerator;
import model.problem.UniqueEdgeSumCubeGatherer;

/**
 * Created by bgabonyi on 2017. 03. 30..
 */
public class Main {
    public static void main(String[] args) {

        UniqueEdgeSumCubeGatherer uniqueEdgeSumCubeGatherer = new UniqueEdgeSumCubeGatherer();

        PermutationGenerator.getNaturalNumbersPermutation(8).forEach(permutation -> {
            NumberedCube numberedCube = new NumberedCube(permutation);
            uniqueEdgeSumCubeGatherer.offerCube(numberedCube);
        });

        uniqueEdgeSumCubeGatherer.listUniqueCubesInOrder();
    }
}
