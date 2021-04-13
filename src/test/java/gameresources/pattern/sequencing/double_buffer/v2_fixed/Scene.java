package gameresources.pattern.sequencing.double_buffer.v2_fixed;

class Scene {
    private FrameBuffer current_;
    private FrameBuffer next_;

    public void draw() {
        next_.clear();
        next_.draw(1, 1);
        next_.draw(4, 1);
        next_.draw(1, 3);
        next_.draw(2, 4);
        next_.draw(3, 4);
        next_.draw(4, 3);

        swap();
    }

    private void swap() {
        var tmp = current_;
        current_ = next_;
        next_ = tmp;
    }

    public FrameBuffer getBuffer_() {
        return current_;
    }
}
