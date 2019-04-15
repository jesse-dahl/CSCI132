/**
 * A model for a right triangle shape
 * @author Jesse Dahl
 */
import java.lang.Math.*;

 public class RightTriangle extends Triangle {

    //Fields
    protected double sideA;
    protected double sideB;
    protected double sideC;

    // Constructors
    /**
     * Constructs a new right triangle instance
     * @param a
     * @param b
     */
    public RightTriangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }

    //Methods
    /**
     * Method that calulates the hypotenuse of a triangle
     * @return hypotenuse of a right triangle
     */
    public double getHypotenuse() {
        sideC = (Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return(Math.sqrt(sideC));
    }

    /**
     * Method that calculates the area of a right triangle
     * @return area of a right triangle
     */
    @Override
    public double getArea() {
        return((sideA * sideB)/2);
    }

    /**
     * Method that calculates the perimeter of a right triangle
     * Uses Math library to find the squareroot of side C, then adds that to side's A and B
     * @return perimter of a right triangle
     */
    public double getPerimeter() {
        return(sideA + sideB + Math.sqrt(sideC));
    }
 }