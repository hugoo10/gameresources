package gameresources.pattern.behavioral.bytecode.v4_add_compexlity;

import java.util.Stack;

class VM {
    private static final int MAX_STACK = 128;
    private Stack<Integer> stack_ = new Stack<>();
    private WizardManager wizardManager = new WizardManager();

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
                    wizardManager.setHealth(wizard, amount);
                }
                case Instruction.INST_SET_WISDOM -> {
                    int amount = pop();
                    int wizard = pop();
                    wizardManager.setWisdom(wizard, amount);
                }
                case Instruction.INST_SET_AGILITY -> {
                    int amount = pop();
                    int wizard = pop();
                    wizardManager.setAgility(wizard, amount);
                }
                case Instruction.INST_PLAY_SOUND -> wizardManager.playSound(pop());
                case Instruction.INST_SPAWN_PARTICLES -> wizardManager.spawnParticles(pop());
                case Instruction.INST_LITERAL -> {
                    int value = bytecode[++i];
                    push(value);
                }
                case Instruction.INST_GET_HEALTH -> {
                    int wizard = pop();
                    push(wizardManager.getHealth(wizard));
                }
                case Instruction.INST_GET_AGILITY -> {
                    int wizard = pop();
                    push(wizardManager.getAgility(wizard));
                }
                case Instruction.INST_GET_WISDOM -> {
                    int wizard = pop();
                    push(wizardManager.getWisdom(wizard));
                }
                case Instruction.INST_ADD -> {
                    int b = pop();
                    int a = pop();
                    push(a + b);
                }
                case Instruction.INST_DIVIDE -> {
                    int b = pop();
                    int a = pop();
                    push(a / b);
                }
            }
        }
    }
}
