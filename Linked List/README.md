# 📅 Day 18 – Linked List in Java

## 🏢 Java Development Internship – Internnova

**Day:** 18  
**Module:** Linked List & Java Collections Framework  
**Language:** Java  
**Status:** ✅ Completed

---

## 📌 Overview

On Day 18 of my **Java Development Internship at Internnova**, I learned the fundamentals of **Linked Lists** and implemented different operations and problem-solving techniques using linked lists.

The module started with basic linked list operations such as creating nodes, maintaining `head` and `tail`, insertion, deletion, searching, and traversal. I then progressed to important interview problems including reversing a linked list, finding the Nth node from the end, palindrome checking, cycle detection and removal, merge sort, and Zig-Zag rearrangement.

I also explored **Doubly Linked Lists, Circular Linked Lists, and the Java Collections Framework**.

---

# 🎯 Learning Objectives

- Understand the concept of a Linked List.
- Understand nodes and references.
- Learn the role of `head` and `tail`.
- Insert nodes at different positions.
- Delete nodes from a Linked List.
- Traverse and print a Linked List.
- Calculate the size of a Linked List.
- Perform iterative and recursive searching.
- Reverse a Linked List.
- Find the Nth node from the end.
- Check whether a Linked List is a palindrome.
- Detect and remove cycles.
- Understand Floyd's Cycle Detection Algorithm.
- Apply Merge Sort to a Linked List.
- Rearrange a Linked List in Zig-Zag order.
- Understand Doubly Linked Lists.
- Reverse a Doubly Linked List.
- Understand Circular Linked Lists.
- Explore Linked Lists in the Java Collections Framework.

---

# 📚 Topics Covered

## 🔹 1. Introduction to Linked List

A Linked List is a linear data structure where elements are stored in **nodes**.

Each node generally contains:

```text
Data + Reference to Next Node
```

Conceptually:

```text
[10 | next] → [20 | next] → [30 | next] → null
   ↑
  Head
```

Unlike arrays, Linked Lists do not require elements to be stored in contiguous memory locations.

---

# 🔹 2. Node Structure

A basic Java node can be represented as:

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

The `next` reference stores the address/reference of the next node.

---

# 🔹 3. Head & Tail

A Linked List commonly maintains two important references:

```text
Head → First Node
Tail → Last Node
```

Example:

```text
Head
 ↓
10 → 20 → 30 → null
              ↑
             Tail
```

The `head` is used to access the beginning of the list.

The `tail` can be used to efficiently add a new node at the end.

---

# ➕ 4. Add First in Linked List

To add a new node at the beginning:

```text
Before:

10 → 20 → 30

After adding 5:

5 → 10 → 20 → 30
```

The new node becomes the new `head`.

General steps:

```text
Create new node
       ↓
newNode.next = head
       ↓
head = newNode
```

If the list was empty, both `head` and `tail` point to the new node.

---

# ➕ 5. Add Last in Linked List

To add a node at the end:

```text
Before:

10 → 20 → 30

After:

10 → 20 → 30 → 40
```

If a `tail` reference is maintained, insertion at the end can be performed efficiently.

---

# 🖨️ 6. Print a Linked List

Traversal starts from `head`.

```java
Node current = head;

while (current != null) {
    System.out.print(current.data + " ");
    current = current.next;
}
```

Example:

```text
10 → 20 → 30 → null
```

Output:

```text
10 20 30
```

---

# ➕ 7. Add in the Middle of Linked List

To insert a node at a particular position:

1. Start from the head.
2. Traverse to the node before the desired position.
3. Adjust the references.
4. Insert the new node.

Example:

```text
Before:

10 → 20 → 40

Insert 30

After:

10 → 20 → 30 → 40
```

The key operation is changing references without shifting all elements as in an array.

---

# 📏 8. Size of a Linked List

The size represents the number of nodes.

Example:

```text
10 → 20 → 30 → 40
```

Size:

```text
4
```

The size can be calculated by traversing the complete list.

---

# ❌ 9. Remove First in Linked List

To remove the first node:

```text
Before:

10 → 20 → 30

After:

20 → 30
```

The head is moved to the next node:

```java
head = head.next;
```

Special care is required when the list contains only one node.

---

# ❌ 10. Remove Last in Linked List

To remove the last node:

```text
Before:

10 → 20 → 30

After:

10 → 20
```

The second-last node becomes the new tail.

In a singly linked list, finding the second-last node generally requires traversal.

---

# 🔍 11. Iterative Search

Iterative search checks every node one by one.

Example:

```text
10 → 20 → 30 → 40

Search: 30
```

The algorithm moves from:

```text
10 → 20 → 30
```

and returns the position/index when the target is found.

### Complexity

```text
Time: O(n)
Space: O(1)
```

---

# 🔍 12. Recursive Search

Linked List searching can also be implemented recursively.

The function checks the current node and recursively searches the remaining list.

Conceptually:

```text
search(current.next)
```

### Complexity

```text
Time: O(n)
Space: O(n)
```

The additional space comes from the recursive call stack.

---

# 🔄 13. Reverse a Linked List

Reversing changes:

```text
10 → 20 → 30 → 40 → null
```

into:

```text
40 → 30 → 20 → 10 → null
```

The iterative approach uses three references:

```text
prev
curr
next
```

Conceptually:

```text
prev ← curr → next
```

The direction of the links is changed one node at a time.

### Complexity

```text
Time: O(n)
Space: O(1)
```

---

# 🎯 14. Find and Remove Nth Node from End

Given:

```text
10 → 20 → 30 → 40 → 50
```

If:

```text
n = 2
```

the 2nd node from the end is:

```text
40
```

A common optimized approach uses **two pointers**:

```text
fast
slow
```

The fast pointer is moved ahead by `n` positions.

Then both pointers move together.

When `fast` reaches the end, `slow` identifies the required node.

---

# 🔄 15. Check if Linked List is Palindrome

A Linked List is a palindrome if it reads the same forward and backward.

Example:

```text
1 → 2 → 3 → 2 → 1
```

This is a palindrome.

Example:

```text
1 → 2 → 3
```

This is not a palindrome.

An optimized approach can:

1. Find the middle.
2. Reverse the second half.
3. Compare both halves.

### Complexity

```text
Time: O(n)
Space: O(1)
```

---

# 🔁 16. Detecting Cycle in Linked List

A cycle occurs when a node points back to a previous node instead of `null`.

Example:

```text
1 → 2 → 3 → 4
        ↑     ↓
        ← ← ←
```

The list never reaches `null`.

---

# 🐢🐇 17. Floyd's Cycle Detection Algorithm

Floyd's algorithm uses two pointers:

```text
Slow → moves one step
Fast → moves two steps
```

If a cycle exists, the two pointers will eventually meet.

```text
slow = slow.next
fast = fast.next.next
```

### Complexity

```text
Time: O(n)
Space: O(1)
```

This is an important Linked List interview problem.

---

# ❌ 18. Removing a Cycle

Once a cycle is detected, the cycle can be removed by finding the node where the cycle begins and changing the appropriate `next` reference to `null`.

A common approach:

```text
Detect cycle
     ↓
Find cycle start
     ↓
Find last node of cycle
     ↓
Set its next = null
```

This converts the cyclic list back into a normal Linked List.

---

# 🧮 19. Why Floyd's Algorithm Works

Floyd's Cycle Detection uses a mathematical property of movement inside a cycle.

The slow pointer moves:

```text
1 step
```

while the fast pointer moves:

```text
2 steps
```

Once both pointers enter the cycle, the fast pointer gains one position per iteration relative to the slow pointer.

Therefore, they must eventually meet if a cycle exists.

---

# ☕ 20. Java Collections Framework

The **Java Collections Framework** provides reusable data structures and algorithms.

Important interfaces include:

```text
Collection
├── List
├── Set
└── Queue
```

Common implementations include:

```text
ArrayList
LinkedList
HashSet
TreeSet
PriorityQueue
```

---

# 🔗 21. LinkedList in Collections Framework

Java provides a built-in:

```java
java.util.LinkedList
```

Example:

```java
LinkedList<Integer> list = new LinkedList<>();

list.add(10);
list.add(20);
list.add(30);
```

It can be used as both:

- `List`
- `Deque`

Example:

```java
list.addFirst(5);
list.addLast(40);
```

---

# 🔀 22. Merge Sort on Linked List

Merge Sort is particularly suitable for Linked Lists because nodes can be rearranged by changing references.

The process is:

```text
Find Middle
     ↓
Split List
     ↓
Sort Left Half
     ↓
Sort Right Half
     ↓
Merge Sorted Halves
```

Example:

```text
4 → 2 → 1 → 3

       ↓

4 → 2       1 → 3

       ↓

2 → 4       1 → 3

       ↓

1 → 2 → 3 → 4
```

### Complexity

```text
Time: O(n log n)
Space: O(log n) recursion stack
```

---

# 🔀 23. Zig-Zag Linked List

Zig-Zag rearrangement changes the order of nodes to create an alternating pattern.

Example:

```text
1 → 2 → 3 → 4 → 5
```

can be rearranged as:

```text
1 → 5 → 2 → 4 → 3
```

A common approach is:

1. Find the middle.
2. Reverse the second half.
3. Merge both halves alternately.

Conceptually:

```text
First Half:
1 → 2 → 3

Second Half:
5 → 4

Merge:
1 → 5 → 2 → 4 → 3
```

---

# ↔️ 24. Doubly Linked List

A Doubly Linked List contains two references in every node:

```text
Previous ← Node → Next
```

Example:

```text
null ← 10 ⇄ 20 ⇄ 30 → null
```

Each node can move in both directions.

### Advantages

- Forward traversal.
- Backward traversal.
- Efficient deletion when the node reference is available.

### Disadvantage

Each node requires an additional `prev` reference.

---

# 🔄 25. Reverse a Doubly Linked List

For a Doubly Linked List, reversing requires swapping:

```text
prev
```

and

```text
next
```

references for each node.

Example:

```text
10 ⇄ 20 ⇄ 30
```

becomes:

```text
30 ⇄ 20 ⇄ 10
```

---

# 🔄 26. Circular Linked List

In a Circular Linked List, the last node points back to the first node.

Example:

```text
10 → 20 → 30
↑         ↓
└─────────┘
```

There is no `null` at the end.

Circular Linked Lists are useful in situations where data needs to be processed repeatedly in a cycle.

Examples include:

- Round-robin scheduling
- Circular buffers
- Repeated turn-based processing

---

# 📊 Complexity Summary

| Operation / Problem | Time Complexity | Space Complexity |
|---|---:|---:|
| Add First | O(1) | O(1) |
| Add Last with Tail | O(1) | O(1) |
| Add in Middle | O(n) | O(1) |
| Print Linked List | O(n) | O(1) |
| Find Size | O(n) | O(1) |
| Remove First | O(1) | O(1) |
| Remove Last | O(n) | O(1) |
| Iterative Search | O(n) | O(1) |
| Recursive Search | O(n) | O(n) |
| Reverse Linked List | O(n) | O(1) |
| Nth Node from End | O(n) | O(1) |
| Palindrome Check | O(n) | O(1) |
| Cycle Detection | O(n) | O(1) |
| Cycle Removal | O(n) | O(1) |
| Merge Sort on LL | O(n log n) | O(log n) |
| Zig-Zag Rearrangement | O(n) | O(1) |

---

# 💻 Problems Practiced

### Linked List Basics

- Introduction to Linked List
- Head & Tail in Linked List
- Add First
- Add Last
- Print Linked List
- Add in the Middle
- Size of Linked List
- Remove First
- Remove Last
- Iterative Search
- Recursive Search

### Linked List Problems

- Reverse a Linked List
- Find and Remove Nth Node from End
- Check if Linked List is Palindrome
- Detect Cycle in Linked List
- Remove Cycle in Linked List
- Mathematical Explanation of Cycle Detection
- Merge Sort on Linked List
- Zig-Zag Linked List

### Advanced Linked Lists

- Java Collections Framework
- Linked List in Collections Framework
- Doubly Linked List
- Reverse a Doubly Linked List
- Circular Linked List

---

# 🛠 Technologies Used

- **Java**
- **JDK**
- **Visual Studio Code**
- **Git & GitHub**
- **Java Collections Framework**


---

# 📖 Key Learnings

- Linked Lists consist of nodes connected through references.
- `head` points to the first node.
- `tail` points to the last node when maintained.
- Insertion and deletion can be efficient because elements do not need to be shifted.
- Searching in a Linked List requires sequential traversal.
- A Linked List can be reversed by changing node references.
- Two-pointer techniques are extremely useful for Linked List problems.
- Floyd's Cycle Detection Algorithm detects cycles using slow and fast pointers.
- Merge Sort provides efficient `O(n log n)` sorting for Linked Lists.
- Doubly Linked Lists support traversal in both directions.
- Circular Linked Lists connect the last node back to the first node.
- Java provides a built-in `LinkedList` implementation through the Collections Framework.

---

# 🚀 Skills Developed

- Linked List Implementation
- Node Manipulation
- Pointer / Reference Management
- Traversal
- Insertion & Deletion
- Iterative Searching
- Recursive Searching
- Two Pointer Technique
- Fast & Slow Pointer Technique
- Cycle Detection
- Cycle Removal
- Merge Sort
- Doubly Linked List
- Circular Linked List
- Java Collections Framework
- Time & Space Complexity
- DSA Problem Solving

---

# 📈 Learning Outcome

By completing Day 18, I developed a strong foundation in **Linked Lists and their applications in DSA**.

I progressed from implementing basic Linked List operations to solving interview-oriented problems such as palindrome checking, cycle detection, cycle removal, Merge Sort, and Zig-Zag rearrangement.

The learning progression was:

```text
Linked List Basics
       ↓
Head & Tail
       ↓
Insertion & Deletion
       ↓
Traversal & Searching
       ↓
Reverse Linked List
       ↓
Two Pointer Problems
       ↓
Palindrome
       ↓
Cycle Detection & Removal
       ↓
Merge Sort
       ↓
Zig-Zag Linked List
       ↓
Doubly Linked List
       ↓
Circular Linked List
       ↓
Java Collections Framework
```

---

## 📌 Internship Progress

| Day | Topic | Status |
|---:|---|---|
| 18 | Linked List & Collections Framework | ✅ Completed |

---

**👨‍💻 Author:** Divankar Singh  
**🏢 Internship:** Java Development Internship – Internnova  
**📚 Day:** 18  
**📖 Module:** Linked List  
**✅ Status:** Completed
