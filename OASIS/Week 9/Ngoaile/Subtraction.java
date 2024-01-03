public class Subtraction extends BinaryExpression {
    /* 
     * Javadoc.
    */
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    public String toString() {
        return ("(" + left + " - " + right + ")");
    }

    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }  
}
