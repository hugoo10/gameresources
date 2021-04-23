package gameresources.pattern.optimization.dirty_flag.v2_dirty_flag;

class GraphNode {
    private static final int MAX_CHILDREN = 50;
    private Transform local;
    private Transform world;
    private boolean dirty;
    private Mesh mesh;
    private GraphNode[] children = new GraphNode[MAX_CHILDREN];
    private int numChildren;

    public GraphNode(Mesh mesh) {
        this.mesh = mesh;
        local = Transform.origin();
        this.dirty  = true;
    }

    public void render(Transform parentWorld, boolean dirty) {
        this.dirty |= dirty;
        if (this.dirty) {
            world = local.combine(parentWorld);
            this.dirty = false;
        }
        if (mesh != null) renderMesh(mesh, world);
        for (int i = 0; i < numChildren; i++) {
            children[i].render(world, dirty);
        }
    }

    public void setTransform(Transform local) {
        local = local;
        dirty = true;
    }

    public void renderMesh(Mesh mesh, Transform transform) {

    }
}
