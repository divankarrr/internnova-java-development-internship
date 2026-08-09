# 📅 Day 15 – Recursion in Java

## 📌 Overview

On Day 15 of my **Java Development Internship at Internnova**, I learned the fundamentals of **Recursion** and practiced solving different problems using recursive approaches.

The module covered recursive function calls, the **call stack**, stack overflow, increasing and decreasing order problems, factorial, Fibonacci numbers, array problems, String problems, power calculation, tiling, friends pairing, and binary String problems.

Recursion is an important problem-solving technique in DSA where a function solves a problem by calling itself on a smaller subproblem.

---

## 🎯 Learning Objectives

- Understand the concept of recursion.
- Understand the base case and recursive case.
- Learn how recursive calls work using the call stack.
- Understand Stack Overflow.
- Solve problems using recursion.
- Print numbers in increasing and decreasing order.
- Calculate factorial recursively.
- Calculate the sum of natural numbers.
- Find the Nth Fibonacci number.
- Check whether an array is sorted.
- Find the first and last occurrence of an element.
- Calculate power using recursion.
- Optimize recursive power calculation.
- Solve the Tiling Problem.
- Remove duplicates from a String.
- Solve the Friends Pairing Problem.
- Solve Binary String problems.
- Analyze recursive solutions.

---

# 📚 Topics Covered

## 🔹 1. What is Recursion?

Recursion is a technique where a function calls itself to solve a smaller version of the same problem.

A recursive function generally contains:

```text
Base Case
    ↓
Recursive Case
```

Example:

```java
static void printNumbers(int n) {

    if (n == 0) {
        return;
    }

    System.out.println(n);

    printNumbers(n - 1);
}
```

The function keeps calling itself until the base case is reached.

---

# 🔹 2. Base Case

The **base case** specifies when the recursion should stop.

Example:

```java
if (n == 0) {
    return;
}
```

Without a proper base case, recursive calls may continue indefinitely.

---

# 🔹 3. Recursive Case

The recursive case is the part where the function calls itself with a smaller or modified input.

Example:

```java
printNumbers(n - 1);
```

The input becomes smaller during every recursive call.

---

# 🔹 4. Call Stack

Every function call is stored in the **call stack**.

For:

```java
print(3);
```

The calls can be visualized as:

```text
print(3)
   ↓
print(2)
   ↓
print(1)
   ↓
print(0)
```

Once the base case is reached, the functions return in reverse order.

```text
print(0)
   ↑
print(1)
   ↑
print(2)
   ↑
print(3)
```

Understanding the call stack is essential for understanding recursion.

---

# ⚠️ 5. Stack Overflow

If recursion continues without reaching a base case, the call stack keeps growing.

Example:

```java
static void infiniteRecursion() {
    infiniteRecursion();
}
```

This eventually causes:

```text
StackOverflowError
```

Therefore, every recursive solution should have a correct terminating condition.

---

# 🔽 6. Print Numbers in Decreasing Order

Example:

```text
Input: 5

Output:
5
4
3
2
1
```

Recursive approach:

```text
print(n)
call print(n - 1)
```

---

# 🔼 7. Print Numbers in Increasing Order

Example:

```text
Input: 5

Output:
1
2
3
4
5
```

One recursive approach:

```text
call print(n - 1)
print(n)
```

The position of the recursive call determines when the number is printed.

---

# 🧮 8. Factorial of N

Factorial of `n` is:

```text
n! = n × (n - 1) × (n - 2) × ... × 1
```

Recursive formula:

```text
n! = n × (n - 1)!
```

Base case:

```text
0! = 1
```

Example:

```text
5!

= 5 × 4 × 3 × 2 × 1
= 120
```

Recursive implementation:

```java
static int factorial(int n) {

    if (n == 0) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

---

# ➕ 9. Sum of N Natural Numbers

The sum of the first `n` natural numbers can be calculated recursively.

Formula:

```text
sum(n) = n + sum(n - 1)
```

Base case:

```text
sum(0) = 0
```

Example:

```text
sum(5)

= 5 + 4 + 3 + 2 + 1
= 15
```

---

# 🐇 10. Nth Fibonacci Number

The Fibonacci sequence is:

```text
0 1 1 2 3 5 8 13 ...
```

Each number is the sum of the previous two numbers.

Recursive relation:

```text
fib(n) = fib(n - 1) + fib(n - 2)
```

Base cases:

```text
fib(0) = 0
fib(1) = 1
```

Example:

```text
fib(5) = 5
```

### Complexity

The basic recursive implementation has exponential time complexity:

```text
O(2^n)
```

This makes it useful for learning recursion, but inefficient for large `n` without optimization.

---

# 🔍 11. Check if an Array is Sorted

Recursion can be used to check whether an array is sorted.

Example:

```text
1 2 3 4 5
```

Output:

```text
Sorted
```

The recursive function compares adjacent elements and moves toward the end of the array.

Conceptually:

```text
arr[0] <= arr[1]
       ↓
arr[1] <= arr[2]
       ↓
arr[2] <= arr[3]
       ↓
...
```

---

# 🎯 12. First Occurrence

The first occurrence problem finds the first index where a particular element appears.

Example:

```text
Array:
2 5 3 5 7

Target:
5
```

Output:

```text
First occurrence = 1
```

Recursion checks elements from left to right.

---

# 🎯 13. Last Occurrence

The last occurrence problem finds the final index where an element appears.

Example:

```text
Array:
2 5 3 5 7

Target:
5
```

Output:

```text
Last occurrence = 3
```

The recursive approach can search toward the end and return the last valid position.

---

# ⚡ 14. Calculate X to the Power N

The recursive approach calculates:

```text
xⁿ
```

Using:

```text
xⁿ = x × xⁿ⁻¹
```

Base case:

```text
x⁰ = 1
```

Example:

```text
2⁵ = 32
```

---

# 🚀 15. Optimized Power Calculation

The power calculation can be optimized using **Fast Exponentiation**.

Instead of calculating:

```text
x × x × x × x × ...
```

we reduce the exponent by half.

For even `n`:

```text
xⁿ = (xⁿ/²) × (xⁿ/²)
```

For odd `n`:

```text
xⁿ = x × (xⁿ/²) × (xⁿ/²)
```

### Complexity

Normal recursive power:

```text
O(n)
```

Optimized power:

```text
O(log n)
```

---

# 🧱 16. Tiling Problem

The Tiling Problem is a classic recursion problem.

Consider a floor of size:

```text
2 × n
```

and tiles of size:

```text
2 × 1
```

For each position, the tile can be placed:

```text
Vertically
```

or

```text
Horizontally
```

This leads to a recursive relation similar to Fibonacci:

```text
ways(n) = ways(n - 1) + ways(n - 2)
```

---

# 🔤 17. Remove Duplicates in a String

The goal is to remove duplicate characters while maintaining the required order.

Example:

```text
Input:
appnnacollege

Output:
apncollege
```

A recursive approach can keep track of characters that have already appeared.

A boolean array can be used:

```java
boolean[] map = new boolean[26];
```

---

# 👥 18. Friends Pairing Problem

Given `n` friends, each friend can either:

1. Stay single.
2. Pair with another friend.

The recursive relation is:

```text
f(n) = f(n - 1) + (n - 1) × f(n - 2)
```

Explanation:

```text
Friend stays single
        +
Friend pairs with one of the remaining friends
```

This is a classic recursion and combinatorics problem.

---

# 🔢 19. Binary Strings Problem

Binary Strings contain only:

```text
0 and 1
```

The problem involves generating or counting binary Strings under specific conditions.

For example, generating binary Strings without consecutive `1`s.

For:

```text
n = 3
```

Possible valid Strings include:

```text
000
001
010
100
101
```

The recursive solution makes a decision at each position.

---

# 📚 20. Stack Analysis – Binary Strings

Binary String recursion demonstrates how recursive calls are stored in the call stack.

At every recursive level, the function decides which character can be placed next.

Conceptually:

```text
                  ""
               /      \
              0        1
            /   \       \
           00   01      10
          ...
```

This helps understand how recursion can be used for **backtracking and decision-tree problems**.

---

# 📊 Complexity Summary

| Problem | Typical Time Complexity |
|---|---:|
| Print Increasing Order | O(n) |
| Print Decreasing Order | O(n) |
| Factorial | O(n) |
| Sum of N Numbers | O(n) |
| Fibonacci – Basic Recursion | O(2^n) |
| Check Sorted Array | O(n) |
| First Occurrence | O(n) |
| Last Occurrence | O(n) |
| Power – Normal | O(n) |
| Power – Optimized | O(log n) |
| Tiling Problem | Exponential without optimization |
| Remove Duplicates | O(n) with auxiliary tracking |
| Friends Pairing | Exponential without optimization |
| Binary String Generation | O(2^n) in the worst case |

---

# 💻 Problems / Programs Practiced

- What is Recursion?
- Print Numbers in Decreasing Order
- Understanding Stack Overflow
- Print Numbers in Increasing Order
- Find Factorial of N
- Print Sum of N Natural Numbers
- Print Nth Fibonacci Number
- Check if Array is Sorted
- Find First Occurrence
- Find Last Occurrence
- Print `x` to the Power `n`
- Optimized Power Calculation
- Tiling Problem
- Remove Duplicates in a String
- Friends Pairing Problem
- Binary Strings Problem
- Stack Analysis of Binary Strings

---

# 🛠 Technologies Used

- Java
- JDK
- Visual Studio Code
- Terminal
- Git & GitHub


---

# 📖 Key Learnings

- Recursion allows a function to solve a problem by calling itself.
- Every recursive solution needs a proper base case.
- Recursive calls are stored in the call stack.
- Incorrect recursion can lead to `StackOverflowError`.
- The position of the recursive call affects the order of execution.
- Many mathematical and DSA problems can be expressed recursively.
- Recursion is useful for tree, graph, backtracking, and divide-and-conquer problems.
- Fast Exponentiation can reduce power calculation from `O(n)` to `O(log n)`.
- Recursive solutions may have high time complexity and can often be optimized using dynamic programming or other techniques.

---

# 🚀 Skills Developed

- Recursion
- Call Stack Analysis
- Problem Decomposition
- Backtracking Fundamentals
- Mathematical Recursion
- String Recursion
- Array Recursion
- Algorithm Optimization
- Time & Space Complexity
- DSA Problem Solving

---

# 📈 Learning Outcome

By completing Day 15, I developed a stronger understanding of **recursion and recursive problem solving in Java**.

I learned how to identify base and recursive cases, trace recursive calls through the call stack, and apply recursion to arrays, Strings, mathematical problems, and combinatorial problems.

The learning progression was:

```text
Recursion Basics
       ↓
Base Case & Recursive Case
       ↓
Call Stack
       ↓
Basic Recursive Problems
       ↓
Arrays & Strings
       ↓
Power Optimization
       ↓
Tiling & Pairing
       ↓
Binary Strings
       ↓
Advanced Recursive Problem Solving
```

---

**👨‍💻 Author:** Divankar Singh  
**🏢 Internship:** Java Development Internship – Internnova  
**📚 Day:** 15  
**📖 Module:** Recursion  
**✅ Status:** Completed
