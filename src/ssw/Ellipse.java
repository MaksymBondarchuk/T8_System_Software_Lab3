package ssw;

/**
 * Represents ellipse
 */
public class Ellipse extends Ellipse_Abstract implements Geometry {
    /**
     * X radius
     */
    private int a;
    /**
     * Y radius
     */
    private int b;

    public Ellipse() {
        a = 1;
        b = 1;
    }

    /**
     * Setter for A
     *
     * @param a Value to set
     */
    public void setA(int a) {
        if (a == 0)
            throw new ArithmeticException("Ellipse X-radius (A) cannot be 0");
        else
            this.a = a;
    }

    /**
     * Getter for A
     *
     * @return A
     */
    public int getA() {
        return a;
    }

    /**
     * Setter for A
     *
     * @param b Value to set
     */
    public void setB(int b) {
        if (b == 0)
            throw new ArithmeticException("Ellipse Y-radius (B) cannot be 0");
        else
            this.b = b;
    }

    /**
     * Getter for B
     *
     * @return B
     */
    public int getB() {
        return b;
    }

    /**
     * Calculates X coordinate from Y coordinate
     *
     * @param y Y coordinate
     * @return X coordinate
     */
    public double getXFromY(int y) {
        return a * Math.sqrt(1 - y * y / b / b);
    }

    /**
     * Calculates Y coordinate from X coordinate
     *
     * @param x X coordinate
     * @return Y coordinate
     */
    public double getYFromX(int x) {
        return a * Math.sqrt(1 - x * x / a / a);
    }

    public double Area() {
        return Math.PI * a * b;
    }

    public double Perimeter() {
        return 2 * Math.PI * Math.sqrt(.5 * (a * a + b * b));
    }
}
