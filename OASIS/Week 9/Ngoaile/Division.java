public class Division extends BinaryExpression {

    /*
     * javadoc.
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /*
     * Javadoc.
     */
    public String toString() {
        return ("(" + left + " / " + right + ")");
    }

    /**
     * An especialy Javadoc.
     */
    public double evaluate() throws ArithmeticException {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return left.evaluate() / right.evaluate();
    }
}
