package ssw;

/**
 * Represents ellipse
 */
public abstract class Ellipse_Abstract {
    /**
     * Setter for A
     *
     * @param a Value to set
     */
    public abstract void setA(int a);

    /**
     * Getter for A
     *
     * @return A
     */
    public abstract int getA();

    /**
     * Setter for A
     *
     * @param b Value to set
     */
    public abstract void setB(int b);

    /**
     * Getter for B
     *
     * @return B
     */
    public abstract int getB();

    /**
     * Calculates X coordinate from Y coordinate
     *
     * @param y Y coordinate
     * @return X coordinate
     */
    public abstract double getXFromY(int y);

    /**
     * Calculates Y coordinate from X coordinate
     *
     * @param x X coordinate
     * @return Y coordinate
     */
    public abstract double getYFromX(int x);
}
