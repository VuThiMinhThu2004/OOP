public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /*
     * Javadoc. 
     */
    public BinaryExpression() {}

    /*
     * Javadoc.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return "NULL";
    }
    
    public double evaluate() {
        return 0;
    }
}
