/**
 * A model for a circle shape
 * @author Jesse Dahl
 */

 import java.lang.Math.*;

 public class Circle implements Shape {

    // Fields
    protected double radius;

    // Constructors
    /**
     * Constructs a new circle circle instance
     * @param r
     */
    public Circle(double r) {
        this.radius = r;
    }

    // Methods
    /** 
     * Method that calculates the area of a circle
     * Uses the Math library to multiply pi * the radius squared
     * @return area of a circle
     */
    @Override
    public double getArea() {
        return(Math.PI*(Math.pow(radius, 2)));
    }

    /**
     * Method that calculates the circumference of a circle
     * Uses the math library to multiply the radius * 2pi
     * @return circumference of a circle
     */
    @Override
    public double getPerimeter() {
        return(radius*2*(Math.PI));
    }

    /** 
     * Method that returns the number of sides of a circle 
     * Constant infinity
     */
    @Override
    public String printNumSides() {
        return("Infinite sides");
    }

    /** 
     * Method that calculates the diameter of a circle
     * @return diameter of a circle
     */
    public double getDiameter() {
        return(radius*2);
    }
 }