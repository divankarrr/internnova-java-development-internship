/*
Task 5: Polymorphism — Method Overloading & Overriding (20 Marks)

Create a Java program demonstrating both types of polymorphism.

Part A: Method Overloading

Create a class with multiple methods having the same name but different parameters.

For example:

- "calculate(int, int)"
- "calculate(double, double)"
- "calculate(int, int, int)"

Part B: Method Overriding

Create a parent class "Vehicle" with a method such as "start()".

Create child classes such as:

- "Car"
- "Bike"

Override the "start()" method in both child classes.

Display the different outputs when the methods are called.

*/

class Calculator {

    // Method with two int parameters
    int calculate(int a, int b) {
        return a + b;
    }

    // Method with two double parameters
    double calculate(double a, double b) {
        return a + b;
    }

    // Method with three int parameters
    int calculate(int a, int b, int c) {
        return a + b + c;
    }
}

class Vehicle {

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}


public class week3_task05 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: "+ calc.calculate(10, 20));

        System.out.println("Sum of two doubles: "+ calc.calculate(10.5, 20.5));

        System.out.println("Sum of three integers: "+ calc.calculate(10, 20, 30));

        Vehicle vehicle;

        vehicle = new Car();
        vehicle.start();

        vehicle = new Bike();
        vehicle.start();
    }
}

/*
Sum of two integers: 30
Sum of two doubles: 31.0
Sum of three integers: 60
Car starts with a key.
Bike starts with a self-start button.
*/