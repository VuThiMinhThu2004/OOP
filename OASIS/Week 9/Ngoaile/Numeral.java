public class Numeral extends Expression {
    private double value;

    public Numeral() {
    }

    /*
     * Javadoc.
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * Javadoc.
     */
    public String toString() {
        String str = Double.toString(value);
        if (str.length() >= 3 && str.charAt(str.length() - 2) == '.'
                && str.charAt(str.length() - 1) == '0') {
            str = str.substring(0, str.length() - 2);
        }
        return str;
    }

    @Override
    public double evaluate() {
        return value;
    }

}
