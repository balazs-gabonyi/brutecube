package model.problem;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/**
 * Created by bgabonyi on 2017. 03. 31..
 */
public class UniqueEdgeSumCubeGatherer {

    private LinkedHashMap<Integer, NumberedCube> cubes = new LinkedHashMap<>();
    private static final Logger LOGGER = Logger.getLogger(UniqueEdgeSumCubeGatherer.class.getName());

    public void offerCube(NumberedCube cube) {
        cubes.put(cube.getUniqueEdgeCount(), cube);
    }

    public void listUniqueCubesInOrder() {
        getOrderedEdgeSums().forEach(sum -> LOGGER.info(cubes.get(sum).toString()));
    }

    public ArrayList<Integer> getOrderedEdgeSums() {
        ArrayList<Integer> orderedEdgeSums = new ArrayList<>();
        cubes.forEach((edgeSums, cube) -> orderedEdgeSums.add(edgeSums));
        orderedEdgeSums.sort(Integer::compareTo);
        return orderedEdgeSums;
    }


}
