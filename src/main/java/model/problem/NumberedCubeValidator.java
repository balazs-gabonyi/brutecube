package model.problem;

import model.abstractions.CubeEdge;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Created by bgabonyi on 2017. 03. 31..
 */
public class NumberedCubeValidator extends NumberedCube {

    private Set<Integer> edgeSumValidatorSet = new LinkedHashSet<>();
    private static final Logger LOGGER = Logger.getLogger(NumberedCubeValidator.class.getName());

    public NumberedCubeValidator(ArrayList<Integer> permutation) {
        super(permutation);
        validateEdgeRule();
    }

    private void validateEdgeRule() {
        fillValidatorSet();
        if (edgeSumValidatorSet.size() > 10){
            LOGGER.info("Num. of Unique Edge sums : " + edgeSumValidatorSet.size());
            LOGGER.info(this.toString());
        }

    }

    private void fillValidatorSet() {
        for (CubeEdge edge : getEdges()) {
            edgeSumValidatorSet.add(getEdgeSum(edge));
        }
    }
}

