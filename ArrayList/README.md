# 📅 Day 17 – ArrayList & ArrayList Problems in Java

## 🏢 Java Development Internship – Internnova

**Day:** 17  
**Module:** ArrayList & 2-Pointer Problems  
**Language:** Java  
**Status:** ✅ Completed

---

## 📌 Overview

On Day 17 of my **Java Development Internship at Internnova**, I learned about **ArrayList in Java** and practiced common operations and problem-solving techniques using ArrayLists.

The module covered the creation and manipulation of ArrayLists, their size, reversing and sorting elements, finding maximum values, swapping elements, multidimensional ArrayLists, and important array problems using the **Two Pointer Approach**.

The major problem-solving topics included:

- ArrayList
- ArrayList Operations
- ArrayList Implementation
- Multi-dimensional ArrayLists
- Container With Most Water
- Pair Sum
- Brute Force Approach
- Two Pointer Approach

---

# 🎯 Learning Objectives

- Understand the `ArrayList` class in Java.
- Learn how ArrayLists differ from traditional arrays.
- Perform basic operations on ArrayLists.
- Add, remove, update, and access elements.
- Understand the `size()` method.
- Traverse an ArrayList.
- Reverse an ArrayList.
- Find the maximum element.
- Swap elements in an ArrayList.
- Sort an ArrayList.
- Understand the internal implementation concept of ArrayList.
- Work with multidimensional ArrayLists.
- Solve Container With Most Water.
- Understand the Two Pointer technique.
- Solve Pair Sum using different approaches.
- Compare brute force and optimized solutions.

---

# 📚 Topics Covered

## 🔹 1. Introduction to ArrayList

`ArrayList` is a resizable array implementation provided by Java's Collections Framework.

Unlike a normal array, an ArrayList can dynamically grow and shrink.

Import:

```java
import java.util.ArrayList;
```

Creating an ArrayList:

```java
ArrayList<Integer> list = new ArrayList<>();
```

Adding elements:

```java
list.add(10);
list.add(20);
list.add(30);
```

Output:

```text
[10, 20, 30]
```

---

# 🔹 2. Operations on ArrayList

Common ArrayList operations include:

### Add

```java
list.add(10);
```

### Get

```java
list.get(0);
```

### Set / Update

```java
list.set(0, 50);
```

### Remove

```java
list.remove(1);
```

### Contains

```java
list.contains(20);
```

### Clear

```java
list.clear();
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

System.out.println(list.get(1));

list.set(1, 50);

System.out.println(list);
```

---

# 🔹 3. Size of ArrayList

The number of elements in an ArrayList can be obtained using:

```java
list.size();
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

System.out.println(list.size());
```

Output:

```text
3
```

### Important

For arrays:

```java
arr.length
```

For ArrayList:

```java
list.size()
```

---

# 🔄 4. Print Reverse of an ArrayList

An ArrayList can be traversed from the last index to the first.

Example:

```text
Original:
10 20 30 40 50

Reverse:
50 40 30 20 10
```

Implementation:

```java
for (int i = list.size() - 1; i >= 0; i--) {
    System.out.print(list.get(i) + " ");
}
```

---

# 🔝 5. Find Maximum in ArrayList

To find the maximum element, traverse the list and maintain the largest value found so far.

Example:

```text
ArrayList:
10 45 23 89 34

Maximum:
89
```

Java also provides:

```java
Collections.max(list);
```

Example:

```java
int max = Collections.max(list);
```

---

# 🔄 6. Swap Two Numbers

Elements in an ArrayList can be swapped using:

```java
Collections.swap(list, i, j);
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

Collections.swap(list, 0, 2);
```

Result:

```text
[30, 20, 10]
```

---

# 📊 7. Sorting an ArrayList

ArrayLists can be sorted using:

```java
Collections.sort(list);
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(40);
list.add(10);
list.add(30);
list.add(20);

Collections.sort(list);

System.out.println(list);
```

Output:

```text
[10, 20, 30, 40]
```

### Descending Order

```java
Collections.sort(list, Collections.reverseOrder());
```

Output:

```text
[40, 30, 20, 10]
```

---

# 🧱 8. ArrayList Implementation in Java

`ArrayList` internally uses a dynamically resizable array.

Conceptually:

```text
ArrayList
    ↓
Dynamic Array
    ↓
Elements stored in contiguous storage
```

When the internal capacity becomes insufficient, Java creates a larger array and copies the elements.

Important characteristics:

- Maintains insertion order.
- Allows duplicate elements.
- Allows `null`.
- Provides fast random access using indexes.
- Automatically grows when required.
- Stores objects rather than primitive types.

Therefore, wrapper classes are used:

```java
ArrayList<Integer>
ArrayList<Double>
ArrayList<Character>
```

instead of:

```java
ArrayList<int>
```

---

# 🔢 9. Multi-dimensional ArrayLists

ArrayLists can also be used to represent multiple dimensions.

Example:

```java
ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
```

Creating rows:

```java
ArrayList<Integer> row1 = new ArrayList<>();
row1.add(1);
row1.add(2);
row1.add(3);

matrix.add(row1);
```

Example matrix:

```text
1 2 3
4 5 6
7 8 9
```

Conceptually:

```text
ArrayList
   |
   ├── Row 1 → [1, 2, 3]
   ├── Row 2 → [4, 5, 6]
   └── Row 3 → [7, 8, 9]
```

---

# 🌊 10. Container With Most Water

The **Container With Most Water** problem asks us to find two vertical lines that can contain the maximum amount of water.

Example:

```text
       |
   |   |
   | | |
   | | |
   | | |
----------------
```

The amount of water between two lines is:

```text
Area = width × minimum height
```

Formula:

```text
Area = (right - left) × min(height[left], height[right])
```

---

# 🐢 11. Container With Most Water – Brute Force

The brute force approach checks every possible pair of lines.

For every:

```text
i < j
```

calculate:

```text
width = j - i
height = min(height[i], height[j])
area = width × height
```

Keep track of the maximum area.

### Complexity

```text
Time Complexity: O(n²)
Space Complexity: O(1)
```

---

# ⚡ 12. Container With Most Water – Two Pointer Approach

The brute force solution can be optimized using **Two Pointers**.

Initialize:

```text
left = 0
right = n - 1
```

Calculate the area between the two pointers.

Then move the pointer pointing to the smaller height.

Why?

Because the container's height is limited by the smaller line.

### Algorithm

```text
left = 0
right = n - 1

while left < right:

    calculate area

    update maximum

    if height[left] < height[right]:
        left++
    else:
        right--
```

### Complexity

```text
Time Complexity: O(n)
Space Complexity: O(1)
```

This is a major improvement over the brute force approach.

---

# 🔄 13. Container With Most Water vs Trapping Rainwater

Both problems involve heights and water, but they use different approaches.

| Problem | Main Technique |
|---|---|
| Container With Most Water | Two Pointer |
| Trapping Rainwater | Prefix/Suffix / Two Pointer / Stack |

### Container With Most Water

Uses two selected boundaries:

```text
width × minimum height
```

### Trapping Rainwater

Calculates water trapped above multiple bars:

```text
min(leftMax, rightMax) - height[i]
```

Understanding the difference is important for DSA interviews.

---

# 🔢 14. Pair Sum – Brute Force

The Pair Sum problem asks us to find two elements whose sum equals a target.

Example:

```text
Array:
2 7 11 15

Target:
9
```

Answer:

```text
2 + 7 = 9
```

### Brute Force Approach

Check every possible pair:

```text
i = 0
j = i + 1
```

Calculate:

```text
arr[i] + arr[j]
```

### Complexity

```text
Time Complexity: O(n²)
Space Complexity: O(1)
```

---

# ⚡ 15. Pair Sum – Two Pointer Approach

If the ArrayList is sorted, Pair Sum can be solved efficiently using two pointers.

Initialize:

```text
left = 0
right = n - 1
```

Calculate:

```text
sum = list[left] + list[right]
```

Then:

### If sum == target

Pair found.

### If sum < target

Increase `left`.

### If sum > target

Decrease `right`.

Example:

```text
2 7 11 15
↑        ↑
L        R
```

Target:

```text
9
```

```text
2 + 15 = 17
```

Too large → move `right`.

```text
2 + 11 = 13
```

Too large → move `right`.

```text
2 + 7 = 9
```

Pair found.

### Complexity

```text
Time Complexity: O(n)
Space Complexity: O(1)
```

---

# 🧠 16. Two Pointer Technique

The **Two Pointer** technique uses two indexes to reduce unnecessary comparisons.

Common pattern:

```text
left  → 
right ←
```

The pointers move according to the problem's conditions.

It is frequently used in:

- Sorted arrays
- Pair Sum
- Container With Most Water
- Palindrome problems
- Removing duplicates
- Partitioning problems

The major benefit is reducing many brute-force `O(n²)` solutions to `O(n)`.

---

# 📊 Complexity Comparison

| Problem | Approach | Time | Space |
|---|---|---:|---:|
| Container With Most Water | Brute Force | O(n²) | O(1) |
| Container With Most Water | Two Pointer | O(n) | O(1) |
| Pair Sum | Brute Force | O(n²) | O(1) |
| Pair Sum | Two Pointer | O(n) | O(1) |

---

# 💻 Problems Practiced

### ArrayList

- Introduction to ArrayList
- Operations on ArrayList
- Size of ArrayList
- Print Reverse
- Find Maximum
- Swap Two Numbers
- Sorting an ArrayList
- ArrayList Implementation in Java
- Multi-dimensional ArrayLists

### Problem Solving

- Container With Most Water – Brute Force
- Container With Most Water – Two Pointer Approach
- Container With Most Water vs Trapping Rainwater
- Pair Sum – Brute Force
- Pair Sum – Two Pointer Approach
- Pair Sum – Optimized Approach

---

# 🛠 Technologies Used

- **Java**
- **JDK**
- **Visual Studio Code**
- **Git & GitHub**


---

# 📖 Key Learnings

- `ArrayList` provides a dynamically resizable collection.
- ArrayLists support operations such as add, remove, get, set, and contains.
- `size()` returns the number of elements.
- `Collections.sort()` can sort an ArrayList.
- `Collections.reverseOrder()` can be used for descending order.
- `Collections.swap()` can exchange two elements.
- ArrayLists can be nested to create multidimensional structures.
- Brute force solutions are often simple but may have higher time complexity.
- The Two Pointer technique can significantly optimize certain array problems.
- Container With Most Water can be solved in `O(n)` using two pointers.
- Pair Sum can be solved in `O(n)` using two pointers when the input is sorted.
- Choosing the right algorithm can make a major difference in performance.

---

# 🚀 Skills Developed

- Java Collections Framework
- ArrayList
- Dynamic Arrays
- Multidimensional ArrayLists
- Array Manipulation
- Two Pointer Technique
- Brute Force Problem Solving
- Algorithm Optimization
- Time Complexity
- Space Complexity
- DSA Problem Solving

---

# 📈 Learning Outcome

By completing Day 17, I developed a better understanding of **Java's ArrayList and its practical applications in DSA**.

I learned how to manipulate ArrayLists efficiently and how to identify opportunities to replace brute-force solutions with optimized **Two Pointer approaches**.

The learning progression was:

```text
ArrayList Basics
       ↓
ArrayList Operations
       ↓
Searching & Sorting
       ↓
Multidimensional ArrayLists
       ↓
Brute Force
       ↓
Two Pointer Technique
       ↓
Container With Most Water
       ↓
Pair Sum
       ↓
Algorithm Optimization
```

---

## 📌 Internship Progress

| Day | Topic | Status |
|---:|---|---|
| 17 | ArrayList & Two Pointer Problems | ✅ Completed |

---

**👨‍💻 Author:** Divankar Singh  
**🏢 Internship:** Java Development Internship – Internnova  
**📚 Day:** 17  
**📖 Module:** ArrayList & Problem Solving  
**✅ Status:** Completed
