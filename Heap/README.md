# Day 28 - Priority Queues and Heaps

## 📌 Internship
**Internnova Java Development Internship**

## 🎯 Objective

The objective of Day 28 is to understand **Priority Queues and Heaps** in Java and learn how to implement and use them to solve different Data Structures and Algorithms problems efficiently.

## 📚 Topics Covered

- Introduction to Priority Queues
- Priority Queue in Java Collections Framework (JCF)
- Priority Queue for Objects
- Introduction to Heaps
- Heap Implementation using Complete Binary Tree (CBT)
- Insert in Heap
- Peek from Heap
- Remove from Heap
- Heap Sort
- Nearby Cars
- Connect N Ropes with Minimum Cost
- Weakest Soldier
- Sliding Window Maximum

## 🔹 Priority Queue

A **Priority Queue** is a data structure where elements are processed according to their priority instead of their insertion order.

In Java, `PriorityQueue` is available in the Collections Framework.

By default, Java's `PriorityQueue` works as a **Min Heap**, meaning the smallest element has the highest priority.

### Basic Operations

- `add()` / `offer()` → Insert an element
- `peek()` → View the highest-priority element
- `remove()` / `poll()` → Remove the highest-priority element
- `isEmpty()` → Check whether the queue is empty
- `size()` → Get the number of elements

## 🔹 Priority Queue for Objects

Priority Queues can also store custom objects.

For objects, we can define their priority using:

- `Comparable`
- `Comparator`

This allows objects to be arranged according to properties such as:

- Distance
- Cost
- Age
- Priority
- Value

## 🌳 Introduction to Heaps

A **Heap** is a complete binary tree that follows a specific ordering property.

There are two main types:

### Min Heap

The smallest element is present at the root.

```text
        10
       /  \
      20   30
     / \
    40  50
````

### Max Heap

The largest element is present at the root.

```text
        50
       /  \
      40   30
     / \
    20  10
```

## 🔹 Complete Binary Tree (CBT)

A Complete Binary Tree is a binary tree in which:

* All levels are completely filled except possibly the last level.
* The last level is filled from left to right.

Heaps are generally implemented using arrays because their complete binary tree structure allows efficient indexing.

### Array Representation

For an element at index `i`:

* Left Child = `2 * i + 1`
* Right Child = `2 * i + 2`
* Parent = `(i - 1) / 2`

## ➕ Insert in Heap

To insert an element:

1. Add the element at the end of the heap.
2. Compare it with its parent.
3. Swap if the heap property is violated.
4. Continue until the correct position is found.

This process is called **Heapify Up** or **Sift Up**.

### Time Complexity

`O(log n)`

## 👀 Peek from Heap

The **peek** operation returns the root element without removing it.

* Min Heap → Minimum element
* Max Heap → Maximum element

### Time Complexity

`O(1)`

## ❌ Remove from Heap

To remove the root element:

1. Replace the root with the last element.
2. Remove the last element.
3. Compare the new root with its children.
4. Swap with the appropriate child.
5. Continue until the heap property is restored.

This process is called **Heapify Down** or **Sift Down**.

### Time Complexity

`O(log n)`

## 🔃 Heap Sort

Heap Sort is a comparison-based sorting algorithm that uses a heap.

### Steps

1. Build a heap from the given elements.
2. Repeatedly remove the root element.
3. Place the removed element in its correct position.
4. Continue until all elements are sorted.

### Complexity

* Time Complexity: `O(n log n)`
* Space Complexity: `O(1)` for in-place implementation

## 🚗 Nearby Cars

Priority Queues can be used to find the **nearest cars** efficiently.

The distance of each car from the origin can be calculated using:

`Distance² = x² + y²`

A Priority Queue can then prioritize cars based on their distance.

### Key Idea

Smaller distance → Higher priority.

## 🪢 Connect N Ropes with Minimum Cost

Given several ropes, the goal is to connect all ropes with **minimum total cost**.

### Approach

1. Insert all rope lengths into a Min Heap.
2. Remove the two smallest ropes.
3. Add their lengths.
4. Add this cost to the total cost.
5. Insert the combined rope back into the heap.
6. Repeat until only one rope remains.

### Complexity

`O(n log n)`

## 🪖 Weakest Soldier

Priority Queues can be used to identify the weakest soldiers based on the number of soldiers present in each row.

### Approach

1. Count the number of soldiers in each row.
2. Store the row number and soldier count.
3. Use a Priority Queue to prioritize rows with fewer soldiers.
4. Extract the weakest rows according to the required number.

## 🪟 Sliding Window Maximum

The **Sliding Window Maximum** problem asks us to find the maximum element in every window of size `k`.

A Priority Queue can be used to efficiently keep track of the largest element in the current window.

### Key Idea

For every window:

* Add elements to the Priority Queue.
* Remove elements that are outside the current window.
* The highest-priority element represents the maximum.

## 🧠 Key Concepts Learned

* Priority Queue provides elements according to priority.
* Java provides `PriorityQueue` through the Collections Framework.
* Heaps are complete binary trees.
* Min Heap keeps the minimum element at the root.
* Max Heap keeps the maximum element at the root.
* Heap insertion uses Heapify Up.
* Heap deletion uses Heapify Down.
* Peek operation takes `O(1)`.
* Insert and Remove operations take `O(log n)`.
* Priority Queues are useful for optimization problems.

## ⏱️ Complexity Summary

| Operation  | Time Complexity |
| ---------- | --------------- |
| Peek       | `O(1)`          |
| Insert     | `O(log n)`      |
| Remove     | `O(log n)`      |
| Build Heap | `O(n)`          |
| Heap Sort  | `O(n log n)`    |

## 💻 Java Concepts Used

* `PriorityQueue`
* `Comparable`
* `Comparator`
* Collections Framework
* Custom Objects
* Complete Binary Tree
* Min Heap
* Max Heap



## 📈 Day 28 Progress

* [x] Learned Priority Queue
* [x] Practiced Priority Queue in JCF
* [x] Learned Priority Queue with Objects
* [x] Learned Heap Data Structure
* [x] Understood Complete Binary Tree
* [x] Implemented Heap Insertion
* [x] Implemented Heap Peek
* [x] Implemented Heap Removal
* [x] Learned Heap Sort
* [x] Practiced Nearby Cars
* [x] Practiced Connect N Ropes with Minimum Cost
* [x] Practiced Weakest Soldier
* [x] Studied Sliding Window Maximum

## 🔗 Connection with Previous Topics

Day 28 builds upon the tree and data structure concepts learned in previous days.

**Day 27:** AVL Trees
**Day 28:** Priority Queues and Heaps

Heaps provide an efficient way to maintain priority and are widely used in algorithms involving minimum/maximum elements.

## 🚀 Key Takeaway

Priority Queues and Heaps are important data structures for efficiently managing elements based on priority. They are widely used in **sorting, greedy algorithms, scheduling, graph algorithms, and optimization problems**.

## 🏷️ Tags

#Java #DSA #Heap #PriorityQueue #HeapSort #DataStructures #Algorithms #Internnova #JavaDevelopment #Day28

```
```
