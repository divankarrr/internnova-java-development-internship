# 📅 Day 14 – Object-Oriented Programming (OOP) in Java

## 📌 Overview

On Day 14 of my **Java Development Internship at Internnova**, I learned the fundamentals of **Object-Oriented Programming (OOP)** in Java.

The module focused on **Classes, Objects, Constructors, Getters and Setters, Static Members, Method Overloading, Abstraction, Encapsulation, Inheritance, Polymorphism, Abstract Classes, and Interfaces**.

OOP is one of the most important concepts in Java because Java applications are primarily designed using classes and objects.

---

## 🎯 Learning Objectives

- Understand the concept of Object-Oriented Programming.
- Learn the difference between classes and objects.
- Create and use objects in Java.
- Understand getters and setters.
- Learn constructors and their types.
- Understand Java's default constructor behavior.
- Understand why Java does not have a traditional destructor.
- Work with static variables and methods.
- Understand method/function overloading.
- Learn the four major pillars of OOP.
- Understand Encapsulation.
- Understand Inheritance.
- Understand Polymorphism.
- Understand Abstraction.
- Create and use abstract classes.
- Create and implement interfaces.

---

# 📚 Topics Covered

## 🔹 1. Objects & Classes

A **class** is a blueprint or template used to create objects.

An **object** is an instance of a class.

Example:

```java
class Student {
    String name;
    int age;
}
```

Creating an object:

```java
Student s1 = new Student();
```

Here:

```text
Student → Class
s1      → Reference variable
new Student() → Object
```

---

# 🔹 2. Creating Objects

Objects are created using the `new` keyword.

Example:

```java
class Car {
    String color;
    int speed;
}

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.color = "Black";
        car1.speed = 120;

        System.out.println(car1.color);
        System.out.println(car1.speed);
    }
}
```

Multiple objects can be created from the same class:

```java
Car car1 = new Car();
Car car2 = new Car();
```

Each object can have its own state.

---

# 🔹 3. Getters and Setters

Getters and setters are commonly used to access and modify private fields.

Example:

```java
class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

Using the methods:

```java
Student s = new Student();

s.setName("Divankar");

System.out.println(s.getName());
```

### Benefits

- Data protection
- Controlled access
- Encapsulation
- Validation before modifying data

---

# 🔹 4. Constructors

A constructor is a special member of a class that is used to initialize objects.

Important properties:

- Same name as the class.
- Does not have a return type.
- Automatically called when an object is created.

Example:

```java
class Student {

    String name;

    Student() {
        name = "Unknown";
    }
}
```

Creating the object:

```java
Student s = new Student();
```

The constructor is automatically called.

---

# 🔹 5. Types of Constructors

### Default Constructor

If no constructor is explicitly written, Java provides a default constructor for the class.

```java
class Student {
    String name;
}
```

Java provides a no-argument constructor in this case.

---

### No-Argument Constructor

A constructor explicitly written without parameters:

```java
class Student {

    Student() {
        System.out.println("Constructor called");
    }
}
```

---

### Parameterized Constructor

A constructor that accepts parameters.

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

Usage:

```java
Student s = new Student("Divankar", 20);
```

---

# 🔹 6. `this` Keyword

The `this` keyword refers to the current object.

Example:

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}
```

Here:

```text
this.name → instance variable
name      → constructor parameter
```

---

# 🔹 7. Constructor Overloading

A class can have multiple constructors with different parameter lists.

Example:

```java
class Student {

    Student() {
        System.out.println("No arguments");
    }

    Student(String name) {
        System.out.println(name);
    }

    Student(String name, int age) {
        System.out.println(name + " " + age);
    }
}
```

This is an example of **constructor overloading**.

---

# 🔹 8. Inbuilt Constructor and Destructor

### Constructor

Java automatically provides a default constructor **only when no constructor is explicitly declared**.

Java does not have a traditional C/C++-style destructor.

Memory management is handled by the **Garbage Collector**.

Example:

```java
class Demo {
    // No constructor explicitly declared
}
```

The compiler provides a default no-argument constructor.

### Garbage Collection

When an object is no longer reachable, it can eventually be reclaimed by Java's Garbage Collector.

```java
Demo obj = new Demo();

obj = null;
```

The object may become eligible for garbage collection.

> Java does not provide a deterministic destructor method like C++.

---

# 🔹 9. Example Classes

OOP concepts can be applied to real-world entities.

### Student Class

```java
class Student {

    String name;
    int rollNo;
    double marks;

    void display() {
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(marks);
    }
}
```

### Bank Account

```java
class BankAccount {

    private double balance;

    void deposit(double amount) {
        balance += amount;
    }

    double getBalance() {
        return balance;
    }
}
```

---

# 🔹 10. Static Members

The `static` keyword belongs to the **class rather than individual objects**.

### Static Variable

```java
class Student {

    static String college = "KIET";
    String name;
}
```

All objects share the same static variable.

---

### Static Method

```java
class MathUtil {

    static int square(int n) {
        return n * n;
    }
}
```

Calling it:

```java
System.out.println(MathUtil.square(5));
```

Output:

```text
25
```

Static methods can be called without creating an object.

---

# 🔹 11. Function / Method Overloading

Java supports **method overloading**, where multiple methods have the same name but different parameter lists.

Example:

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

This is called **compile-time polymorphism**.

### Important

Methods cannot be overloaded only by changing the return type.

Invalid example:

```java
int add(int a, int b)
double add(int a, int b)
```

---

# 🛡️ 12. Encapsulation

**Encapsulation** means bundling data and methods together while controlling access to the data.

Example:

```java
class Account {

    private double balance;

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

The `balance` field cannot be accessed directly from outside the class.

### Benefits

- Data protection
- Controlled access
- Better maintainability
- Validation

---

# 🎭 13. Abstraction

**Abstraction** means hiding implementation details and exposing only the essential functionality.

Example:

```java
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal eats");
    }
}
```

The user knows that an animal can make a sound, but the specific implementation is provided by subclasses.

---

# 🧬 14. Inheritance

**Inheritance** allows one class to acquire properties and methods of another class.

Example:

```java
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}
```

Usage:

```java
Dog d = new Dog();

d.eat();
d.bark();
```

Here:

```text
Animal
   ↑
   |
  Dog
```

### Types commonly discussed in Java

- Single Inheritance
- Multilevel Inheritance
- Hierarchical Inheritance

Java does not support multiple inheritance of classes, but multiple interfaces can be implemented.

---

# 🔄 15. Polymorphism

Polymorphism means **one interface or reference can represent different forms of behavior**.

There are two major forms:

### Compile-Time Polymorphism

Achieved through:

```text
Method Overloading
```

Example:

```java
add(int, int)
add(int, int, int)
```

---

### Runtime Polymorphism

Achieved through:

```text
Method Overriding
```

Example:

```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

Usage:

```java
Animal a = new Dog();

a.sound();
```

Output:

```text
Bark
```

The method that executes is determined at runtime.

---

# 🧱 16. Abstract Classes

An abstract class is declared using the `abstract` keyword.

Example:

```java
abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}
```

A subclass provides the implementation:

```java
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car started");
    }
}
```

Important points:

- Abstract classes cannot be instantiated directly.
- They can contain abstract methods.
- They can also contain concrete methods.
- They can have constructors and instance variables.

---

# 🔌 17. Interfaces

An interface defines a contract that implementing classes agree to follow.

Example:

```java
interface Animal {

    void sound();
}
```

Implementation:

```java
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Bark");
    }
}
```

Usage:

```java
Animal a = new Dog();

a.sound();
```

### Benefits of Interfaces

- Abstraction
- Loose coupling
- Multiple interface implementation
- Common contract between classes

Example:

```java
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class Demo implements A, B {

    public void methodA() {
        System.out.println("A");
    }

    public void methodB() {
        System.out.println("B");
    }
}
```

---

# 🏛️ Four Pillars of OOP

Java's major OOP principles are:

```text
             OOP
              |
    ┌─────────┼─────────┐
    ↓         ↓         ↓
Encapsulation Inheritance Polymorphism
              |
          Abstraction
```

| Principle | Meaning |
|---|---|
| Encapsulation | Bundling data and controlling access |
| Inheritance | Reusing properties and behavior |
| Polymorphism | Same interface, different behavior |
| Abstraction | Hiding implementation details |

---

# 📊 Abstract Class vs Interface

| Feature | Abstract Class | Interface |
|---|---|---|
| Keyword | `abstract class` | `interface` |
| Object creation | Cannot instantiate directly | Cannot instantiate directly |
| Methods | Abstract + concrete methods | Abstract methods plus supported interface methods |
| Variables | Instance/static variables possible | Fields are implicitly `public static final` |
| Constructor | Can have constructor | No constructor |
| Inheritance | Class extends one class | Class can implement multiple interfaces |
| Multiple inheritance | Not supported for classes | Multiple interfaces can be implemented |

---

# 💻 Concepts Practiced

- Classes
- Objects
- Object Creation
- Instance Variables
- Methods
- Getters
- Setters
- Constructors
- Default Constructor
- Parameterized Constructor
- Constructor Overloading
- `this` Keyword
- Static Variables
- Static Methods
- Method Overloading
- Encapsulation
- Abstraction
- Inheritance
- Method Overriding
- Polymorphism
- Abstract Classes
- Interfaces

---

# 🛠 Technologies Used

- Java
- JDK
- Visual Studio Code
- Terminal

---

# 📖 Key Learnings

- Classes act as blueprints for objects.
- Objects represent instances of classes.
- Constructors initialize objects.
- Getters and setters provide controlled access to data.
- `static` members belong to the class rather than individual objects.
- Method overloading provides compile-time polymorphism.
- Inheritance promotes code reuse.
- Method overriding enables runtime polymorphism.
- Encapsulation protects internal object state.
- Abstraction hides unnecessary implementation details.
- Abstract classes can contain both abstract and concrete methods.
- Interfaces define contracts that classes can implement.
- Java uses Garbage Collection for automatic memory management rather than traditional destructors.

---

# 🚀 Skills Developed

- Object-Oriented Programming
- Java Classes & Objects
- Constructors
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Interfaces
- Method Overloading
- Method Overriding
- Code Reusability
- Object-Oriented Design

---

# 📈 Learning Outcome

By completing Day 14, I developed a strong foundation in **Object-Oriented Programming with Java**.

I learned how to design classes, create objects, initialize object state using constructors, protect data through encapsulation, reuse code through inheritance, and implement flexible behavior using polymorphism.

I also practiced **abstract classes and interfaces**, which are essential for building scalable and maintainable Java applications.

The learning progression was:

```text
Classes & Objects
       ↓
Constructors
       ↓
Getters & Setters
       ↓
Static Members
       ↓
Method Overloading
       ↓
Encapsulation
       ↓
Inheritance
       ↓
Polymorphism
       ↓
Abstraction
       ↓
Abstract Classes & Interfaces
```

---

**👨‍💻 Author:** Divankar Singh  
**🏢 Internship:** Java Development Internship – Internnova  
**📚 Day:** 14  
**📖 Module:** Object-Oriented Programming  
**✅ Status:** Completed
