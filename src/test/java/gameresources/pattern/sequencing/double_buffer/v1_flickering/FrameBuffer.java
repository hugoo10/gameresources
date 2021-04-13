package gameresources.pattern.sequencing.double_buffer.v1_flickering;

class FrameBuffer {
    private static final int WIDTH = 160;
    private static final int HEIGHT = 120;
    private char pixels_[] = new char[WIDTH * HEIGHT];

    public FrameBuffer() {
        clear();
    }

    void clear() {
        for (int i = 0; i < WIDTH * HEIGHT; i++) {
            pixels_[i] = 'W';
        }
    }

    public void draw(int x, int y) {
        pixels_[(WIDTH * y) + x] = 'B';
    }

    public char[] getPixels() {
        return pixels_;
    }
}