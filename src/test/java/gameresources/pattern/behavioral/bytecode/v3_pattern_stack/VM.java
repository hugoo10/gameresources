package gameresources.pattern.behavioral.bytecode.v3_pattern_stack;

import java.util.Stack;

class VM {
    private static final int MAX_STACK = 128;
    private Stack<Integer> stack_ = new Stack<>();
    private Spell spell = new Spell();

    private void push(int value) {
        assert stack_.size() < MAX_STACK;
        stack_.push(value);
    }

    private int pop() {
        return stack_.pop();
    }

    public void interpret(char[] bytecode, int size) {
        for (int i = 0; i < size; ++i) {
            char instruction = bytecode[i];
            switch (instruction) {
                case Instruction.INST_SET_HEALTH -> {
                    int amount = pop();
                    int wizard = pop();
                    spell.setHealth(wizard, amount);
                }
                case Instruction.INST_SET_WISDOM -> {
                    int amount = pop();
                    int wizard = pop();
                    spell.setWisdom(wizard, amount);
                }
                case Instruction.INST_SET_AGILITY -> {
                    int amount = pop();
                    int wizard = pop();
                    spell.setAgility(wizard, amount);
                }
                case Instruction.INST_PLAY_SOUND -> spell.playSound(pop());
                case Instruction.INST_SPAWN_PARTICLES -> spell.spawnParticles(pop());
                case Instruction.INST_LITERAL -> {
                    int value = bytecode[++i];
                    push(value);
                }
            }
        }
    }
}
