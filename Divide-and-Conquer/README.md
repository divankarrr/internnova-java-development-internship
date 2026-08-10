# 📅 Day 16 – Divide & Conquer in Java

## 🏢 Java Development Internship – Internnova

**Day:** 16  
**Module:** Divide & Conquer  
**Language:** Java  
**Status:** ✅ Completed

---

## 📌 Overview

On Day 16 of my **Java Development Internship at Internnova**, I learned the **Divide & Conquer** technique and applied it to important searching and sorting problems.

The main focus was on understanding how a large problem can be divided into smaller subproblems, solved recursively, and then combined to obtain the final solution.

The topics covered included:

- Divide & Conquer
- Merge Sort
- Space-Optimized Merge Sort
- Quick Sort
- Worst Case in Quick Sort
- Search in a Sorted & Rotated Array

---

## 🎯 Learning Objectives

- Understand the Divide & Conquer approach.
- Learn how to divide a problem into smaller subproblems.
- Understand recursive problem solving.
- Implement Merge Sort.
- Understand the space optimization of Merge Sort.
- Implement Quick Sort.
- Analyze the best, average, and worst cases of Quick Sort.
- Understand pivot selection.
- Search efficiently in a sorted and rotated array.
- Analyze time and space complexity of Divide & Conquer algorithms.

---

# 📚 Topics Covered

## 🔹 1. What is Divide & Conquer?

**Divide & Conquer** is an algorithmic technique where a problem is divided into smaller subproblems.

The general process is:

```text
Divide
   ↓
Conquer
   ↓
Combine
```

### Three Main Steps

### 1. Divide

Break the original problem into smaller subproblems.

### 2. Conquer

Solve the smaller problems, usually using recursion.

### 3. Combine

Combine the solutions of the smaller problems to obtain the final solution.

---

# 🔀 2. Merge Sort

Merge Sort is a **Divide & Conquer sorting algorithm**.

The array is repeatedly divided into two halves until individual elements remain.

Then the smaller arrays are merged in sorted order.

Example:

```text
Original Array

8 3 2 9 7 1 5 4

          ↓ Divide

8 3 2 9       7 1 5 4

     ↓              ↓

8 3    2 9       7 1    5 4

     ↓              ↓

Sorted smaller arrays

          ↓ Merge

2 3 8 9       1 4 5 7

          ↓

1 2 3 4 5 7 8 9
```

---

# 🧩 3. Merge Sort Algorithm

The basic process is:

```text
mergeSort(array, start, end)

if start >= end
    return

mid = (start + end) / 2

mergeSort(left half)
mergeSort(right half)

merge both sorted halves
```

### Time Complexity

```text
Best Case    : O(n log n)
Average Case : O(n log n)
Worst Case   : O(n log n)
```

### Space Complexity

Traditional Merge Sort requires:

```text
O(n)
```

additional space for merging.

---

# 🚀 4. Space-Optimized Merge Sort

The merge operation normally requires an additional temporary array.

The space-optimized version focuses on reducing unnecessary memory usage where possible.

The key idea is to carefully manage the merging process and avoid unnecessary allocations.

### Important Point

Standard Merge Sort still generally requires additional space for merging.

Therefore, when discussing "space optimization," it is important to distinguish between:

```text
Reducing temporary allocations
```

and

```text
Achieving true O(1) auxiliary space
```

A standard array-based Merge Sort is generally:

```text
Time  : O(n log n)
Space : O(n)
```

---

# ⚡ 5. Quick Sort

Quick Sort is another important **Divide & Conquer sorting algorithm**.

It selects an element as a **pivot** and partitions the array around the pivot.

After partitioning:

```text
Elements smaller than pivot
        ↓
      Pivot
        ↓
Elements greater than pivot
```

The left and right portions are then sorted recursively.

---

# 🔹 6. Quick Sort Example

Consider:

```text
5 3 8 4 2 7 1 10
```

Suppose `5` is selected as the pivot.

After partitioning, values smaller than `5` move to the left and larger values move to the right.

Conceptually:

```text
3 4 2 1 | 5 | 8 7 10
         ↑
       Pivot
```

Then Quick Sort is recursively applied to both sides.

---

# 🔄 7. Quick Sort Process

```text
QuickSort(array, start, end)

        ↓

Choose Pivot

        ↓

Partition Array

        ↓

QuickSort(left part)

        ↓

QuickSort(right part)
```

Unlike Merge Sort, Quick Sort does not need to merge two sorted arrays after recursion.

The partitioning step places the pivot in its correct position.

---

# 📊 8. Quick Sort Complexity

| Case | Time Complexity |
|---|---:|
| Best Case | O(n log n) |
| Average Case | O(n log n) |
| Worst Case | O(n²) |

### Space Complexity

Depending on the implementation and recursion depth:

```text
Average: O(log n)
Worst:   O(n)
```

---

# ⚠️ 9. Worst Case in Quick Sort

Quick Sort can take **O(n²)** time when the pivot selection repeatedly produces highly unbalanced partitions.

For example, consider an already sorted array:

```text
1 2 3 4 5 6 7
```

If the first or last element is always selected as the pivot:

```text
1 | 2 3 4 5 6 7
```

Then:

```text
1
2
3
4
5
6
7
```

The recursion becomes highly unbalanced.

This leads to:

```text
O(n²)
```

time complexity.

---

# 🛡️ 10. Improving Quick Sort

The probability of consistently getting the worst case can be reduced using better pivot selection strategies such as:

- Randomized pivot selection
- Choosing the middle element
- Median-of-three techniques

The goal is to create more balanced partitions.

---

# 🔍 11. Search in a Sorted & Rotated Array

A sorted array can be rotated at some position.

Example:

Original:

```text
1 2 3 4 5 6 7
```

Rotated:

```text
4 5 6 7 1 2 3
```

The array is no longer completely sorted from left to right, but it still contains useful structure.

---

# ⚡ 12. Searching Using Modified Binary Search

A modified version of **Binary Search** can efficiently search in a sorted and rotated array.

At every step:

1. Find the middle element.
2. Determine which half is sorted.
3. Check whether the target lies inside the sorted half.
4. Search the appropriate half.

Example:

```text
4 5 6 7 0 1 2
```

Target:

```text
0
```

The algorithm determines which side is sorted and eliminates the half that cannot contain the target.

---

# 🧠 13. Key Idea of Rotated Array Search

For a rotated sorted array, at least one of the two halves is sorted.

```text
left -------- mid -------- right
```

Check:

```text
Is left half sorted?
```

If yes, determine whether the target lies within that range.

Otherwise:

```text
Right half must be sorted
```

Then continue the search accordingly.

---

# 📈 Complexity of Rotated Array Search

The modified Binary Search runs in:

```text
Time Complexity: O(log n)
```

for the standard distinct-element case.

Space complexity for an iterative implementation:

```text
O(1)
```

---

# 🧮 Divide & Conquer Complexity Summary

| Algorithm | Best | Average | Worst | Extra Space |
|---|---:|---:|---:|---:|
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) average |
| Rotated Array Search | O(1) | O(log n) | O(log n) | O(1) iterative |

---

# 💻 Problems Practiced

- What is Divide & Conquer?
- Merge Sort – Basic Implementation
- Merge Sort – Space Optimization
- Merge Sort Code
- Quick Sort
- Quick Sort Code
- Worst Case in Quick Sort
- Search in Sorted & Rotated Array
- Sorted & Rotated Array Search Code

---

# 🛠 Technologies Used

- **Java**
- **JDK**
- **Visual Studio Code**
- **Git & GitHub**


---

# 📖 Key Learnings

- Divide & Conquer breaks complex problems into smaller subproblems.
- Recursion is commonly used to implement Divide & Conquer algorithms.
- Merge Sort divides the array and then merges sorted portions.
- Merge Sort guarantees `O(n log n)` time complexity.
- Quick Sort uses a pivot and partitioning strategy.
- Quick Sort has `O(n log n)` average-case complexity.
- Poor pivot selection can cause Quick Sort's worst-case `O(n²)` complexity.
- Randomized or better pivot selection can reduce the chance of poor partitions.
- A sorted and rotated array can be searched using modified Binary Search.
- Divide & Conquer is an important technique for designing efficient algorithms.

---

# 🚀 Skills Developed

- Divide & Conquer
- Recursion
- Merge Sort
- Quick Sort
- Array Partitioning
- Binary Search
- Rotated Array Search
- Algorithm Analysis
- Time Complexity
- Space Complexity
- Problem Solving

---

# 📈 Learning Outcome

By completing Day 16, I learned how **Divide & Conquer** can be used to design efficient algorithms.

I implemented and analyzed **Merge Sort and Quick Sort**, understood how pivot selection affects Quick Sort performance, and learned how to apply Binary Search concepts to a sorted and rotated array.

The learning progression was:

```text
Divide & Conquer
       ↓
Merge Sort
       ↓
Merge Optimization
       ↓
Quick Sort
       ↓
Pivot & Partitioning
       ↓
Quick Sort Worst Case
       ↓
Sorted & Rotated Array
       ↓
Modified Binary Search
```

---

## 📌 Internship Progress

| Day | Topic |
|---:|---|
| 16 | Divide & Conquer |
| **Status** | ✅ Completed |

---

**👨‍💻 Author:** Divankar Singh  
**🏢 Internship:** Java Development Internship – Internnova  
**📚 Day:** 16  
**📖 Module:** Divide & Conquer  
**✅ Status:** Completed
