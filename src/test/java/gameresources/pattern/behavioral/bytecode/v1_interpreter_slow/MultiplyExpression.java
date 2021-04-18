package gameresources.pattern.behavioral.bytecode.v1_interpreter_slow;

class MultiplyExpression implements Expression {
    private final Expression left_;
    private final Expression right_;


    public MultiplyExpression(Expression left, Expression right) {
        left_ = left;
        right_ = right;
    }

    @Override
    public double evaluate() {
        double left = left_.evaluate();
        double right = right_.evaluate();
        return left * right;
    }
}
