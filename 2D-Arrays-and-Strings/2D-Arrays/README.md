# 📅 Day 11 – 2D Arrays in Java

## 📌 Overview

On Day 11 of my **Java Development Internship at Internnova**, I focused on **2D Arrays** and their practical applications in Java.

The module covered the representation and creation of 2D arrays, their memory structure, real-life applications, and important matrix-based problems. I also practiced **Spiral Matrix, Diagonal Sum, and Searching in a Sorted Matrix**.

---

## 🎯 Learning Objectives

- Understand the concept of 2D arrays.
- Learn real-life applications of 2D arrays.
- Understand how 2D arrays are represented in Java.
- Learn how to create and initialize 2D arrays.
- Understand how 2D arrays are stored in memory.
- Traverse a matrix using rows and columns.
- Print a matrix in spiral order.
- Calculate the diagonal sum of a matrix.
- Search for an element in a sorted matrix.
- Improve matrix-based problem-solving skills.

---

## 📚 Topics Covered

### 🔹 1. Introduction to 2D Arrays

A 2D array is an array containing multiple arrays and is commonly used to represent data in rows and columns.

Example:

```text
1  2  3
4  5  6
7  8  9
```

---

### 🔹 2. Real-Life Examples

2D arrays can represent:

- Matrices
- Tables
- Chess boards
- Game grids
- Seating arrangements
- Student marks
- Images and pixels
- Maps and grids

Example:

```text
Student Marks

       Java  DBMS  OS
Aman    85    78   90
Rahul   72    88   81
```

---

### 🔹 3. Representation of 2D Arrays

A 2D array uses two indexes:

```java
arr[row][column]
```

Example:

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Accessing an element:

```java
matrix[1][2]
```

Output:

```text
6
```

---

### 🔹 4. Creation of 2D Arrays

A 2D array can be created using:

```java
int[][] matrix = new int[3][3];
```

This creates a matrix containing:

```text
3 rows × 3 columns
```

Elements can then be assigned using:

```java
matrix[0][0] = 10;
matrix[0][1] = 20;
```

---

### 🔹 5. 2D Arrays in Memory

Java represents a 2D array as an **array of arrays**.

Conceptually:

```text
matrix
   |
   +----> Row 0 → [1][2][3]
   |
   +----> Row 1 → [4][5][6]
   |
   +----> Row 2 → [7][8][9]
```

Each row is a separate array object.

This also means Java supports **jagged arrays**, where different rows can have different lengths.

Example:

```java
int[][] arr = new int[3][];

arr[0] = new int[2];
arr[1] = new int[4];
arr[2] = new int[3];
```

---

# 🌀 6. Spiral Matrix

A Spiral Matrix problem requires traversing the matrix in spiral order.

Example:

```text
Input:

1  2  3
4  5  6
7  8  9
```

Spiral traversal:

```text
1 2 3 6 9 8 7 4 5
```

### Approach

Maintain four boundaries:

```text
top
bottom
left
right
```

Then repeatedly traverse:

```text
Left → Right
Top → Bottom
Right → Left
Bottom → Top
```

until all elements are processed.

### Complexity

```text
Time Complexity: O(n × m)
Space Complexity: O(1)
```

---

# ➕ 7. Diagonal Sum

The diagonal sum problem calculates the sum of the primary and secondary diagonals of a square matrix.

Example:

```text
1  2  3
4  5  6
7  8  9
```

Primary diagonal:

```text
1 + 5 + 9
```

Secondary diagonal:

```text
3 + 5 + 7
```

The center element should not be counted twice.

### Complexity

```text
Time Complexity: O(n)
Space Complexity: O(1)
```

for an `n × n` matrix.

---

# 🔍 8. Search in Sorted Matrix

A sorted matrix can be searched more efficiently than checking every element.

Example:

```text
10 20 30
15 25 35
27 29 37
```

If the matrix is sorted appropriately by rows and columns, we can use the **staircase search** approach.

### Basic Idea

Start from the **top-right corner**:

```text
10 20 [30]
15 25 35
27 29 37
```

If:

```text
current > target
```

move left.

If:

```text
current < target
```

move down.

If:

```text
current == target
```

the element is found.

### Complexity

```text
Time Complexity: O(n + m)
Space Complexity: O(1)
```

for an `n × m` matrix.

---

# 📊 Complexity Summary

| Problem | Time Complexity | Space Complexity |
|---|---:|---:|
| Matrix Traversal | O(n × m) | O(1) |
| Spiral Matrix | O(n × m) | O(1) |
| Diagonal Sum | O(n) | O(1) |
| Search in Sorted Matrix | O(n + m) | O(1) |

---

## 💻 Problems Practiced

- Introduction to 2D Arrays
- Real-Life Applications of 2D Arrays
- Representation of 2D Arrays
- Creation of 2D Arrays
- Understanding 2D Arrays in Memory
- Spiral Matrix
- Spiral Matrix Implementation
- Diagonal Sum
- Search in Sorted Matrix
- Search in Sorted Matrix Implementation

---

## 🛠 Technologies Used

- Java
- JDK
- Visual Studio Code
- Terminal


---

## 📖 Key Learnings

- A 2D array in Java is an **array of arrays**.
- 2D arrays are useful for representing grid-based data.
- Matrix elements are accessed using row and column indexes.
- Java supports both rectangular and jagged 2D arrays.
- Spiral traversal can be implemented using four boundaries.
- Diagonal problems require careful handling of the center element.
- A sorted matrix can be searched efficiently using the staircase approach.
- Understanding matrix structure is important for DSA and coding interviews.

---

## 🚀 Skills Developed

- 2D Array Manipulation
- Matrix Traversal
- Nested Loops
- Boundary-Based Traversal
- Matrix Searching
- Algorithm Optimization
- Time & Space Complexity
- Problem Solving

---

## 📈 Learning Outcome

By completing Day 11, I strengthened my understanding of **2D arrays and matrix-based algorithms**.

I learned how 2D arrays are represented and stored in Java and practiced important interview-oriented problems such as **Spiral Matrix, Diagonal Sum, and Search in a Sorted Matrix**.

---

**👨‍💻 Author:** Divankar Singh  
**🏢 Internship:** Java Development Internship – Internnova  
**📚 Day:** 11  
**📖 Module:** 2D Arrays  
**✅ Status:** Completed
