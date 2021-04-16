package gameresources.pattern.sequencing.update_method.v3_fix_dead_issues;

class Skeleton extends Entity {
    private boolean patrollingLeft = false;

    @Override
    public void update() {
        if (patrollingLeft) {
            setX(getX() - 1);
            if (getX() == 0) patrollingLeft = false;
        } else {
            setX(getX() + 1);
            if (getX() == 100) patrollingLeft = true;
        }
    }
}
