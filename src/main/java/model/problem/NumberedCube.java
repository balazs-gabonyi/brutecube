package model.problem;

import model.abstractions.Cube;
import model.abstractions.CubeEdge;
import model.abstractions.CubeVertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by bgabonyi on 2017. 03. 31..
 */
public class NumberedCube extends Cube {

    private HashMap<CubeVertex, Integer> numberedVertices = new HashMap<>();
    private Set<Integer> uniqueEdgeCounter = new LinkedHashSet<>();

    private NumberedCube() {
        //hiding default constructor
    }

    public NumberedCube(ArrayList<Integer> permutation) {
        setVerticesFromPermutation(permutation);
        countUniqueSumEdges();
    }

    private void setVerticesFromPermutation(ArrayList<Integer> permutation) {
        for (int i = 0; i < getVertices().length; i++) {
            numberedVertices.put(getVertices()[i], permutation.get(i));
        }
    }

    public Integer getUniqueEdgeCount() {
        return uniqueEdgeCounter.size();
    }

    private void countUniqueSumEdges() {
        for (CubeEdge edge : getEdges()) {
            uniqueEdgeCounter.add(getEdgeSum(edge));
        }
    }

    public Integer getEdgeSum(CubeEdge edge) {
        Integer vertex1Value = numberedVertices.get(edge.getVertex1());
        Integer vertex2Value = numberedVertices.get(edge.getVertex2());
        return vertex1Value + vertex2Value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nUnique Edge sums: ");
        sb.append(getUniqueEdgeCount());
        sb.append("\n");
        for (int i = 0; i < getVertices().length; i++) {
            CubeVertex current = getVertices()[i];
            sb.append(current);
            sb.append(": ");
            sb.append(numberedVertices.get(current));
            sb.append("\n");
        }
        return sb.toString();
    }
}