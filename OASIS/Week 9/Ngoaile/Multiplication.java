public class Multiplication extends BinaryExpression {
    /*
     * Javadoc.
     */
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    public String toString() {
        return ("(" + left + " * " + right + ")");
    }

    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }  
}
