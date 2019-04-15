/**
 * A model for an equilateral triangle shape
 * A model of an equilateral triangle
 * @author Jesse Dahl
 */
import java.lang.Math.*;

 public class EquilateralTriangle extends Triangle {

    //Fields - none

    //Constructors
    /**
     * Constructs a new equilateral triangle instance
     * @param side
     */
    public EquilateralTriangle(double side) {
        super.base = side;
        super.height = side;
    }

    // Methods
    /**
     * Method that calculates and returns the perimeter of an equilateral triangle
     * @return perimeter of an equilateral triangle
     */
    @Override
    public double getPerimeter() {
        return(3*base);
    }
 }