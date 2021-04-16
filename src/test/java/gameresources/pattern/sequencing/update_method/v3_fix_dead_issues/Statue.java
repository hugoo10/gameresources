package gameresources.pattern.sequencing.update_method.v3_fix_dead_issues;

class Statue extends Entity {
    private int frames = 0;
    private int delay;

    public Statue(int delay) {
        this.delay = delay;
    }

    @Override
    public void update() {
        if (++frames == delay) {
            shootLightning();
            frames = 0;
        }
    }

    private void shootLightning() {

    }
}
