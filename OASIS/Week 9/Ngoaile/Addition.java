public class Addition extends BinaryExpression {
    /*
     * Javadoc.
     */    
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    public String toString() {
        return ("(" + left + " + " + right + ")");
    }

    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }    
}
