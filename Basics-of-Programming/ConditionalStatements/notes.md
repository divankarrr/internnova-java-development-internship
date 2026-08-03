# 📝 Notes – Conditional Statements in Java

## 📌 Module Overview

Conditional statements are used to make decisions in a Java program. They execute different blocks of code depending on whether a condition is **true** or **false**.

---

# 1. if Statement

The `if` statement executes a block of code only when the given condition is true.

### Syntax

```java
if (condition) {
    // code
}
```

### Example

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to Vote");
}
```

---

# 2. if-else Statement

The `if-else` statement executes one block when the condition is true and another block when it is false.

### Syntax

```java
if (condition) {
    // True block
}
else {
    // False block
}
```

### Example

```java
int number = 10;

if (number % 2 == 0) {
    System.out.println("Even");
}
else {
    System.out.println("Odd");
}
```

---

# Example: Largest of Two Numbers

```java
if (a > b) {
    System.out.println(a);
}
else {
    System.out.println(b);
}
```

---

# 3. else-if Ladder

Used when multiple conditions need to be checked.

### Syntax

```java
if (condition1) {

}
else if (condition2) {

}
else if (condition3) {

}
else {

}
```

### Example

```java
int marks = 82;

if (marks >= 90) {
    System.out.println("Grade A");
}
else if (marks >= 75) {
    System.out.println("Grade B");
}
else if (marks >= 50) {
    System.out.println("Grade C");
}
else {
    System.out.println("Fail");
}
```

---

# Example: Income Tax Calculator

```text
Income < 5,00,000       → Tax = 0%

Income 5L–10L           → Tax = 20%

Income > 10L            → Tax = 30%
```

---

# Example: Largest of Three Numbers

```java
if (a > b && a > c) {
    System.out.println(a);
}
else if (b > c) {
    System.out.println(b);
}
else {
    System.out.println(c);
}
```

---

# 4. Ternary Operator

The ternary operator is a shorthand form of the `if-else` statement.

### Syntax

```java
result = (condition) ? value1 : value2;
```

### Example

```java
int age = 20;

String result = (age >= 18) ? "Adult" : "Minor";

System.out.println(result);
```

---

# Example: Odd or Even

```java
String ans = (number % 2 == 0) ? "Even" : "Odd";
```

---

# 5. Pass or Fail

```java
int marks = 45;

String result = (marks >= 33) ? "Pass" : "Fail";

System.out.println(result);
```

---

# 6. Switch Statement

The `switch` statement is used when there are multiple possible values for a variable.

### Syntax

```java
switch(expression) {

    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code

}
```

---

### Example

```java
int day = 3;

switch(day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid Day");

}
```

---

# 7. Calculator using Switch

```java
switch(operator) {

    case '+':
        System.out.println(a + b);
        break;

    case '-':
        System.out.println(a - b);
        break;

    case '*':
        System.out.println(a * b);
        break;

    case '/':
        System.out.println(a / b);
        break;

    default:
        System.out.println("Invalid Operator");

}
```

---

# Difference Between if-else and switch

| if-else | switch |
|----------|---------|
| Used for conditions | Used for fixed values |
| Supports relational operators | Checks equality only |
| Suitable for complex logic | Suitable for menu-driven programs |
| Slower for many conditions | Faster for multiple constant cases |

---

# Common Mistakes

### Using `=` instead of `==`

❌ Incorrect

```java
if(a = 5)
```

✅ Correct

```java
if(a == 5)
```

---

### Missing `break` in switch

Without `break`, execution continues to the next case (fall-through).

---

### Incorrect Condition

```java
if(number % 2 = 0)
```

Correct

```java
if(number % 2 == 0)
```

---

# Key Takeaways

- `if` executes code only when a condition is true.
- `if-else` provides two execution paths.
- `else-if` handles multiple conditions.
- Ternary operator is a compact alternative to `if-else`.
- `switch` simplifies multiple-choice decisions.
- `break` prevents fall-through in switch statements.

---

# ✅ Topics Covered

- if Statement
- if-else Statement
- Largest of Two Numbers
- Odd or Even
- else-if Ladder
- Income Tax Calculator
- Largest of Three Numbers
- Ternary Operator
- Pass or Fail
- Switch Statement
- Calculator Program

---

**📅 Internship:** Java Development Internship – Internnova

**📖 Module:** Conditional Statements

**✅ Status:** Completed
