package gameresources.pattern.optimization.dirty_flag.v1_unoptimized;

class GraphNode {
    private static final int MAX_CHILDREN = 50;
    private Transform local;
    private Mesh mesh;
    private GraphNode[] children = new GraphNode[MAX_CHILDREN];
    private int numChildren;

    public GraphNode(Mesh mesh) {
        this.mesh = mesh;
        local = Transform.origin();
    }

    public void render(Transform parentWorld) {
        Transform world = local.combine(parentWorld);
        if (mesh != null) renderMesh(mesh, world);
        for (int i = 0; i < numChildren; i++) {
            children[i].render(world);
        }
    }

    public void renderMesh(Mesh mesh, Transform transform) {

    }
}
