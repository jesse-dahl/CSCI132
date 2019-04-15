/**
 * A demo program that uses the different dhape clases to print information about different shapes
 * @author Jesse Dahl
 */

 public class ShapeDemo {

    /**
     * main method that calls the other methods below
     */
    public static void main(String[] args) {
        circleDemo();
        shapeCircleDemo();
        equilateralTriangleDemo();
        rightTriangleDemo();
        squareDemo();
    }

    /**
     * A circle method that instantiaties a new Circle object of type Circle
     * Prints the area, circumference, number of sides, and diameter of a circle with radius 2
     */
    public static void circleDemo() {
        Circle newCircle = new Circle(2);
        System.out.println("I made a Circle of type Circle with radius of 2");
        System.out.println("The area is " + newCircle.getArea());
        System.out.println("The circumference is " + newCircle.getPerimeter());
        System.out.println(newCircle.printNumSides());
        System.out.println("The diameter is " + newCircle.getDiameter() + "\n");
    }

    /**
     * Another circle demo method that instantiates a new Circle object of type Shape
     * Prints the area, circumference, number of sides, and diameter of a circle with radius 3
     */
    public static void shapeCircleDemo() {
        Shape shapeCircle = new Circle(3);
        System.out.println("I made a Shape of type Circle with a radius of 3");
        System.out.println("The area is " + shapeCircle.getArea());
        System.out.println("The circumference is " + shapeCircle.getPerimeter());
        System.out.println(shapeCircle.printNumSides());
        System.out.println("Well, I can't get the diameter of a 'Shape.' (I tried.) But since I know the object being referenced is a Circle, I can cast it to a Circle, and then I can get the diameter of it...");
        System.out.println("...And the diameter is " + ((Circle)shapeCircle).getDiameter() + "\n");
    }

    /**
     * An equilateral triangle demo method that instantiates a new Equilateral Triangle object of type Shape
     * Prints the area and perimeter of an equilateral triangle with side lengths of 4
     */
    public static void equilateralTriangleDemo() {
        Shape equilTriangle = new EquilateralTriangle(4);
        System.out.println("I made another Shape of type EquilateralTriangle; side length of 4");
        System.out.println("The area is " + equilTriangle.getArea());
        System.out.println("The perimeter is " + equilTriangle.getPerimeter() + "\n");
    }

    /**
     * A right triangle demo method that instantiates a new Right Triangle object of type Right Triangle
     * Prints the area, number of sides, and hypotenuse of a right triangle with side lengths of 3 and 4
     */
    public static void rightTriangleDemo() {
        RightTriangle rightTriangle = new RightTriangle(3,4);
        System.out.println("I made a RightTriangle of type RightTriangle; side length's 3, 4");
        System.out.println("The area is " + rightTriangle.getArea());
        System.out.println(rightTriangle.printNumSides());
        System.out.println("The hypotenuse is " + rightTriangle.getHypotenuse() + "\n");
    }

    /**
     * A square demo method that instantiates a new Square object of type Shape
     * Prints the area, perimeter, and number of sides of a given square with side length of 5
     */
    public static void squareDemo() {
        Shape square = new Square(5);
        System.out.println("I made a Shape of type Square. Side length 5");
        System.out.println("The area is " + square.getArea());
        System.out.println("The perimeter is " + square.getPerimeter());
        System.out.println(square.printNumSides());
    }

 }