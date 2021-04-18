package gameresources.pattern.behavioral.bytecode.v3_pattern_stack;

interface Instruction {
    int INST_SET_HEALTH = 0x0;
    int INST_SET_WISDOM = 0x1;
    int INST_SET_AGILITY = 0x2;
    int INST_PLAY_SOUND = 0x3;
    int INST_SPAWN_PARTICLES = 0x4;
    int INST_LITERAL = 0x5;
}
