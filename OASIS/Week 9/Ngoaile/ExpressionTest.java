public class ExpressionTest {
    /**
     * Javadoc.
     */
    public static void main(String[] args) {
        // Calculate (10^2 - 3 + 4*3)^2
        Expression x = new Numeral(10);
        Expression y = new Numeral(3);
        Expression z = new Numeral(4);
        Expression t = new Numeral(3);


        
        Expression sq = new Square(x);
        Expression tmp = new Subtraction(sq, y);
        Expression mul = new Multiplication(z, t);
        Expression temp = new Addition(tmp, mul);
        Expression res = new Square(temp);

        System.out.println(res);


        //Test Exception

    }
}
