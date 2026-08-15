# Day 21 - Stacks

## 📌 Internnova Java Development Internship

**Day:** 21
**Topic:** Stacks
**Language:** Java
**Internship:** Internnova Java Development Internship

---

## 🎯 Objective

The objective of Day 21 was to understand the **Stack data structure** and its applications in solving common Data Structures and Algorithms problems.

The session focused on implementing stacks using different data structures and applying stacks to problems involving strings, parentheses, spans, and next greater elements.

---

## 📚 Topics Covered

### 1. Stack Introduction

A **Stack** is a linear data structure that follows the:

> **LIFO — Last In, First Out**

The element inserted last is removed first.

### Basic Operations

* `push()` → Adds an element to the top.
* `pop()` → Removes the top element.
* `peek()` → Returns the top element without removing it.
* `isEmpty()` → Checks whether the stack is empty.

Example:

```text
Push: 10
Push: 20
Push: 30

Stack:

30 ← Top
20
10
```

After `pop()`:

```text
20 ← Top
10
```

---

## 🧱 2. Stack Using ArrayList

A stack can be implemented using Java's `ArrayList`.

The end of the `ArrayList` can be treated as the top of the stack.

Example:

```java
ArrayList<Integer> stack = new ArrayList<>();

stack.add(10);
stack.add(20);
stack.add(30);

int top = stack.get(stack.size() - 1);

stack.remove(stack.size() - 1);
```

Typical complexity:

```text
Push   → O(1) amortized
Pop    → O(1)
Peek   → O(1)
```

---

## 🔗 3. Stack Using Linked List

A stack can also be implemented using a Linked List.

The head of the linked list can represent the top of the stack.

Operations:

```text
Push → Insert at head
Pop  → Delete from head
Peek → Access head
```

Complexity:

```text
Push → O(1)
Pop  → O(1)
Peek → O(1)
```

---

## 🧰 4. Stack Using Collections Framework

Java provides stack-like functionality through the Collections Framework.

Example using `Deque`:

```java
Deque<Integer> stack = new ArrayDeque<>();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.peek());
System.out.println(stack.pop());
```

`Deque` is generally preferred over the legacy `Stack` class for stack operations.

---

# 🔽 5. Push at Bottom of Stack

The task is to insert an element at the bottom of a stack while maintaining the order of all existing elements.

Example:

```text
Original:

30
20
10

Push 5 at bottom:

30
20
10
5
```

This can be solved using recursion.

### Approach

1. Remove the top element.
2. Recursively insert the new element at the bottom.
3. Push the removed element back.

---

# 🔄 6. Reverse a String Using Stack

A stack can be used to reverse a string because it follows LIFO.

Example:

```text
Input:  HELLO

Push:
H E L L O

Pop:
O L L E H

Output:
OLLEH
```

### Complexity

```text
Time  → O(n)
Space → O(n)
```

---

# 🔃 7. Reverse a Stack

A stack can also be reversed using recursion.

Example:

```text
Original:

30
20
10

Reversed:

10
20
30
```

The solution uses:

* Recursion
* Pop operation
* Push at bottom

---

# 📊 8. Stock Span Problem

The **Stock Span Problem** determines the number of consecutive previous days for which the stock price was less than or equal to the current day's price.

Example:

```text
Prices:
100 80 60 70 60 75 85

Span:
1 1 1 2 1 4 6
```

A stack can be used to solve the problem efficiently.

### Complexity

Naive approach:

```text
O(n²)
```

Using a monotonic stack:

```text
O(n)
```

This demonstrates how stacks can optimize repeated comparisons.

---

# ➡️ 9. Next Greater Element

The **Next Greater Element** problem asks for the first element to the right that is greater than the current element.

Example:

```text
Input:
4 5 2 25

Output:
5 25 25 -1
```

For each element:

```text
4 → 5
5 → 25
2 → 25
25 → -1
```

A stack can solve this efficiently.

### Complexity

```text
Time  → O(n)
Space → O(n)
```

---

# 🔄 10. Valid Parentheses

Given a string containing:

```text
( ) [ ] { }
```

we need to determine whether the brackets are properly matched and nested.

Example:

```text
Input:
{[()]}

Output:
Valid
```

Invalid example:

```text
Input:
{[(])}

Output:
Invalid
```

### Stack Approach

1. Push every opening bracket.
2. When a closing bracket appears:

   * Check whether the stack is empty.
   * Check whether the top matches the closing bracket.
3. Pop the matching opening bracket.
4. At the end, the stack must be empty.

### Complexity

```text
Time  → O(n)
Space → O(n)
```

---

# 🔁 11. Duplicate Parentheses

The problem is to detect unnecessary or duplicate parentheses.

Example:

```text
((a+b))
```

contains duplicate parentheses.

A stack can be used to detect whether a pair of parentheses contains no meaningful expression.

### General Approach

1. Traverse the expression.
2. Push characters onto the stack.
3. When `)` is encountered:

   * Pop until `(` is found.
   * If no operator or operand exists between the parentheses, duplicate parentheses exist.

---

# 📐 12. Maximum Rectangular Area in Histogram

Given an array representing histogram bar heights, find the largest rectangular area possible.

Example:

```text
Heights:

2 1 5 6 2 3
```

The maximum rectangular area is:

```text
10
```

because bars of heights `5` and `6` can form a rectangle:

```text
Height = 5
Width  = 2

Area = 5 × 2 = 10
```

A **monotonic stack** can solve this efficiently.

### Complexity

Brute-force approach:

```text
O(n²)
```

Optimized stack approach:

```text
Time  → O(n)
Space → O(n)
```

---

# 🧠 Important Stack Concepts

### LIFO

```text
Last In → First Out
```

### Stack Example

```text
Push 10
Push 20
Push 30

       30 ← Top
       20
       10
```

`pop()` removes `30`.

---

## 📊 Stack Operation Complexity

| Operation | Complexity |
| --------- | ---------: |
| Push      |       O(1) |
| Pop       |       O(1) |
| Peek      |       O(1) |
| Is Empty  |       O(1) |
| Search    |       O(n) |

---

# 🔥 Important Applications of Stack

Stacks are commonly used in:

* Function calls
* Recursion
* Undo/Redo operations
* Browser history
* Expression evaluation
* Parentheses matching
* Backtracking
* Next Greater Element
* Stock Span
* Histogram problems
* Depth First Search
* String reversal

---

# 💡 Key Learning

The most important concept learned today was that a stack is not only a basic data structure but also a powerful tool for solving problems where we need to:

* Process elements in reverse order
* Keep track of previous elements
* Match opening and closing symbols
* Find previous or next greater/smaller elements
* Optimize nested comparisons

The **monotonic stack** is particularly useful for reducing many `O(n²)` problems to `O(n)`.

---

# 📝 Problems Covered

| Problem                 | Main Concept    |      Complexity |
| ----------------------- | --------------- | --------------: |
| Stack Introduction      | LIFO            | O(1) operations |
| Stack using ArrayList   | ArrayList       |  O(1) amortized |
| Stack using Linked List | Linked List     |            O(1) |
| Stack using Collections | Deque           |            O(1) |
| Push at Bottom          | Recursion       |            O(n) |
| Reverse String          | Stack           |            O(n) |
| Reverse Stack           | Recursion       |            O(n) |
| Stock Span              | Monotonic Stack |            O(n) |
| Next Greater Element    | Monotonic Stack |            O(n) |
| Valid Parentheses       | Stack           |            O(n) |
| Duplicate Parentheses   | Stack           |            O(n) |
| Maximum Histogram Area  | Monotonic Stack |            O(n) |

---

# 🚀 Day 21 Progress

**Day 21 Completed ✅**

### Skills Practiced

* Stack Data Structure
* LIFO
* ArrayList Implementation
* Linked List Implementation
* Java Collections
* `Deque`
* Recursion with Stack
* String Reversal
* Stack Reversal
* Stock Span
* Next Greater Element
* Valid Parentheses
* Duplicate Parentheses
* Monotonic Stack
* Histogram Area

---

## 🔗 Connection With Previous Learning

On **Day 20**, I learned about **Time Complexity and Space Complexity**.

On Day 21, I applied those concepts to Stack-based algorithms and learned how an efficient stack approach can reduce problems from:

```text
O(n²)
```

to:

```text
O(n)
```

This helped strengthen both **Data Structures** and **Algorithm Analysis** skills.



---

## 📌 Final Takeaway

> **"A stack is simple to implement, but its applications are powerful."**

Day 21 strengthened my understanding of stacks and showed how they can be used to solve real algorithmic problems efficiently.

---

**Internnova Java Development Internship — Day 21**

**#Java #DSA #Stack #Algorithms #DataStructures #Internship #Coding #LearningJourney**
