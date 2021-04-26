package gameresources.pattern.optimization.spatial_partition.v1_unit_on_field_battle;

class Game {

    //O(n²)
    public void handleMelee(Unit[] units, int numUnits) {
        for (int a = 0; a < numUnits - 1; ++a) {
            for (int b = a + 1; b < numUnits; ++b) {
                if (units[a].getPosition().equals(units[b].getPosition())) {
                    handleAttack(units[a], units[b]);
                }
            }
        }
    }

    private void handleAttack(Unit unit, Unit unit1) {
    }
}
