package gameresources.pattern.behavioral.bytecode.v4_add_compexlity;

interface Instruction {
    int INST_SET_HEALTH = 0x0;
    int INST_SET_WISDOM = 0x1;
    int INST_SET_AGILITY = 0x2;
    int INST_PLAY_SOUND = 0x3;
    int INST_SPAWN_PARTICLES = 0x4;
    int INST_LITERAL = 0x5;

    int INST_GET_HEALTH = 0x6;
    int INST_GET_AGILITY = 0x7;
    int INST_GET_WISDOM = 0x8;

    int INST_ADD = 0x9;
    int INST_DIVIDE = 0xA;
}
