package model.abstractions;

import model.abstractions.CubeEdge;
import model.abstractions.CubeVertex;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bgabonyi on 2017. 03. 31..
 */
public class Cube {

    private List<CubeVertex> vertices = Arrays.asList(CubeVertex.values());
    private List<CubeEdge> edges = Arrays.asList(CubeEdge.values());

    public List<CubeVertex> getVertices() {
        return vertices;
    }

    public List<CubeEdge> getEdges() {
        return edges;
    }


}
