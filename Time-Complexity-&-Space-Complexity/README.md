# Day 20 - Time & Space Complexity

## 📌 Internnova Java Development Internship

**Day:** 20
**Topic:** Time Complexity & Space Complexity
**Language:** Java
**Internship:** Internnova Java Development Internship

---

## 🎯 Objective

The objective of Day 20 was to understand how to analyze the efficiency of algorithms using **Time Complexity** and **Space Complexity**.

The session focused on:

* Understanding Time Complexity
* Understanding Space Complexity
* Big O, Big Omega and Big Theta notation
* Common complexity classes
* Analyzing loops
* Analyzing nested loops
* Analyzing sorting algorithms
* Analyzing searching algorithms
* Recursive complexity analysis
* Recurrence relations
* Merge Sort complexity
* Power function complexity
* Fibonacci complexity

---

## 📚 Topics Covered

### 1. What is Time Complexity?

Time Complexity represents how the running time of an algorithm grows as the input size `n` increases.

It does not usually represent the exact execution time. Instead, it describes the **growth rate** of the algorithm.

Example:

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

The loop executes `n` times.

Therefore:

```text
Time Complexity = O(n)
```

---

### 2. Constant Time Complexity

An operation that takes approximately the same amount of time regardless of input size has constant time complexity.

Example:

```java
int first = arr[0];
```

The operation does not depend on `n`.

Therefore:

```text
Time Complexity = O(1)
```

---

## 📊 Big O Notation

Big O describes the **upper bound** or the worst-case growth rate of an algorithm.

Common examples:

```text
O(1)       Constant
O(log n)   Logarithmic
O(n)       Linear
O(n log n) Linearithmic
O(n²)      Quadratic
O(n³)      Cubic
O(2ⁿ)      Exponential
O(n!)      Factorial
```

Example:

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

Complexity:

```text
O(n)
```

---

## Ω (Big Omega) Notation

Big Omega represents the **lower bound** of an algorithm.

It describes the minimum amount of work an algorithm must perform for an input size.

Example:

Linear search can have:

```text
Best Case: Ω(1)
```

when the required element is found at the first position.

---

## Θ (Big Theta) Notation

Big Theta represents a **tight bound**.

It describes the growth rate when the upper and lower bounds are the same.

Example:

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

The loop always executes `n` times.

Therefore:

```text
Θ(n)
```

---

# 📈 Common Complexities

| Complexity | Name         | Example            |
| ---------- | ------------ | ------------------ |
| O(1)       | Constant     | Array access       |
| O(log n)   | Logarithmic  | Binary Search      |
| O(n)       | Linear       | Single loop        |
| O(n log n) | Linearithmic | Merge Sort         |
| O(n²)      | Quadratic    | Bubble Sort        |
| O(n³)      | Cubic        | Three nested loops |
| O(2ⁿ)      | Exponential  | Naive Fibonacci    |
| O(n!)      | Factorial    | Permutations       |

---

# 💾 Space Complexity

Space Complexity represents the amount of **extra memory** required by an algorithm as the input size grows.

Example:

```java
int sum = 0;

for (int i = 0; i < n; i++) {
    sum += arr[i];
}
```

Only a few variables are used regardless of `n`.

Therefore:

```text
Auxiliary Space = O(1)
```

---

# 🔁 Loop Analysis

### Single Loop

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

The loop executes `n` times.

```text
Time Complexity = O(n)
```

---

### Loop with Constant Increment

```java
for (int i = 0; i < n; i += 2) {
    System.out.println(i);
}
```

Approximately `n/2` iterations are performed.

Constants are ignored in Big O.

```text
O(n/2) = O(n)
```

---

### Logarithmic Loop

```java
for (int i = 1; i < n; i *= 2) {
    System.out.println(i);
}
```

Values of `i`:

```text
1
2
4
8
16
...
```

The number of iterations is approximately `log₂ n`.

Therefore:

```text
Time Complexity = O(log n)
```

---

# 🔂 Nested Loop Analysis

### Two Independent Nested Loops

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + j);
    }
}
```

Outer loop:

```text
n
```

Inner loop:

```text
n
```

Total:

```text
n × n = n²
```

Therefore:

```text
Time Complexity = O(n²)
```

---

### Three Nested Loops

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
            System.out.println(i + j + k);
        }
    }
}
```

Total operations:

```text
n × n × n = n³
```

Therefore:

```text
Time Complexity = O(n³)
```

---

# 🫧 Bubble Sort Analysis

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

Typical implementation:

```java
for (int i = 0; i < n - 1; i++) {
    for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}
```

Complexities:

```text
Best Case:    O(n)      (with optimized version)
Average Case: O(n²)
Worst Case:   O(n²)

Space: O(1)
```

---

# 🔍 Binary Search Analysis

Binary Search works on a **sorted array**.

At every step, the search space is divided into half.

Example:

```text
n
n/2
n/4
n/8
...
```

After `k` steps:

```text
n / 2^k = 1
```

Therefore:

```text
2^k = n
k = log₂ n
```

Hence:

```text
Time Complexity = O(log n)
Space Complexity = O(1)
```

for the iterative implementation.

---

# 🔄 Recursive Complexity Analysis

Recursive algorithms call themselves with smaller input sizes.

Example:

```java
static int factorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

The function calls itself:

```text
n
n-1
n-2
...
1
```

Number of calls is proportional to `n`.

Therefore:

```text
Time Complexity = O(n)
Space Complexity = O(n)
```

The space complexity is `O(n)` because of the recursive call stack.

---

# ➕ Sum of N Numbers Analysis

Consider:

```java
int sum = 0;

for (int i = 1; i <= n; i++) {
    sum += i;
}
```

The loop executes `n` times.

Therefore:

```text
Time Complexity = O(n)
Space Complexity = O(1)
```

Using the mathematical formula:

```text
sum = n(n + 1) / 2
```

we can calculate the result directly:

```java
int sum = n * (n + 1) / 2;
```

Now:

```text
Time Complexity = O(1)
Space Complexity = O(1)
```

This demonstrates how mathematical optimization can improve an algorithm.

---

# 🐇 Fibonacci Analysis

Naive recursive Fibonacci:

```java
static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

The function creates many repeated recursive calls.

Approximate complexity:

```text
Time Complexity = O(2ⁿ)
Space Complexity = O(n)
```

because the recursion depth can reach `n`.

Using Dynamic Programming, Fibonacci can be optimized to:

```text
Time Complexity = O(n)
Space Complexity = O(n)
```

or:

```text
Time Complexity = O(n)
Space Complexity = O(1)
```

when only the previous two values are stored.

---

# 🔀 Merge Sort Analysis

Merge Sort follows the **Divide and Conquer** approach.

It divides the array into two halves recursively and then merges the sorted halves.

Example:

```text
              [8 3 5 2 7 1]
                    |
             Divide into halves
              /             \
         [8 3 5]          [2 7 1]
          /   \             /   \
        ...   ...         ...   ...
                    |
                   Merge
```

At every level:

```text
O(n)
```

work is performed during merging.

Number of levels:

```text
O(log n)
```

Therefore:

```text
Time Complexity = O(n log n)
```

For standard Merge Sort:

```text
Best Case:    O(n log n)
Average Case: O(n log n)
Worst Case:   O(n log n)

Space Complexity = O(n)
```

---

# 🔁 Recurrence Relation - Merge Sort

Merge Sort can be represented using the recurrence:

```text
T(n) = 2T(n/2) + O(n)
```

Where:

* `2T(n/2)` represents sorting two halves.
* `O(n)` represents merging the two halves.

Using the Master Theorem:

```text
T(n) = O(n log n)
```

---

# ⚡ Power Function Analysis

A simple power function:

```java
static long power(int x, int n) {
    if (n == 0) {
        return 1;
    }

    return x * power(x, n - 1);
}
```

For every recursive call, `n` decreases by 1.

Therefore:

```text
Time Complexity = O(n)
Space Complexity = O(n)
```

---

## ⚡ Optimized Power Function

Power can be calculated using **Exponentiation by Squaring**.

```java
static long power(int x, int n) {
    if (n == 0) {
        return 1;
    }

    long half = power(x, n / 2);

    if (n % 2 == 0) {
        return half * half;
    }

    return x * half * half;
}
```

The exponent is divided by 2 at every recursive call.

Therefore:

```text
Time Complexity = O(log n)
Space Complexity = O(log n)
```

This is much more efficient than the simple recursive approach.

---

# 🧠 Important Rules for Complexity Analysis

### Rule 1: Ignore Constants

```text
O(2n) → O(n)
O(5n) → O(n)
O(100n) → O(n)
```

---

### Rule 2: Keep the Dominant Term

```text
O(n² + n) → O(n²)

O(n³ + n² + n) → O(n³)
```

---

### Rule 3: Sequential Loops Add

```java
for (...) {
    // O(n)
}

for (...) {
    // O(n)
}
```

Total:

```text
O(n) + O(n)
= O(2n)
= O(n)
```

---

### Rule 4: Nested Loops Multiply

```java
for (...) {
    for (...) {
        // O(1)
    }
}
```

Total:

```text
O(n × n)
= O(n²)
```

---

### Rule 5: Input Size Reduction by Half Means Logarithmic Complexity

If:

```java
n = n / 2;
```

is repeatedly performed, the complexity is generally:

```text
O(log n)
```

---

# 📊 Complexity Comparison

| Algorithm           |       Best |    Average |      Worst |    Space |
| ------------------- | ---------: | ---------: | ---------: | -------: |
| Linear Search       |       O(1) |       O(n) |       O(n) |     O(1) |
| Binary Search       |       O(1) |   O(log n) |   O(log n) |     O(1) |
| Bubble Sort         |       O(n) |      O(n²) |      O(n²) |     O(1) |
| Merge Sort          | O(n log n) | O(n log n) | O(n log n) |     O(n) |
| Factorial Recursion |       O(n) |       O(n) |       O(n) |     O(n) |
| Naive Fibonacci     |      O(2ⁿ) |      O(2ⁿ) |      O(2ⁿ) |     O(n) |
| Simple Power        |       O(n) |       O(n) |       O(n) |     O(n) |
| Fast Power          |   O(log n) |   O(log n) |   O(log n) | O(log n) |

---

# 💻 Practical Learning

During Day 20, I practiced identifying the complexity of different algorithms by analyzing:

* Number of iterations
* Nested loops
* Recursive calls
* Input-size reduction
* Divide and conquer
* Auxiliary memory usage
* Best, average and worst cases

---

# 📝 Key Takeaways

1. Time Complexity measures the growth of execution time.
2. Space Complexity measures additional memory usage.
3. Big O is commonly used to describe algorithm efficiency.
4. A single loop generally gives `O(n)`.
5. Nested loops generally multiply their complexities.
6. Repeatedly dividing the input by 2 gives `O(log n)`.
7. Merge Sort has `O(n log n)` time complexity.
8. Binary Search has `O(log n)` time complexity.
9. Naive recursive Fibonacci has exponential complexity.
10. Mathematical optimization can reduce complexity significantly.
11. Fast Power reduces `O(n)` to `O(log n)`.
12. Efficient algorithms are essential when working with large inputs.

---


## 🚀 Progress

**Day 20 Completed ✅**

### Skills Practiced

* Time Complexity
* Space Complexity
* Big O
* Big Omega
* Big Theta
* Loop Analysis
* Nested Loop Analysis
* Recursion Analysis
* Searching Analysis
* Sorting Analysis
* Recurrence Relations
* Divide and Conquer
* Algorithm Optimization

---

## 🔗 Learning Outcome

Day 20 strengthened my ability to analyze algorithms before implementing them. Understanding complexity helps in choosing efficient solutions and writing scalable programs.

> **"A good programmer doesn't just ask whether an algorithm works — they ask how efficiently it works."**

---

**Internnova Java Development Internship — Day 20**
**#Java #DSA #TimeComplexity #SpaceComplexity #Algorithms #Internship #LearningJourney**
