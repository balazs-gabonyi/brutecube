package model.abstractions;

/**
 * Created by bgabonyi on 2017. 03. 31..
 */
public class Cube {

    private final CubeVertex[] vertices = CubeVertex.values();
    private final CubeEdge[] edges = CubeEdge.values();

    public CubeVertex[] getVertices() {
        return vertices;
    }

    public CubeEdge[] getEdges() {
        return edges;
    }


}
