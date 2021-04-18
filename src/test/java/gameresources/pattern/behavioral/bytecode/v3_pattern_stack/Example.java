package gameresources.pattern.behavioral.bytecode.v3_pattern_stack;

import org.junit.jupiter.api.Test;

public class Example {
    @Test
    public void set_wizard_0_health_10() {
        VM vm = new VM();
        char[] instructions = {Instruction.INST_LITERAL, 0, Instruction.INST_LITERAL, 10, Instruction.INST_SET_HEALTH};
        vm.interpret(instructions, instructions.length);
    }
}
