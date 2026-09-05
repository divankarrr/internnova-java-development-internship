/*
Task 3: Abstract Classes — Shape Calculator (20 Marks)

Create an abstract class named Shape.

It should contain:

An abstract method calculateArea()
A normal method to display a message

Create at least two child classes:

Circle
Rectangle

Implement calculateArea() differently in both classes.

Create objects and display the calculated areas.

Requirements
Use the abstract keyword.
Create an abstract method.
Create a normal method inside the abstract class.
Extend the abstract class using extends.

*/
// 1. Defining the Abstract Class
abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract method (No body, must be implemented by subclasses)
    public abstract double calculateArea();

    // Normal instance method
    public void displayShapeMessage() {
        System.out.println("Calculating details for geometry type: " + shapeName);
    }
}

// 2. Concrete subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// 3. Concrete subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// 4. Main Driver Class
public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("--- Shape Calculator Simulation --- \n");

        Shape myCircle = new Circle(5.0);
        myCircle.displayShapeMessage();
        System.out.printf("Area of Circle: %.2f\n\n", myCircle.calculateArea());

        Shape myRectangle = new Rectangle(4.0, 7.0);
        myRectangle.displayShapeMessage();
        System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
    }
}
/*
An Abstract Class is a class declared with the abstract keyword that cannot be instantiated directly. 
Unlike interfaces, abstract classes can maintain a mix of both abstract methods (without bodies) and 
concrete/normal methods (with operational bodies), along with instance variables. 
It is meant to be subclassed using the extends keyword, providing a shared foundational base identity to closely related derived classes.
*/