public class Square extends Expression {
    private Expression expression;

    public Square() {}

    public Square(Expression expression) {
        this.expression = expression;
    }

    public String toString() {
        return ("(" + expression + ") ^ 2");
    }

    public double evaluate() {
        return Math.pow(expression.evaluate(), 2);
    }
}
