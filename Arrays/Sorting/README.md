# 📅 Day 10 – Sorting Algorithms in Java

## 📌 Overview

On Day 10 of my **Java Development Internship at Internnova**, I learned and implemented different **sorting techniques in Java**.

The module focused on understanding how sorting algorithms work internally and how to use Java's built-in sorting methods. I practiced **Bubble Sort, Selection Sort, Insertion Sort, Counting Sort**, and Java's built-in `Arrays.sort()` methods for both ascending and descending order.

Sorting is an important fundamental concept in Data Structures and Algorithms because many efficient searching and problem-solving techniques require sorted data.

---

## 🎯 Learning Objectives

- Understand the concept of sorting.
- Learn how Bubble Sort works.
- Implement Selection Sort.
- Implement Insertion Sort.
- Understand Counting Sort.
- Use Java's built-in `Arrays.sort()` method.
- Sort arrays in ascending order.
- Sort collections in descending order using `Collections.reverseOrder()`.
- Compare sorting algorithms using time complexity.
- Understand when different sorting techniques are useful.

---

## 📚 Topics Covered

### 🔹 1. Bubble Sort

- Compare adjacent elements.
- Swap elements when they are in the wrong order.
- Largest element moves toward the end after each pass.
- Understand optimized Bubble Sort.

### 🔹 2. Selection Sort

- Find the minimum element.
- Place the minimum element at its correct position.
- Repeat for the remaining unsorted portion.

### 🔹 3. Insertion Sort

- Divide the array conceptually into sorted and unsorted portions.
- Pick an element from the unsorted portion.
- Insert it into its correct position in the sorted portion.

### 🔹 4. Counting Sort

- Count the frequency of each element.
- Use the frequency information to construct the sorted array.
- Useful when the range of values is relatively small.

### 🔹 5. Inbuilt Sorting

Java provides built-in sorting functionality through the `Arrays` class.

```java
Arrays.sort(arr);
```

For sorting an `Integer` array in descending order:

```java
Arrays.sort(arr, Collections.reverseOrder());
```

---

# 🫧 Bubble Sort

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

### Example

```text
Before:
5 4 3 2 1

After:
1 2 3 4 5
```

### Complexity

```text
Best Case:    O(n)
Average Case: O(n²)
Worst Case:   O(n²)
Space:        O(1)
```

---

# 🔎 Selection Sort

Selection Sort finds the smallest element from the unsorted portion and places it at the beginning.

### Example

```text
5 4 3 2 1
↓
1 4 3 2 5
↓
1 2 3 4 5
```

### Complexity

```text
Best Case:    O(n²)
Average Case: O(n²)
Worst Case:   O(n²)
Space:        O(1)
```

---

# 🧩 Insertion Sort

Insertion Sort builds the sorted array one element at a time.

### Example

```text
5 | 2 4 1 3
↓
2 5 | 4 1 3
↓
2 4 5 | 1 3
↓
1 2 4 5 | 3
↓
1 2 3 4 5
```

### Complexity

```text
Best Case:    O(n)
Average Case: O(n²)
Worst Case:   O(n²)
Space:        O(1)
```

---

# 🔢 Counting Sort

Counting Sort is a non-comparison-based sorting algorithm.

Instead of comparing elements, it counts how many times each value occurs.

### Example

```text
Input:
4 2 2 8 3 3 1

Frequency:
1 → 1
2 → 2
3 → 2
4 → 1
8 → 1

Sorted:
1 2 2 3 3 4 8
```

### Complexity

```text
Time Complexity: O(n + k)
Space Complexity: O(k)
```

Where:

```text
n = number of elements
k = range of values
```

Counting Sort is most useful when the range of values is not excessively large compared with the number of elements.

---

# ⚡ Java Inbuilt Sorting

Java provides the `Arrays.sort()` method for sorting arrays.

### Ascending Order

```java
import java.util.Arrays;

int[] arr = {5, 2, 8, 1, 3};

Arrays.sort(arr);

System.out.println(Arrays.toString(arr));
```

Output:

```text
[1, 2, 3, 5, 8]
```

---

# 🔽 Descending Order

For an `Integer[]` array, `Arrays.sort()` can use a comparator such as `Collections.reverseOrder()`.

```java
import java.util.Arrays;
import java.util.Collections;

Integer[] arr = {5, 2, 8, 1, 3};

Arrays.sort(arr, Collections.reverseOrder());

System.out.println(Arrays.toString(arr));
```

Output:

```text
[8, 5, 3, 2, 1]
```

### Important

`Collections.reverseOrder()` works with object types such as:

```java
Integer
Double
String
```

It does **not** work directly with primitive arrays such as:

```java
int[]
double[]
```

For a primitive `int[]`, sort first and then reverse manually if descending order is required.

---

# 📊 Sorting Algorithm Comparison

| Algorithm | Best Case | Average Case | Worst Case | Space |
|---|---:|---:|---:|---:|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) |
| Counting Sort | O(n + k) | O(n + k) | O(n + k) | O(k) |
| `Arrays.sort()` | Depends on array type/implementation | Efficient | Efficient | Depends on implementation |

> The exact behavior and complexity of Java's `Arrays.sort()` depend on the array type and Java implementation, so it should not be treated as one single sorting algorithm.

---

## 💻 Programs Practiced

- Bubble Sort
- Selection Sort
- Insertion Sort
- Counting Sort
- `Arrays.sort()`
- Ascending Order using `Arrays.sort()`
- Descending Order using `Collections.reverseOrder()`

---

## 🛠 Technologies Used

- Java
- JDK
- Visual Studio Code
- Terminal

---

## 📖 Key Learnings

- Sorting arranges data in a specific order.
- Bubble Sort compares adjacent elements.
- Selection Sort repeatedly selects the minimum element.
- Insertion Sort builds the sorted portion incrementally.
- Counting Sort uses element frequencies instead of comparisons.
- `Arrays.sort()` provides a convenient built-in sorting solution.
- `Collections.reverseOrder()` can be used with object arrays for descending order.
- The choice of sorting algorithm depends on the input and performance requirements.

---

## 🚀 Skills Developed

- Sorting Algorithms
- Array Manipulation
- Algorithm Analysis
- Time & Space Complexity
- Java Collections
- Problem Solving
- DSA Fundamentals

---

## 📈 Learning Outcome

By completing Day 10, I developed a stronger understanding of sorting algorithms and their implementation in Java.

I learned both **manual sorting techniques** and **Java's built-in sorting utilities**, while comparing their time and space complexities.

The progression covered:

```text
Bubble Sort
     ↓
Selection Sort
     ↓
Insertion Sort
     ↓
Counting Sort
     ↓
Java Inbuilt Sorting
```

---

**👨‍💻 Author:** Divankar Singh  
**🏢 Internship:** Java Development Internship – Internnova  
**📚 Day:** 10  
**📖 Module:** Sorting Algorithms  
**✅ Status:** Completed
