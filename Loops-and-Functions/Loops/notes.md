# 📝 Notes – Java Operators

## 📌 Module Overview

Operators are special symbols used to perform operations on variables and values. Java provides several categories of operators to perform arithmetic, comparison, logical, and assignment operations.

---

# 1. Types of Operators

Java operators are classified into the following categories:

- Arithmetic Operators
- Unary Operators
- Relational Operators
- Logical Operators
- Assignment Operators

---

# 2. Arithmetic Operators

Arithmetic operators perform mathematical calculations.

| Operator | Description | Example |
|----------|-------------|---------|
| + | Addition | a + b |
| - | Subtraction | a - b |
| * | Multiplication | a * b |
| / | Division | a / b |
| % | Modulus (Remainder) | a % b |

### Example

```java
int a = 20;
int b = 6;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

---

# 3. Unary Operators

Unary operators work with only one operand.

## Increment (++)

Increases the value by 1.

### Pre-Increment

```java
++a;
```

Value increases before use.

### Post-Increment

```java
a++;
```

Value increases after use.

---

## Decrement (--)

Decreases the value by 1.

### Pre-Decrement

```java
--a;
```

### Post-Decrement

```java
a--;
```

---

### Example

```java
int a = 5;

System.out.println(++a); // 6

System.out.println(a++); // 6

System.out.println(a);   // 7
```

---

# 4. Relational Operators

Used to compare two values.

| Operator | Meaning |
|----------|---------|
| == | Equal To |
| != | Not Equal To |
| > | Greater Than |
| < | Less Than |
| >= | Greater Than or Equal To |
| <= | Less Than or Equal To |

### Example

```java
int a = 10;
int b = 20;

System.out.println(a > b);
System.out.println(a < b);
System.out.println(a == b);
```

Output

```
false
true
false
```

---

# 5. Logical Operators

Logical operators combine multiple conditions.

## Logical AND (&&)

Returns true only if both conditions are true.

```java
age >= 18 && citizen == true
```

---

## Logical OR (||)

Returns true if at least one condition is true.

```java
marks > 90 || sportsQuota
```

---

## Logical NOT (!)

Reverses the result.

```java
!true
```

Result

```
false
```

---

# 6. Assignment Operators

Used to assign or update variable values.

| Operator | Example | Equivalent |
|----------|---------|------------|
| = | a = 5 | Assign value |
| += | a += 2 | a = a + 2 |
| -= | a -= 2 | a = a - 2 |
| *= | a *= 2 | a = a * 2 |
| /= | a /= 2 | a = a / 2 |
| %= | a %= 2 | a = a % 2 |

### Example

```java
int a = 10;

a += 5;
a *= 2;

System.out.println(a);
```

---

# 7. Operator Precedence

Operator precedence determines the order in which operations are evaluated.

## Highest to Lowest

| Priority | Operators |
|----------|-----------|
| 1 | () |
| 2 | ++ -- ! |
| 3 | * / % |
| 4 | + - |
| 5 | > < >= <= |
| 6 | == != |
| 7 | && |
| 8 | || |
| 9 | = += -= *= /= %= |

---

## Example

```java
int result = 10 + 5 * 2;
```

Evaluation

```
5 × 2 = 10

10 + 10 = 20
```

Output

```
20
```

---

## Example with Parentheses

```java
int result = (10 + 5) * 2;
```

Output

```
30
```

---

# Common Mistakes

❌ Using `=` instead of `==`

```java
if(a = b)
```

✅ Correct

```java
if(a == b)
```

---

❌ Dividing integers expecting decimal output

```java
5 / 2
```

Output

```
2
```

Use

```java
5.0 / 2
```

Output

```
2.5
```

---

# Key Takeaways

- Operators perform calculations and comparisons.
- Arithmetic operators are used for mathematical operations.
- Unary operators modify a single operand.
- Relational operators compare values and return a boolean.
- Logical operators combine multiple conditions.
- Assignment operators simplify variable updates.
- Parentheses have the highest precedence and improve code readability.

---

# ✅ Topics Covered

- Types of Operators
- Arithmetic Operators
- Unary Operators
- Relational Operators
- Logical Operators
- Assignment Operators
- Operator Precedence

---

**📅 Internship:** Java Development Internship – Internnova

**📖 Module:** Java Operators

**✅ Status:** Completed
