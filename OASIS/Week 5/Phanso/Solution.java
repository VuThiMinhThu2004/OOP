public class Solution {

    /**
     * An especially short bit of Javadoc.
     */
    private int numerator;
    private int denominator = 1;

    /**
     * An especially short bit of Javadoc.
     */
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * An especially short bit of Javadoc.
     */
    Solution() {
        this.numerator = 1;
        this.denominator = 1;
    }

    /**
     * An especially short bit of Javadoc.
     */
    Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * An especially short bit of Javadoc.
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * An especially short bit of Javadoc.
     */
    public Solution reduce() {
        int tmp = gcd(numerator, denominator);
        this.numerator /= tmp;
        this.denominator /= tmp;
        return this;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public Solution add(Solution x) {
        if (x.denominator != 0) {
            this.numerator = this.numerator * x.denominator + x.numerator * this.denominator;
            this.denominator *= x.denominator;
        }
        return this.reduce();
    }

    /**
     * An especially short bit of Javadoc.
     */
    public Solution subtract(Solution x) {
        if (x.denominator != 0) {
            this.numerator = this.numerator * x.denominator - x.numerator * this.denominator;
            this.denominator *= x.denominator;
        }
        return this.reduce();
    }

    /**
     * An especially short bit of Javadoc.
     */
    public Solution multiply(Solution x) {
        if (x.denominator != 0) {
            this.numerator *= x.numerator;
            this.denominator *= x.denominator;
        }
        return this.reduce();
    }

    /**
     * An especially short bit of Javadoc.
     */
    public Solution divide(Solution x) {
        if (x.numerator != 0) {
            this.numerator = this.numerator * x.denominator;
            this.denominator = this.denominator * x.numerator;
        }
        return this.reduce();
    }

    /**
     * An especially short bit of Javadoc.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution orther = (Solution) obj;
            orther = orther.reduce();
            Solution tmp = this.reduce();
            if (tmp.numerator == orther.numerator && tmp.denominator == orther.denominator) {
                return true;
            }
            return false;
        }
        return false;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Solution x = new Solution(1,2);
        System.out.print(x.getNumerator() + "/" + x.getDenominator());
    }
}
