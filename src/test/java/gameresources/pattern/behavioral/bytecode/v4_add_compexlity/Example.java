package gameresources.pattern.behavioral.bytecode.v4_add_compexlity;

import org.junit.jupiter.api.Test;

import static gameresources.pattern.behavioral.bytecode.v4_add_compexlity.Instruction.*;

class Example {
    @Test
    public void test() {
        VM vm = new VM();

        /*
         equivalent:  setHealth(0, getHealth(0) +    (getAgility(0) + getWisdom(0)) / 2);
         */
        char[] instructions = {
                INST_LITERAL, 0,
                INST_LITERAL, 0,
                INST_GET_HEALTH,
                INST_LITERAL, 0,
                INST_GET_AGILITY,
                INST_LITERAL, 0,
                INST_GET_WISDOM,
                INST_ADD,
                INST_LITERAL, 2,
                INST_DIVIDE,
                INST_ADD,
                INST_SET_HEALTH
        };
        vm.interpret(instructions, instructions.length);
    }
}
