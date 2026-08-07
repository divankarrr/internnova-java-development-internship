# 📅 Day 09 – Subarrays & Array Optimization

## 📌 Overview

On Day 09 of my **Java Development Internship at Internnova**, I focused on solving important array and subarray problems using different optimization techniques.

The main focus was on finding the **maximum sum of a subarray** using three approaches — **Brute Force, Prefix Sum, and Kadane's Algorithm**. I also learned two important interview problems: **Trapping Rain Water** and **Best Time to Buy and Sell Stock**.

These problems helped me understand how algorithmic optimization can reduce time complexity and improve problem-solving efficiency.

---

## 🎯 Learning Objectives

- Understand the concept of subarrays.
- Calculate the maximum subarray sum using Brute Force.
- Optimize subarray sum using Prefix Sum.
- Implement Kadane's Algorithm.
- Compare different approaches based on time complexity.
- Understand the Trapping Rain Water problem.
- Calculate the amount of water trapped between bars.
- Solve the Best Time to Buy and Sell Stock problem.
- Improve array-based problem-solving skills.

---

## 📚 Topics Covered

### 🔹 Maximum Sum of Subarray

Three approaches were studied:

1. **Brute Force**
2. **Prefix Sum**
3. **Kadane's Algorithm**

### 🔹 Trapping Rain Water

- Understanding elevation maps
- Finding left and right maximum boundaries
- Calculating trapped water
- Array-based optimization

### 🔹 Best Time to Buy and Sell Stock

- Finding the maximum possible profit
- Tracking the minimum buying price
- Calculating profit efficiently
- Single-pass solution

---

# 🧠 Maximum Sum of Subarray

A **subarray** is a contiguous portion of an array.

Example:

```text
Array:
-2 1 -3 4 -1 2 1 -5 4
```

The maximum-sum subarray is:

```text
4 -1 2 1
```

Maximum sum:

```text
6
```

---

## 1. Brute Force Approach

Generate all possible subarrays and calculate their sums.

### Complexity

```text
Time Complexity: O(n³)
Space Complexity: O(1)
```

This approach is simple but inefficient for large arrays.

---

## 2. Prefix Sum Approach

A prefix sum array stores the cumulative sum of elements.

Example:

```text
Array:
1 2 3 4

Prefix Sum:
1 3 6 10
```

The sum of any subarray can then be calculated efficiently using prefix sums.

### Complexity

```text
Time Complexity: O(n²)
Space Complexity: O(n)
```

This improves upon the brute-force approach.

---

## 3. Kadane's Algorithm

Kadane's Algorithm finds the maximum subarray sum in linear time.

### Core Idea

At every element, decide whether to:

- Start a new subarray from the current element.
- Extend the previous subarray.

Conceptually:

```text
currentSum = max(currentElement,
                 currentSum + currentElement)
```

Then update:

```text
maxSum
```

### Complexity

```text
Time Complexity: O(n)
Space Complexity: O(1)
```

Kadane's Algorithm is the most efficient of the three approaches for the standard maximum-subarray-sum problem.

---

# 🌧️ Trapping Rain Water

Given an array representing the heights of bars, calculate how much rainwater can be trapped between them.

Example:

```text
Height:
4 2 0 3 2 5
```

The bars create spaces where water can accumulate.

### Core Idea

For each position:

```text
Water Level =
min(leftMaximum, rightMaximum)
```

Therefore:

```text
Trapped Water =
Water Level - Current Height
```

when the result is positive.

### Complexity

A prefix/suffix maximum approach can solve it in:

```text
Time Complexity: O(n)
Space Complexity: O(n)
```

An optimized two-pointer approach can achieve:

```text
Time Complexity: O(n)
Space Complexity: O(1)
```

---

# 📈 Best Time to Buy and Sell Stock

Given daily stock prices, find the maximum profit that can be achieved by buying on one day and selling on a later day.

Example:

```text
Prices:
7 1 5 3 6 4
```

Best transaction:

```text
Buy = 1
Sell = 6
```

Maximum profit:

```text
5
```

### Core Idea

Maintain the minimum price seen so far.

For every price:

```text
profit = currentPrice - minimumPrice
```

Update the maximum profit whenever a better profit is found.

### Complexity

```text
Time Complexity: O(n)
Space Complexity: O(1)
```

---

# 📊 Algorithm Comparison

| Problem / Approach | Time Complexity | Space Complexity |
|---|---:|---:|
| Maximum Subarray – Brute Force | O(n³) | O(1) |
| Maximum Subarray – Prefix Sum | O(n²) | O(n) |
| Maximum Subarray – Kadane | O(n) | O(1) |
| Trapping Rain Water – Prefix/Suffix | O(n) | O(n) |
| Trapping Rain Water – Two Pointer | O(n) | O(1) |
| Best Time to Buy/Sell Stock | O(n) | O(1) |

---

## 💻 Problems Practiced

- Maximum Sum of Subarray using Brute Force
- Maximum Sum of Subarray using Prefix Sum
- Maximum Sum of Subarray using Kadane's Algorithm
- Trapping Rain Water
- Best Time to Buy and Sell Stock

---

## 🛠 Technologies Used

- Java
- JDK
- Visual Studio Code
- Terminal


---

## 📖 Key Learnings

- A subarray must contain contiguous elements.
- Brute Force is useful for understanding the problem but may be inefficient.
- Prefix Sum reduces repeated sum calculations.
- Kadane's Algorithm solves the maximum subarray sum problem in **O(n)** time.
- Trapping Rain Water requires understanding the maximum boundaries around each position.
- The stock problem can be solved efficiently by maintaining the minimum price encountered so far.
- Choosing the right algorithm can significantly improve performance.

---

## 🚀 Skills Developed

- Array Optimization
- Subarray Problems
- Prefix Sum
- Kadane's Algorithm
- Greedy Problem Solving
- Two-Pointer Thinking
- Time & Space Complexity Analysis
- Interview Problem Solving

---

## 📈 Learning Outcome

By completing Day 09, I learned how to optimize array problems by moving from straightforward brute-force solutions toward efficient approaches.

The key progression was:

```text
Brute Force
     ↓
Prefix Sum
     ↓
Kadane's Algorithm
     ↓
O(n) Optimization
```

I also gained practical experience with two important coding interview problems: **Trapping Rain Water** and **Best Time to Buy and Sell Stock**.

---

**👨‍💻 Author:** Divankar Singh  
**🏢 Internship:** Java Development Internship – Internnova  
**📚 Day:** 09  
**📖 Module:** Subarrays & Array Optimization  
**✅ Status:** Completed
