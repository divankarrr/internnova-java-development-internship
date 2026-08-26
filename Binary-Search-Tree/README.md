# Day 26 - Binary Search Trees

## 📌 Internnova Java Development Internship

**Day:** 26  
**Topic:** Binary Search Trees (BST)  
**Language:** Java  
**Internship:** Internnova Java Development Internship

---

## 🎯 Objective

The objective of Day 26 was to understand **Binary Search Trees (BST)**, their properties, operations, and different techniques used to solve problems involving BSTs.

---

## 📚 Topics Covered

- Introduction to Binary Search Trees
- Concept of Search in BST
- Build a BST
- Search in a BST
- Delete a Node
- Print in Range
- Root to Leaf Path
- Validate BST
- Mirror a BST
- Sorted Array to Balanced BST
- Convert BST to Balanced BST
- Size of Largest BST in BT
- Size of Largest BST in BT (Code)
- AVL Trees
- AVL Trees Reading Material
- Red Black Trees Reading Material

---

## 🌳 What is a Binary Search Tree?

A **Binary Search Tree (BST)** is a binary tree where:

- All nodes in the left subtree are smaller than the root.
- All nodes in the right subtree are greater than the root.
- Both left and right subtrees are also BSTs.

Example:

```text
        8
       / \
      5   10
     / \    \
    3   6    11
````

---

## 🔍 Search in BST

Searching in a BST is based on comparing the target value with the current node.

```text
Target < Current → Go Left
Target > Current → Go Right
Target = Current → Found
```

This avoids searching every node in a balanced BST.

---

## 🏗️ Build a BST

A BST can be constructed by inserting elements one by one.

For every element:

1. Compare it with the current node.
2. Move left if it is smaller.
3. Move right if it is greater.
4. Insert it when an empty position is found.

---

## 🗑️ Delete a Node

Deleting a node from a BST can involve three cases:

### Case 1: Leaf Node

Simply remove the node.

### Case 2: One Child

Replace the node with its child.

### Case 3: Two Children

Replace the node with an appropriate successor or predecessor and then delete that node.

---

## 📏 Print in Range

The **Print in Range** problem prints all BST nodes whose values lie between a given range.

The BST property allows us to avoid unnecessary traversal of some branches.

---

## 🌿 Root to Leaf Path

The Root to Leaf Path problem finds or prints the path from the root node to every leaf node.

Recursion is commonly used to maintain the current path while traversing the tree.

---

## ✅ Validate BST

To validate whether a binary tree is a valid BST, every node must satisfy the BST ordering property.

The validation can be performed by maintaining valid minimum and maximum ranges for each node.

---

## 🔄 Mirror a BST

Mirroring a BST means swapping the left and right children of every node.

Example:

```text
Original:

        5
       / \
      3   7

Mirror:

        5
       / \
      7   3
```

---

## 📊 Sorted Array to Balanced BST

A sorted array can be converted into a balanced BST by selecting the **middle element** as the root.

Then recursively:

* Use the left half for the left subtree.
* Use the right half for the right subtree.

This helps create a balanced tree.

---

## ⚖️ Convert BST to Balanced BST

An unbalanced BST can be converted into a balanced BST.

The general approach is:

1. Perform inorder traversal of the BST.
2. Store the elements in sorted order.
3. Construct a balanced BST using the middle element recursively.

---

## 🌳 Largest BST in a Binary Tree

The objective is to find the size of the **largest BST subtree** present inside a Binary Tree.

The solution requires checking:

* Minimum value
* Maximum value
* Size of subtree
* Whether the subtree is a valid BST

---

## 🌲 AVL Trees

An **AVL Tree** is a self-balancing Binary Search Tree.

It maintains balance by ensuring that the height difference between the left and right subtrees remains within an allowed range.

AVL Trees use rotations to maintain balance after insertion or deletion.

---

## 🔴 Red-Black Trees

A **Red-Black Tree** is another type of self-balancing Binary Search Tree.

It uses an additional color property for each node:

```text
Red
Black
```

The color rules help maintain approximately balanced tree height and efficient operations.

---

## ⏱️ Complexity Summary

| Operation | Average / Balanced BST | Worst Case |
| --------- | ---------------------: | ---------: |
| Search    |               O(log n) |       O(n) |
| Insert    |               O(log n) |       O(n) |
| Delete    |               O(log n) |       O(n) |
| Traversal |                   O(n) |       O(n) |

A balanced BST provides efficient searching, insertion, and deletion.

---

## 💡 Key Takeaways

1. A BST follows the **Left < Root < Right** property.
2. Searching in a BST uses comparisons to decide whether to move left or right.
3. BST insertion follows the ordering property.
4. Deletion has three major cases: leaf, one child, and two children.
5. BST traversal can be used to obtain elements in sorted order.
6. A sorted array can be converted into a balanced BST.
7. An unbalanced BST can be converted into a balanced BST.
8. A Binary Tree can contain BST subtrees.
9. AVL Trees maintain balance using rotations.
10. Red-Black Trees use node colors to maintain balance.

---

## 🚀 Day 26 Progress

**Day 26 Completed ✅**

### Skills Practiced

* Java
* Binary Search Trees
* BST Operations
* Recursion
* Searching
* Insertion
* Deletion
* Tree Validation
* Tree Traversal
* Balanced Trees
* AVL Trees
* Red-Black Trees
* Problem Solving
* Complexity Analysis

---

## 🔗 Connection With Previous Learning

On **Day 25**, I learned **Binary Trees**, including tree traversals, height, diameter, top view, Lowest Common Ancestor, and other tree-based problems.

On **Day 26**, I built upon those concepts and learned **Binary Search Trees**, focusing on efficient searching, insertion, deletion, validation, balancing, and advanced BST concepts.

---

## 📌 Final Takeaway

> **"Binary Search Trees provide an efficient way to organize and search data using the ordering property of the tree."**

Day 26 strengthened my understanding of **Binary Search Trees, BST operations, balanced trees, and advanced tree-based problem solving**.

---

**Internnova Java Development Internship — Day 26**

**#Java #DSA #BST #BinarySearchTree #Trees #AVLTree #Algorithms #DataStructures #Internship #Coding #LearningJourney**

```
```
