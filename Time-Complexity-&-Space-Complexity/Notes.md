# Day 20 - Time & Space Complexity Notes

## 1. What is Time Complexity?

Time Complexity describes how the running time of an algorithm grows with the size of the input.

It is represented using asymptotic notation.

Example:

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

# 2. What is Space Complexity?

Space Complexity describes how much extra memory an algorithm requires as input size increases.

Example:

```java
int sum = 0;
```

Only one extra variable is used.

```text
Space Complexity = O(1)
```

---

# 3. Asymptotic Notations

## Big O - O()

Represents the upper bound.

Usually used to discuss the worst-case growth of an algorithm.

```text
O(1)
O(log n)
O(n)
O(n log n)
O(n²)
O(2ⁿ)
O(n!)
```

---

## Big Omega - Ω()

Represents the lower bound.

Example:

Linear Search:

```text
Best Case = Ω(1)
```

because the element may be found at the first position.

---

## Big Theta - Θ()

Represents a tight bound.

If an algorithm always performs approximately `n` operations:

```text
Θ(n)
```

---

# 4. Common Complexity Order

From generally more efficient to less efficient:

```text
O(1)
     ↓
O(log n)
     ↓
O(n)
     ↓
O(n log n)
     ↓
O(n²)
     ↓
O(n³)
     ↓
O(2ⁿ)
     ↓
O(n!)
```

For large inputs, algorithms with lower growth rates are generally preferred.

---

# 5. Constant Complexity - O(1)

Example:

```java
int x = arr[0];
```

Array access takes constant time.

```text
Time = O(1)
```

Another example:

```java
int sum = a + b;
```

```text
Time = O(1)
```

---

# 6. Linear Complexity - O(n)

Example:

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

Number of iterations:

```text
n
```

Therefore:

```text
O(n)
```

---

# 7. Logarithmic Complexity - O(log n)

When the input is repeatedly divided.

Example:

```java
for (int i = 1; i < n; i *= 2) {
    System.out.println(i);
}
```

Values:

```text
1 → 2 → 4 → 8 → 16 → ...
```

Therefore:

```text
O(log n)
```

Binary Search is a classic example.

---

# 8. Quadratic Complexity - O(n²)

Two nested loops:

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + j);
    }
}
```

Total operations:

```text
n × n = n²
```

Therefore:

```text
O(n²)
```

Bubble Sort commonly has `O(n²)` average and worst-case complexity.

---

# 9. Cubic Complexity - O(n³)

Three nested loops:

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
            System.out.println(i + j + k);
        }
    }
}
```

Operations:

```text
n × n × n = n³
```

Therefore:

```text
O(n³)
```

---

# 10. Sequential Loops

Consider:

```java
for (int i = 0; i < n; i++) {
}

for (int j = 0; j < n; j++) {
}
```

Complexity:

```text
O(n) + O(n)
= O(2n)
= O(n)
```

Constants are ignored.

---

# 11. Nested Loops

Consider:

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
    }
}
```

Complexity:

```text
O(n × n)
= O(n²)
```

Remember:

> Sequential operations are generally added, while nested operations are generally multiplied.

---

# 12. Different-Sized Nested Loops

Example:

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
    }
}
```

Complexity:

```text
O(n × m)
```

Do not automatically convert this to `O(n²)` unless `n` and `m` represent the same input size.

---

# 13. Drop Constants

Example:

```text
O(3n)
```

becomes:

```text
O(n)
```

Similarly:

```text
O(10n²)
```

becomes:

```text
O(n²)
```

---

# 14. Drop Lower-Order Terms

Example:

```text
O(n² + n)
```

The dominant term is `n²`.

Therefore:

```text
O(n²)
```

Example:

```text
O(n³ + n² + n + 1)
```

becomes:

```text
O(n³)
```

---

# 15. Binary Search

Binary Search requires a sorted array.

At each step:

```text
n → n/2 → n/4 → n/8 → ...
```

Therefore:

```text
Time Complexity = O(log n)
```

Iterative Binary Search:

```text
Space Complexity = O(1)
```

---

# 16. Bubble Sort

Bubble Sort compares adjacent elements.

Example:

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

Complexity:

```text
Best:    O(n)     optimized version
Average: O(n²)
Worst:   O(n²)

Space: O(1)
```

---

# 17. Recursive Factorial

```java
static int factorial(int n) {
    if (n <= 1) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

Call sequence:

```text
factorial(n)
factorial(n-1)
factorial(n-2)
...
factorial(1)
```

Therefore:

```text
Time = O(n)
Space = O(n)
```

The space comes from the recursive call stack.

---

# 18. Sum of N Numbers

Loop implementation:

```java
int sum = 0;

for (int i = 1; i <= n; i++) {
    sum += i;
}
```

Complexity:

```text
Time = O(n)
Space = O(1)
```

Using the formula:

```text
sum = n(n + 1) / 2
```

we get:

```text
Time = O(1)
Space = O(1)
```

This is an example of algorithm optimization.

---

# 19. Fibonacci

Naive recursive implementation:

```java
static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

The recursion tree grows rapidly.

Approximate complexity:

```text
Time = O(2ⁿ)
Space = O(n)
```

This approach becomes inefficient for large `n`.

---

# 20. Fibonacci Optimization

Dynamic Programming can store previously calculated results.

```text
Naive Recursion:
Time = O(2ⁿ)

Dynamic Programming:
Time = O(n)
```

With only two previous values:

```text
Time = O(n)
Space = O(1)
```

---

# 21. Merge Sort

Merge Sort follows:

```text
Divide → Solve → Merge
```

The array is repeatedly divided into two halves.

Recurrence:

```text
T(n) = 2T(n/2) + O(n)
```

Complexity:

```text
Best = O(n log n)
Average = O(n log n)
Worst = O(n log n)
Space = O(n)
```

---

# 22. Why Merge Sort is O(n log n)?

There are two important components.

### Number of levels

The array is divided by 2:

```text
n → n/2 → n/4 → n/8 → ...
```

This produces:

```text
O(log n)
```

levels.

### Work at Each Level

Merging all elements at each level takes:

```text
O(n)
```

Therefore:

```text
O(n) × O(log n)
```

Result:

```text
O(n log n)
```

---

# 23. Recurrence Relation

A recurrence relation represents the running time of a recursive algorithm in terms of smaller inputs.

Example:

```text
T(n) = 2T(n/2) + O(n)
```

This represents Merge Sort.

Another example:

```text
T(n) = T(n - 1) + O(1)
```

represents a simple recursive algorithm that reduces the input by one.

---

# 24. Simple Power Function

```java
static long power(int x, int n) {
    if (n == 0) {
        return 1;
    }

    return x * power(x, n - 1);
}
```

Complexity:

```text
Time = O(n)
Space = O(n)
```

---

# 25. Fast Power

Instead of reducing `n` by one, we divide it by two.

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

Complexity:

```text
Time = O(log n)
Space = O(log n)
```

This is much faster than simple recursive power.

---

# 26. Important Complexity Patterns

| Code Pattern           | Complexity |
| ---------------------- | ---------- |
| Single statement       | O(1)       |
| Single loop            | O(n)       |
| Loop with `i *= 2`     | O(log n)   |
| Two nested loops       | O(n²)      |
| Three nested loops     | O(n³)      |
| Binary Search          | O(log n)   |
| Merge Sort             | O(n log n) |
| Factorial recursion    | O(n)       |
| Naive Fibonacci        | O(2ⁿ)      |
| Simple recursive power | O(n)       |
| Fast power             | O(log n)   |

---

# 27. Quick Tricks to Identify Complexity

### Trick 1

```java
for (int i = 0; i < n; i++)
```

Answer:

```text
O(n)
```

### Trick 2

```java
for (int i = 1; i < n; i *= 2)
```

Answer:

```text
O(log n)
```

### Trick 3

```java
for (...) {
    for (...) {
    }
}
```

Answer:

```text
O(n²)
```

### Trick 4

```java
for (...) {
}

for (...) {
}
```

Answer:

```text
O(n)
```

not `O(n²)`.

### Trick 5

```java
T(n) = 2T(n/2) + O(n)
```

Answer:

```text
O(n log n)
```

---

# 28. Best, Average and Worst Case

## Best Case

Minimum amount of work.

Example:

Linear Search finds the element at index `0`.

```text
O(1)
```

## Average Case

Expected amount of work over typical inputs.

## Worst Case

Maximum amount of work.

Example:

Linear Search finds the element at the last position or does not find it.

```text
O(n)
```

---

# 29. Time vs Space Trade-Off

Sometimes we use additional memory to reduce execution time.

Example:

Naive Fibonacci:

```text
Time = O(2ⁿ)
```

Dynamic Programming Fibonacci:

```text
Time = O(n)
Space = O(n)
```

We use extra memory to avoid repeated calculations.

This is called a:

> **Time-Space Trade-Off**

---

# 30. Key Revision Points

```text
O(1)       → Constant
O(log n)   → Divide by a constant factor
O(n)       → One complete traversal
O(n log n) → Divide + Linear work
O(n²)      → Two nested loops
O(2ⁿ)      → Many recursive branches
O(n!)      → Permutations
```

### Remember:

```text
Sequential → Add
Nested → Multiply
Constants → Ignore
Lower terms → Ignore
Dominant term → Keep
Divide by 2 → Logarithmic
```

---

# 🧠 Day 20 Summary

Today I learned how to analyze the efficiency of algorithms using Time and Space Complexity.

The major concepts covered were:

* Big O
* Big Omega
* Big Theta
* Constant Complexity
* Linear Complexity
* Logarithmic Complexity
* Quadratic Complexity
* Cubic Complexity
* Space Complexity
* Loop Analysis
* Nested Loop Analysis
* Bubble Sort
* Binary Search
* Recursive Factorial
* Sum of N Numbers
* Fibonacci
* Merge Sort
* Recurrence Relations
* Power Function
* Fast Power
* Time-Space Trade-Off

---

## 💡 Final Learning

> **Before optimizing code, understand its complexity.**

An algorithm that works for a small input may become extremely slow for a large input. Complexity analysis helps us predict this behavior and choose better algorithms.

---

**Internnova Java Development Internship**
**Day 20 | Time & Space Complexity**

#Java #DSA #Algorithms #TimeComplexity #SpaceComplexity #BigO #Internnova
