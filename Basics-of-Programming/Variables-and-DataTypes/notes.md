# 📝 Notes – Java Basics

## 📌 Module Overview

This module introduces the basics of Java programming, including program structure, variables, data types, input/output, type conversion, and how Java code executes.

---

# 1. Creating a Java File

A Java program is stored in a file having the extension:

```
.java
```

Example

```java
HelloWorld.java
```

Rules

- File name must match the public class name.
- Java is case-sensitive.

---

# 2. Boilerplate Code

Every Java program starts with a basic structure.

```java
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }

}
```

### Components

- Class
- main() method
- Statements
- Curly braces

---

# 3. Output in Java

### print()

```java
System.out.print("Hello");
System.out.print("World");
```

Output

```
HelloWorld
```

---

### println()

```java
System.out.println("Hello");
System.out.println("World");
```

Output

```
Hello
World
```

---

### printf()

```java
System.out.printf("Age = %d",20);
```

---

# 4. Pattern Printing

Example

```text
*
**
***
****
*****
```

Program

```java
System.out.println("*");
System.out.println("**");
System.out.println("***");
System.out.println("****");
```

---

# 5. Variables

A variable is a named memory location used to store data.

Syntax

```java
datatype variableName = value;
```

Example

```java
int age = 20;
```

Rules

- Cannot start with a number
- No spaces
- Case-sensitive
- Meaningful names

---

# 6. Data Types

## Integer Types

| Data Type | Size |
|------------|------|
| byte | 1 Byte |
| short | 2 Bytes |
| int | 4 Bytes |
| long | 8 Bytes |

---

## Decimal Types

| Data Type | Size |
|------------|------|
| float | 4 Bytes |
| double | 8 Bytes |

---

## Character

```java
char grade = 'A';
```

---

## Boolean

```java
boolean isJavaFun = true;
```

---

# 7. Comments

### Single-line Comment

```java
// This is a comment
```

### Multi-line Comment

```java
/*
This
is
a
comment
*/
```

---

# 8. Input in Java

Scanner class is used to read input.

Import

```java
import java.util.Scanner;
```

Create Object

```java
Scanner sc = new Scanner(System.in);
```

Read Integer

```java
int age = sc.nextInt();
```

Read Float

```java
float salary = sc.nextFloat();
```

Read String

```java
String name = sc.next();
```

---

# 9. Sum of Two Numbers

Formula

```
Sum = A + B
```

Example

```java
int sum = a + b;
```

---

# 10. Sum Using User Input

```java
Scanner sc = new Scanner(System.in);

int a = sc.nextInt();

int b = sc.nextInt();

System.out.println(a+b);
```

---

# 11. Product of Two Numbers

Formula

```
Product = A × B
```

Example

```java
int product = a * b;
```

---

# 12. Area of Circle

Formula

```
Area = πr²
```

Program

```java
float area = 3.14f * radius * radius;
```

---

# 13. Type Conversion

Automatic conversion from a smaller data type to a larger one.

Example

```java
int a = 10;

float b = a;
```

```
int → float
```

No data loss occurs.

---

# 14. Type Casting

Explicit conversion performed by the programmer.

Example

```java
float x = 25.89f;

int y = (int)x;
```

Output

```
25
```

Decimal part is removed.

---

# 15. Type Promotion

Smaller data types are automatically promoted during expressions.

Example

```java
char a = 'A';

char b = 'B';

System.out.println(b-a);
```

Output

```
1
```

Another Example

```java
byte a = 5;
byte b = 10;

int c = a + b;
```

Result is stored as **int**.

---

# 16. How Java Code Runs

```
Write Code (.java)
        │
        ▼
     javac
        │
        ▼
Bytecode (.class)
        │
        ▼
       JVM
        │
        ▼
Operating System
        │
        ▼
     Program Output
```

---

# Important Terms

### JDK

Java Development Kit

Contains

- Compiler
- JRE
- Development Tools

---

### JRE

Java Runtime Environment

Provides libraries required to run Java programs.

---

### JVM

Java Virtual Machine

Responsible for executing Java bytecode.

---

# Key Takeaways

- Java programs are written in `.java` files.
- Every Java program starts from the `main()` method.
- Variables store data in memory.
- Java provides eight primitive data types.
- Scanner is used for user input.
- Type conversion is automatic.
- Type casting is explicit.
- JVM makes Java platform independent.
- Java follows the principle: **Write Once, Run Anywhere (WORA).**

---

## ✅ Topics Covered

- Creating Java File
- Boilerplate Code
- Output in Java
- Pattern Printing
- Variables
- Data Types
- Comments
- Input in Java
- Sum of Two Numbers
- Product of Two Numbers
- Area of Circle
- Type Conversion
- Type Casting
- Type Promotion
- Java Execution Process

---

**📅 Internship:** Java Development Internship – Internnova  
**📖 Module:** Java Basics  
**✅ Status:** Completed
