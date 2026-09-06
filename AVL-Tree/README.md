# Day 27 - AVL Tree Insertion and Deletion

## 📌 Internship
**Internnova Java Development Internship**

## 🎯 Objective

The objective of Day 27 is to understand **AVL Trees**, a type of self-balancing Binary Search Tree, and learn how to perform **Insertion and Deletion** while maintaining the balance of the tree.

## 📚 Topics Covered

- Introduction to AVL Trees
- Self-Balancing Binary Search Tree
- Balance Factor
- AVL Tree Insertion
- AVL Tree Deletion
- Left Rotation
- Right Rotation
- Left-Right Rotation
- Right-Left Rotation
- Maintaining AVL Tree Balance
- Time Complexity

## 🌳 What is an AVL Tree?

An **AVL Tree** is a self-balancing Binary Search Tree where the difference between the heights of the left and right subtrees of every node is at most `1`.

### Balance Factor

The balance factor of a node is calculated as:

`Balance Factor = Height(Left Subtree) - Height(Right Subtree)`

A node is balanced when its balance factor is:

`-1, 0, or 1`

If the balance factor becomes less than `-1` or greater than `1`, rotations are performed to balance the tree.

## 🔹 AVL Tree Insertion

The steps for insertion are:

1. Insert the new node using normal BST insertion.
2. Update the height of each node.
3. Calculate the balance factor.
4. Check whether the node has become unbalanced.
5. Perform the required rotation.

### Four Rotation Cases

| Case | Condition | Rotation |
|------|-----------|----------|
| LL | Left subtree of Left child | Right Rotation |
| RR | Right subtree of Right child | Left Rotation |
| LR | Right subtree of Left child | Left Rotation + Right Rotation |
| RL | Left subtree of Right child | Right Rotation + Left Rotation |

## 🔄 Right Rotation

Used mainly for the **LL case**.

```text
        y
       / \
      x   T3
     / \
    T1 T2

        ↓ Right Rotation

        x
       / \
      T1  y
         / \
        T2 T3
````

## 🔄 Left Rotation

Used mainly for the **RR case**.

```text
      x
     / \
    T1  y
       / \
      T2 T3

        ↓ Left Rotation

        y
       / \
      x  T3
     / \
    T1 T2
```

## 🔹 AVL Tree Deletion

Deletion in an AVL Tree is similar to deletion in a normal BST.

### Steps

1. Find the node to be deleted.
2. Delete the node using BST deletion rules.
3. Handle:

   * Leaf node
   * Node with one child
   * Node with two children
4. Update the height of affected nodes.
5. Calculate the balance factor.
6. Perform rotations if the tree becomes unbalanced.

After deletion, the tree must again satisfy the AVL balance condition.

## 🧠 Key Concepts Learned

* AVL Trees are self-balancing BSTs.
* Every node must have a balance factor of `-1`, `0`, or `1`.
* Rotations are used to restore balance.
* There are four important rotation cases:

  * LL
  * RR
  * LR
  * RL
* Both insertion and deletion may require rotations.
* AVL Trees maintain a height of approximately `O(log n)`.

## ⏱️ Time Complexity

| Operation   | Time Complexity |
| ----------- | --------------- |
| Search      | `O(log n)`      |
| Insertion   | `O(log n)`      |
| Deletion    | `O(log n)`      |
| Rotation    | `O(1)`          |
| Tree Height | `O(log n)`      |

## 💻 Implementation

The AVL Tree implementation is written in **Java** and includes:

* Node creation
* Height calculation
* Balance factor calculation
* Left rotation
* Right rotation
* Insertion
* Deletion
* Inorder traversal



## 📈 Day 27 Progress

* [x] Learned AVL Tree concept
* [x] Understood Balance Factor
* [x] Learned AVL Insertion
* [x] Learned AVL Deletion
* [x] Implemented Left Rotation
* [x] Implemented Right Rotation
* [x] Understood LL, RR, LR and RL cases
* [x] Practiced maintaining tree balance

## 🔗 Connection with Previous Topics

Day 27 builds on the **Binary Search Tree (BST)** concepts learned previously.

### BST

A normal BST does not automatically maintain balance.

### AVL Tree

An AVL Tree automatically maintains balance using rotations, resulting in efficient:

* Searching
* Insertion
* Deletion

## 🚀 Key Takeaway

AVL Trees improve upon normal Binary Search Trees by automatically maintaining balance. Understanding **balance factors and rotations** is essential for implementing efficient self-balancing trees.

## 🏷️ Tags

#Java #DSA #AVLTree #BinarySearchTree #Trees #DataStructures #Algorithms #JavaDevelopment #Internnova #Day27

```

