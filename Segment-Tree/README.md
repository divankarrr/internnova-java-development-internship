
# Day 31 - Segment Trees

## 📌 Internship
**Internnova Java Development Internship**

## 🎯 Objective

The objective of Day 31 is to understand **Segment Trees** and learn how to create, query, and update a Segment Tree efficiently.

## 📚 Topics Covered

- Segment Trees Introduction
- Count & Meaning of Nodes
- Creation of Segment Tree
- Queries on Segment Tree
- Update on Segment Tree
- Max/Min Segment Tree - Creation
- Max/Min Segment Tree - Query/Update

## 🌳 What is a Segment Tree?

A **Segment Tree** is a tree-based data structure used to efficiently perform range-based queries and updates on an array.

It is useful for problems where we need to repeatedly perform:

- Range Queries
- Range Updates
- Minimum Queries
- Maximum Queries

## 🔢 Count & Meaning of Nodes

A Segment Tree represents different segments or ranges of an array.

Each node represents a particular range of the original array.

For an array of size `n`, a Segment Tree can be implemented using an array with sufficient space to store all the required nodes.

## 🏗️ Creation of Segment Tree

The Segment Tree is built recursively.

### Basic Steps

1. Start with the complete array range.
2. Divide the range into two halves.
3. Recursively build the left and right segments.
4. Store the required information at the current node.
5. Continue until reaching individual elements.

## 🔍 Queries on Segment Tree

Segment Trees allow efficient range queries.

A query generally checks whether the required range:

- Completely overlaps the current segment
- Partially overlaps the current segment
- Does not overlap the current segment

The required values are then combined to produce the final answer.

## 🔄 Update on Segment Tree

When an element of the original array changes, the corresponding Segment Tree nodes must also be updated.

### Basic Steps

1. Find the position of the updated element.
2. Update the corresponding leaf node.
3. Move upward through the tree.
4. Recalculate the values of affected parent nodes.

## 📈 Max/Min Segment Tree

A Segment Tree can be designed to store either:

- Maximum value
- Minimum value

For a **Max Segment Tree**, each node stores the maximum value of its range.

For a **Min Segment Tree**, each node stores the minimum value of its range.

### Example

For:


Array = [2, 5, 1, 7]


A Max Segment Tree stores the maximum value for every represented range.

A Min Segment Tree stores the minimum value for every represented range.

## 🔎 Max/Min Query

Once the tree is created, we can query a specific range to find:

* Maximum element in the range
* Minimum element in the range

The query is performed recursively by checking the relationship between the requested range and the current tree segment.

## 🔄 Max/Min Update

When an array element changes:

1. Update the corresponding leaf.
2. Recalculate affected parent nodes.
3. Continue until reaching the root.

This keeps the Segment Tree consistent with the updated array.

## 🧠 Key Concepts Learned

* Segment Tree
* Range Representation
* Tree Node Meaning
* Recursive Tree Creation
* Range Queries
* Tree Updates
* Maximum Segment Tree
* Minimum Segment Tree
* Recursive Query Processing
* Recursive Update Processing

## ⏱️ Complexity

For a Segment Tree:

| Operation | Time Complexity |
| --------- | --------------- |
| Creation  | `O(n)`          |
| Query     | `O(log n)`      |
| Update    | `O(log n)`      |

## 💻 Java Concepts Used

* Arrays
* Recursion
* Binary Trees
* Methods
* Range Queries
* Tree Construction
* Tree Updates


## 📈 Day 31 Progress

* [x] Learned Segment Tree Introduction
* [x] Understood Count & Meaning of Nodes
* [x] Learned Segment Tree Creation
* [x] Practiced Queries on Segment Tree
* [x] Practiced Updates on Segment Tree
* [x] Learned Max Segment Tree
* [x] Learned Min Segment Tree
* [x] Practiced Max/Min Queries
* [x] Practiced Max/Min Updates

## 🔗 Connection with Previous Topics

Day 31 continues the Data Structures and Algorithms journey after studying:

* AVL Trees
* Heaps
* Tries
* Graphs
* Dynamic Programming

Segment Trees provide an efficient way to solve problems involving **range queries and updates**.

## 🚀 Key Takeaway

Segment Trees are powerful data structures for efficiently handling **range queries and updates**. They are especially useful when an array is frequently updated and queried over different ranges.

## 🏷️ Tags

#Java #DSA #SegmentTree #DataStructures #Algorithms #RangeQuery #Recursion #Internnova #JavaDevelopment #Day31

