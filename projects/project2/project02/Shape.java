
/**
 * An interface for a geometric shape
 * @author Jesse Dahl
 */

 public interface Shape {

    /**
     * The area of the shape
     * @return area of the shape
     */
    public double getArea();

    /**
     * The distance around the outside of the shape
     * @return perimeter of the shape
     */
    public double getPerimeter();

    /**
     * The number of sides that form the shape
     * @return number of sides
     */

     public String printNumSides();
 }