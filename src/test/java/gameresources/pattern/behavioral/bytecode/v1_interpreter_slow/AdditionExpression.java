package gameresources.pattern.behavioral.bytecode.v1_interpreter_slow;

class AdditionExpression implements Expression {
    private final Expression left_;
    private final Expression right_;


    public AdditionExpression(Expression left, Expression right) {
        left_ = left;
        right_ = right;
    }

    @Override
    public double evaluate() {
        double left = left_.evaluate();
        double right = right_.evaluate();
        return left + right;
    }
}
