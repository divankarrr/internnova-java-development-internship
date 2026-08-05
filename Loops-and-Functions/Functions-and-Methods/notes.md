# 📝 Notes – Functions, Methods, Scope & Method Overloading

## 📌 Introduction

A **method** is a block of code designed to perform a specific task. Methods help divide a large program into smaller, reusable, and manageable components.

Instead of writing the same code multiple times, we can create a method and call it whenever required.

---

# 1. Method Syntax

A basic Java method looks like:

```java
returnType methodName(parameters) {

    // method body

}
```

### Example

```java
static void greet() {
    System.out.println("Hello Java");
}
```

---

# 2. Method Calling

A method is executed when it is called.

```java
public class Main {

    static void greet() {
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {

        greet();

    }
}
```

### Output

```text
Hello Java
```

---

# 3. Methods with Parameters

Parameters allow a method to receive data.

```java
static void sum(int a, int b) {

    System.out.println(a + b);

}
```

Calling the method:

```java
sum(10, 20);
```

Output:

```text
30
```

---

# 4. Parameters vs Arguments

### Parameter

A variable declared in the method definition.

```java
static void sum(int a, int b)
```

Here:

```text
a and b → Parameters
```

### Argument

The actual values passed when calling the method.

```java
sum(10, 20);
```

Here:

```text
10 and 20 → Arguments
```

---

# 5. Method Scope

**Method scope** refers to the region within a method where a local variable can be accessed.

Example:

```java
static void calculate() {

    int x = 10;

    System.out.println(x);
}
```

The variable `x` can only be accessed inside the `calculate()` method.

❌ This is not allowed:

```java
static void calculate() {

    int x = 10;
}

public static void main(String[] args) {

    System.out.println(x); // Error

}
```

### Key Point

A local variable declared inside a method is accessible only within that method.

---

# 6. Block Scope

A **block** is a section of code enclosed within `{ }`.

Example:

```java
if(true) {

    int x = 10;

    System.out.println(x);
}
```

The variable `x` exists only inside the `if` block.

This will produce an error:

```java
if(true) {

    int x = 10;
}

System.out.println(x);
```

Because `x` is outside its scope.

---

## Block Scope Example

```java
public static void main(String[] args) {

    int a = 10;

    if(a > 5) {

        int b = 20;

        System.out.println(a);
        System.out.println(b);
    }

    System.out.println(a);

    // System.out.println(b); ❌ Error
}
```

### Explanation

`a` is declared in the method and can be accessed throughout the method.

`b` is declared inside the `if` block and can only be accessed inside that block.

---

# 7. Method Scope vs Block Scope

| Method Scope | Block Scope |
|---|---|
| Variable declared inside a method | Variable declared inside `{ }` block |
| Accessible within the method | Accessible only within that block |
| Exists during method execution | Exists within the block's scope |
| Example: local method variable | Example: variable inside `if` or `for` |

---

# 8. Call Stack

The **Call Stack** is a memory area used to manage method calls during program execution.

Whenever a method is called, Java creates a **stack frame** for that method.

### Example

```java
static void methodA() {
    methodB();
}

static void methodB() {
    System.out.println("Hello");
}

public static void main(String[] args) {
    methodA();
}
```

### Call Flow

```text
main()
   ↓
methodA()
   ↓
methodB()
   ↓
Print "Hello"
```

The stack works using:

```text
LIFO
```

### LIFO

**Last In, First Out**

The last method added to the stack finishes first.

---

# 9. Call Stack Example

Suppose:

```java
main() → methodA() → methodB()
```

The stack looks like:

```text
┌─────────────┐
│ methodB()   │ ← Top
├─────────────┤
│ methodA()   │
├─────────────┤
│ main()      │
└─────────────┘
```

When `methodB()` finishes:

```text
methodB() → removed
```

Then:

```text
methodA() → continues
```

Finally:

```text
main() → finishes
```

---

# 10. Call by Value in Java

Java uses **Call by Value**.

This means a **copy of the value** is passed to the method.

### Example

```java
static void change(int x) {

    x = 100;

}

public static void main(String[] args) {

    int a = 10;

    change(a);

    System.out.println(a);
}
```

### Output

```text
10
```

### Explanation

Initially:

```text
a = 10
```

When calling:

```java
change(a);
```

Java passes a copy:

```text
a → 10
     ↓
   copy
     ↓
    x = 10
```

Inside the method:

```java
x = 100;
```

Only the local copy changes.

Therefore:

```text
a = 10
```

---

# 11. Important Point About Call by Value

Java does **not** use traditional call-by-reference for method parameters.

For primitive variables:

```java
int
float
double
char
boolean
```

the actual value is copied.

Example:

```java
int a = 5;

change(a);
```

The method receives a copy of `5`.

---

# 12. Method Overloading

**Method Overloading** means having multiple methods with the same name but different parameter lists.

Example:

```java
static int add(int a, int b) {
    return a + b;
}

static int add(int a, int b, int c) {
    return a + b + c;
}
```

Both methods have the same name:

```text
add()
```

But their parameters are different.

---

# 13. Overloading Using Number of Parameters

```java
static int multiply(int a, int b) {

    return a * b;
}

static int multiply(int a, int b, int c) {

    return a * b * c;
}
```

Calling:

```java
multiply(2, 3);
```

uses the first method.

Calling:

```java
multiply(2, 3, 4);
```

uses the second method.

---

# 14. Overloading Using Data Types

Methods can also be overloaded using different parameter types.

```java
static int add(int a, int b) {

    return a + b;
}

static double add(double a, double b) {

    return a + b;
}
```

Calling:

```java
add(10, 20);
```

uses:

```java
add(int, int)
```

Calling:

```java
add(10.5, 20.5);
```

uses:

```java
add(double, double)
```

---

# 15. Important Rule of Method Overloading

Changing only the return type is **not enough** to overload a method.

❌ Invalid:

```java
static int add(int a, int b) {
    return a + b;
}

static double add(int a, int b) {
    return a + b;
}
```

The parameter list is identical, so Java considers these duplicate methods.

---

# 16. Method Overloading and Compile-Time Polymorphism

Method overloading is an example of:

```text
Compile-Time Polymorphism
```

The compiler determines which overloaded method should be called based on the arguments.

Example:

```java
add(10, 20);
```

The compiler selects:

```java
add(int, int)
```

---

# 17. Scope Example with Loops

Variables declared inside a loop have limited scope.

```java
for(int i = 1; i <= 5; i++) {

    int square = i * i;

    System.out.println(square);
}
```

Here:

```text
i
square
```

are accessible inside the loop.

They cannot be accessed after the loop.

---

# 18. Product of Two Numbers Using a Method

```java
static int product(int a, int b) {

    return a * b;

}

public static void main(String[] args) {

    int result = product(5, 4);

    System.out.println(result);

}
```

Output:

```text
20
```

---

# 19. Factorial Using a Method

```java
static int factorial(int n) {

    int fact = 1;

    for(int i = 1; i <= n; i++) {
        fact *= i;
    }

    return fact;
}
```

Calling:

```java
System.out.println(factorial(5));
```

Output:

```text
120
```

---

# 20. Prime Number Using a Method

```java
static boolean isPrime(int n) {

    if(n <= 1) {
        return false;
    }

    for(int i = 2; i < n; i++) {

        if(n % i == 0) {
            return false;
        }
    }

    return true;
}
```

Calling:

```java
System.out.println(isPrime(7));
```

Output:

```text
true
```

---

# 🔑 Key Takeaways

- Methods make programs modular and reusable.
- Parameters receive data from method calls.
- Arguments are actual values passed to methods.
- Local variables have limited scope.
- Block scope restricts variables to a particular `{ }` block.
- Every method call creates a stack frame in the Call Stack.
- The Call Stack follows **LIFO (Last In, First Out)**.
- Java uses **Call by Value**.
- Method overloading allows methods to have the same name with different parameter lists.
- Method overloading is an example of **compile-time polymorphism**.
- Return type alone cannot be used for method overloading.

---

## 📌 Quick Revision

```text
Method
  ↓
Reusable block of code

Parameter
  ↓
Variable in method definition

Argument
  ↓
Actual value passed to method

Call Stack
  ↓
Manages method calls

Block Scope
  ↓
Variable accessible inside its block

Call by Value
  ↓
Copy of value is passed

Method Overloading
  ↓
Same method name + different parameters
```

---

**👨‍💻 Author:** Divankar Singh  
**🏢 Internship:** Java Development Internship – Internnova  
**📚 Day:** 06  
**📖 Module:** Functions & Methods  
**✅ Status:** Completed
