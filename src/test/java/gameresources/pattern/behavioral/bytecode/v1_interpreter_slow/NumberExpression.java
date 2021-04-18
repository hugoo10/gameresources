package gameresources.pattern.behavioral.bytecode.v1_interpreter_slow;

class NumberExpression implements Expression {
    private final double value_;


    public NumberExpression(double value) {
        value_ = value;
    }

    @Override
    public double evaluate() {
        return value_;
    }
}
