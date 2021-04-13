package gameresources.pattern.sequencing.double_buffer.v1_flickering;

class Scene {
    private FrameBuffer buffer_;

    public void draw() {
        buffer_.clear();
        buffer_.draw(1, 1);
        buffer_.draw(4, 1);
        // <- Video driver can read pixels here!
        buffer_.draw(1, 3);
        buffer_.draw(2, 4);
        buffer_.draw(3, 4);
        buffer_.draw(4, 3);
    }

    public FrameBuffer getBuffer_() {
        return buffer_;
    }
}
