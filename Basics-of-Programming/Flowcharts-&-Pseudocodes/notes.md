# 📝 Notes – Flowcharts & Pseudocodes

## 📌 Objective
Learn how to solve programming problems using **Flowcharts** and **Pseudocode** before writing actual Java code.

---

# 1. What are Flowcharts?

A **Flowchart** is a graphical representation of an algorithm or process. It uses standard symbols connected by arrows to show the sequence of steps required to solve a problem.

### Advantages
- Easy to understand
- Improves problem-solving skills
- Helps identify logical errors
- Makes debugging easier
- Acts as documentation

### Disadvantages
- Time-consuming for complex problems
- Difficult to modify large flowcharts

---

# 2. Flowchart Components

| Symbol | Name | Purpose |
|---------|------|---------|
| 🔵 Oval | Start/End | Beginning or end of the program |
| ▭ Rectangle | Process | Perform calculations or actions |
| 🔷 Diamond | Decision | Check a condition (Yes/No) |
| ⬅️➡️ Arrow | Flow Line | Shows execution flow |
| ▱ Parallelogram | Input/Output | Read input or display output |
| ⭕ Circle | Connector | Connect different parts of a flowchart |

---

# 3. Example: Sum of Two Numbers

## Problem
Find the sum of two numbers entered by the user.

### Algorithm
1. Start
2. Input A and B
3. Sum = A + B
4. Display Sum
5. Stop

### Pseudocode

```text
START

INPUT A
INPUT B

SUM = A + B

PRINT SUM

STOP
```

### Flow

```
Start
   ↓
Input A, B
   ↓
SUM = A + B
   ↓
Print SUM
   ↓
Stop
```

---

# 4. Calculate Simple Interest

## Formula

```
SI = (P × R × T) / 100
```

Where

- P = Principal
- R = Rate
- T = Time

### Algorithm

1. Start
2. Input P, R, T
3. Calculate SI
4. Display SI
5. Stop

### Pseudocode

```text
START

INPUT P
INPUT R
INPUT T

SI = (P * R * T) / 100

PRINT SI

STOP
```

---

# 5. Maximum of Three Numbers

## Problem

Find the largest among three numbers.

### Algorithm

1. Start
2. Input A, B, C
3. Compare the numbers
4. Print the largest
5. Stop

### Pseudocode

```text
START

INPUT A, B, C

IF A > B AND A > C
    PRINT A
ELSE IF B > C
    PRINT B
ELSE
    PRINT C

STOP
```

---

# 6. Check Prime Number

## Prime Number

A prime number has exactly **two factors**:
- 1
- Itself

Examples

```
2
3
5
7
11
13
17
```

### Algorithm

1. Start
2. Input N
3. Count factors
4. If factors = 2
5. Prime
6. Else
7. Not Prime
8. Stop

### Pseudocode

```text
START

INPUT N

COUNT = 0

FOR i = 1 TO N

    IF N % i == 0

        COUNT = COUNT + 1

IF COUNT == 2

    PRINT "Prime"

ELSE

    PRINT "Not Prime"

STOP
```

---

# 7. Sum of First N Natural Numbers

## Formula

```
Sum = N × (N + 1) / 2
```

### Algorithm

1. Start
2. Input N
3. Calculate Sum
4. Print Sum
5. Stop

### Pseudocode

```text
START

INPUT N

SUM = N * (N + 1) / 2

PRINT SUM

STOP
```

---

# What is Pseudocode?

Pseudocode is an informal way of writing the logic of a program using simple English statements without following any programming language syntax.

### Advantages

- Easy to write
- Easy to understand
- Language independent
- Helps before coding
- Improves logical thinking

### Example

```text
START

INPUT Age

IF Age >= 18

    PRINT "Eligible to Vote"

ELSE

    PRINT "Not Eligible"

STOP
```

---

# Difference Between Algorithm, Pseudocode and Flowchart

| Algorithm | Pseudocode | Flowchart |
|-----------|------------|-----------|
| Step-by-step instructions | English-like code | Graphical representation |
| Text format | Text format | Diagram format |
| Easy to write | Easier to convert into code | Easier to visualize |
| Language independent | Language independent | Language independent |

---

# Key Takeaways

- Flowcharts visually represent program logic.
- Pseudocode helps design solutions before coding.
- Every problem should be solved using an algorithm before implementation.
- Decision symbols in flowcharts represent conditions.
- Practice with flowcharts improves programming and debugging skills.

---

## ✅ Topics Covered

- Introduction to Flowcharts
- Flowchart Components
- Sum of Two Numbers
- Calculate Simple Interest
- Maximum of Three Numbers
- Prime Number Check
- Sum of First N Natural Numbers
- Introduction to Pseudocode
- Algorithms vs Pseudocode vs Flowcharts

---

**📅 Internship:** Java Development Internship – Internnova  
**📖 Module:** Flowcharts & Pseudocodes  
**✅ Status:** Completed
