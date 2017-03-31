package model.abstractions;

import model.abstractions.CubeEdge;
import model.abstractions.CubeVertex;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bgabonyi on 2017. 03. 31..
 */
public class Cube {

    private CubeVertex[] vertices = CubeVertex.values();
    private CubeEdge[] edges = CubeEdge.values();

    public CubeVertex[] getVertices() {
        return vertices;
    }

    public CubeEdge[] getEdges() {
        return edges;
    }


}
