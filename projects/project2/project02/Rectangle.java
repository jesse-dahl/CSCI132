/**
 * A model of a rectangle shape
 * @author Jesse Dahl
 */

 public class Rectangle implements Shape {

    // Fields
    protected double width;
    protected double height;

    // Constructors
    /**
     * Constructs a new rectangle instance with a
     * default of 0 for both height and width
     */
    public Rectangle() {}

    /**
     * Constructs a new rectangle instance
     * @param w the width of the rectangle
     * @param h the height of the rectangle
     */
    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    // Methods
    /** 
     * Method that calculates the area by multiplying the width and height
     * @return Area
     */
    @Override
    public double getArea() {
        return(width * height);
    }

    /** 
     * Method that calculates the perimeter by
     * multiplying the width and height by 2 then adding them
     * @return perimeter of a rectangle
     */
    @Override
    public double getPerimeter() {
        return(2*width) + (2*height);
    }

    /** 
     * Method that returns the number of sides of a rectangle (which is a constant) 
     * @return number of sides
     */
    @Override
    public String printNumSides() {
        return("Four sides");
    }
 }