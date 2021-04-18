package gameresources.pattern.behavioral.bytecode.v2_the_pattern;


class VM {
    private Spell spell = new Spell();
    private static final int SOUND_BANG = 20;
    private static final int PARTICLE_FLAME = 20;

    public void interpret(char[] bytecode, int size) {
        for (int i = 0; i < size; ++i) {
            char instruction = bytecode[i];
            switch (instruction) {
                case Instruction.INST_SET_HEALTH -> spell.setHealth(0, 100);
                case Instruction.INST_SET_WISDOM -> spell.setWisdom(0, 100);
                case Instruction.INST_SET_AGILITY -> spell.setAgility(0, 100);
                case Instruction.INST_PLAY_SOUND -> spell.playSound(SOUND_BANG);
                case Instruction.INST_SPAWN_PARTICLES -> spell.spawnParticles(PARTICLE_FLAME);
            }
        }
    }
}
