package model.abstractions;

/**
 * Created by bgabonyi on 2017. 03. 30..
 */
public enum CubeEdge {
    FRONT_LEFT(CubeVertex.FRONT_BOTTOM_LEFT, CubeVertex.FRONT_TOP_LEFT),
    FRONT_TOP(CubeVertex.FRONT_TOP_LEFT, CubeVertex.FRONT_TOP_RIGHT),
    FRONT_RIGHT(CubeVertex.FRONT_TOP_RIGHT, CubeVertex.FRONT_BOTTOM_RIGHT),
    FRONT_BOTTOM(CubeVertex.FRONT_BOTTOM_RIGHT, CubeVertex.FRONT_BOTTOM_LEFT),

    DEPTH_BOTTOM_LEFT(CubeVertex.FRONT_BOTTOM_LEFT, CubeVertex.REAR_BOTTOM_LEFT),
    DEPTH_TOP_LEFT(CubeVertex.FRONT_TOP_LEFT, CubeVertex.REAR_TOP_LEFT),
    DEPTH_TOP_RIGHT(CubeVertex.FRONT_TOP_RIGHT, CubeVertex.REAR_TOP_RIGHT),
    DEPTH_BOTTOM_RIGHT(CubeVertex.FRONT_BOTTOM_RIGHT, CubeVertex.REAR_BOTTOM_RIGHT),

    REAR_LEFT(CubeVertex.REAR_BOTTOM_LEFT, CubeVertex.REAR_TOP_LEFT),
    REAR_TOP(CubeVertex.REAR_TOP_LEFT, CubeVertex.REAR_TOP_RIGHT),
    REAR_RIGHT(CubeVertex.REAR_TOP_RIGHT, CubeVertex.REAR_BOTTOM_RIGHT),
    REAR_BOTTOM(CubeVertex.REAR_BOTTOM_RIGHT, CubeVertex.REAR_BOTTOM_LEFT);

    private final CubeVertex vertex1;
    private final CubeVertex vertex2;

    CubeEdge(CubeVertex vertex1, CubeVertex vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    public CubeVertex getVertex1() {
        return vertex1;
    }

    public CubeVertex getVertex2() {
        return vertex2;
    }

}
