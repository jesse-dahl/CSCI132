/**
 * A model for a triangle object
 * @author Jesse Dahl
 */

abstract class Triangle implements Shape {

    // Fields
    protected double base;
    protected double height;

    // Constructors
    /**
     * Constructs a new triangle instance with a
     * default of 0 for both base and height
     */
    public Triangle() {}

    /**
     * Constructs a new triangle instance
     * @param b
     * @param h
     */
    public Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    // Methods
    /**
     * Method that returns the number of sides of a triangle
     * Constant (three sides)
     * @return number of sides in a triangle
     */
    @Override
    public String printNumSides() {
        return("Three sides");
    }

    /**
     * Method that calculates the area of a triangle
     * @return area of a triangle
     */
    @Override
    public double getArea() {
        return((base * height)/2);
    }
 }