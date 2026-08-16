# Day 21 - Queues

## 📌 Internnova Java Development Internship

**Day:** 21
**Topic:** Queues
**Language:** Java
**Internship:** Internnova Java Development Internship

---

## 🎯 Objective

The objective of Day 21 was to understand the **Queue data structure**, its implementations, and its applications in Data Structures and Algorithms.

The session covered different ways to implement queues, including arrays, linked lists, Java Collections Framework, circular queues, and deques.

I also practiced implementing queues using stacks and solving problems based on queue manipulation.

---

## 📚 Topics Covered

* Introduction to Queues
* Queue using Arrays
* Circular Queue using Arrays
* Queue using Linked List
* Queue using Java Collections Framework
* Queue using Two Stacks
* Stack using Two Queues
* First Non-Repeating Letter
* Interleave Two Halves of a Queue
* Queue Reversal
* Deque / Double Ended Queue
* Deque using Java Collections Framework
* Implement Stack using Deque
* Implement Queue using Deque

---

# 1. Introduction to Queues

A **Queue** is a linear data structure that follows:

> **FIFO — First In, First Out**

The element inserted first is removed first.

### Example

```text
Enqueue: 10
Enqueue: 20
Enqueue: 30

Front                 Rear
  ↓                     ↓
[10] [20] [30]
```

When we perform `dequeue()`:

```text
[20] [30]
```

The element `10` is removed first.

---

# 2. Basic Queue Operations

The main operations of a queue are:

### Enqueue

Adds an element at the rear.

```text
Queue: 10 20
Enqueue(30)

Queue: 10 20 30
```

### Dequeue

Removes an element from the front.

```text
Queue: 10 20 30
Dequeue()

Queue: 20 30
```

### Peek

Returns the front element without removing it.

```text
Queue: 10 20 30

Peek → 10
```

### isEmpty

Checks whether the queue contains any elements.

---

# 3. Queue Using Arrays

A queue can be implemented using an array.

Basic structure:

```java
int[] queue = new int[5];
int front = 0;
int rear = -1;
```

When inserting:

```text
rear++
queue[rear] = value
```

When removing:

```text
front++
```

### Limitation

A simple array-based queue can waste space after multiple dequeue operations because the empty positions at the beginning may not be reused.

This problem is solved using a **Circular Queue**.

---

# 4. Circular Queue Using Arrays

A Circular Queue connects the last position of the array back to the first position.

```text
       ┌─────────────────┐
       ↓                 │
[10] [20] [30] [40] [50]
 ↑                       │
 └───────────────────────┘
```

The circular movement is generally handled using:

```java
(rear + 1) % size
```

and:

```java
(front + 1) % size
```

### Advantages

* Efficient memory utilization
* Reuses empty positions
* Avoids unnecessary shifting of elements

---

# 5. Queue Using Linked List

A Queue can also be implemented using a Linked List.

Usually:

```text
Front → Head
Rear  → Tail
```

Example:

```text
Front                         Rear
  ↓                             ↓
[10] → [20] → [30] → null
```

### Enqueue

Insert at the rear.

### Dequeue

Remove from the front.

### Complexity

```text
Enqueue → O(1)
Dequeue → O(1)
Peek    → O(1)
```

---

# 6. Queue Using Java Collections Framework

Java provides queue implementations through the Collections Framework.

A common approach is using `Queue` with `LinkedList` or `ArrayDeque`.

Example:

```java
Queue<Integer> queue = new LinkedList<>();

queue.add(10);
queue.add(20);
queue.add(30);

System.out.println(queue.peek());

queue.remove();
```

Another preferred implementation is:

```java
Queue<Integer> queue = new ArrayDeque<>();
```

---

# 7. Queue Using Two Stacks

A queue can be implemented using two stacks.

Suppose we have:

```text
Stack 1
Stack 2
```

### Enqueue

Elements can be pushed into Stack 1.

### Dequeue

If Stack 2 is empty:

1. Move all elements from Stack 1 to Stack 2.
2. Pop from Stack 2.

Example:

```text
Stack 1:

30
20
10
```

Transfer to Stack 2:

```text
Stack 2:

10
20
30
```

Now `10` can be removed first, maintaining FIFO behavior.

---

# 8. Stack Using Two Queues

A Stack can also be implemented using two Queues.

The objective is to achieve:

```text
Stack → LIFO
Queue → FIFO
```

By rearranging elements between two queues, we can simulate stack behavior.

This is an example of implementing one data structure using another.

---

# 9. First Non-Repeating Letter

The queue can be used to find the first non-repeating character in a stream of characters.

Example:

```text
Input:
a a b c

Output after processing:
a -1 b b
```

A common approach is:

* Maintain a frequency array/map.
* Store characters in a queue.
* Remove characters from the front while their frequency is greater than one.
* The front of the queue represents the first non-repeating character.

### Complexity

```text
Time  → O(n)
Space → O(n)
```

---

# 10. Interleave Two Halves of a Queue

Given a queue containing two halves:

```text
1 2 3 4 5 6
```

Split it into:

```text
First half:
1 2 3

Second half:
4 5 6
```

Interleave them:

```text
1 4 2 5 3 6
```

### General Approach

1. Find the midpoint.
2. Store the first half separately.
3. Alternately take one element from each half.
4. Add them back to the queue.

---

# 11. Queue Reversal

A queue can be reversed using a stack.

Original queue:

```text
Front
 ↓
10 20 30 40
```

Push all elements into a stack:

```text
40
30
20
10
```

Pop them back into the queue:

```text
40 30 20 10
```

Therefore, the queue is reversed.

### Complexity

```text
Time  → O(n)
Space → O(n)
```

---

# 12. Deque — Double Ended Queue

A **Deque** stands for:

> **Double Ended Queue**

It allows insertion and deletion from both ends.

```text
Front                         Rear
  ↓                             ↓
[10] [20] [30] [40]
  ↑                             ↑
Remove/Add                  Remove/Add
```

Operations can be performed from:

* Front
* Rear

---

# 13. Deque Operations

Common operations include:

```text
addFirst()
addLast()

removeFirst()
removeLast()

peekFirst()
peekLast()
```

Example:

```java
Deque<Integer> deque = new ArrayDeque<>();

deque.addFirst(10);
deque.addLast(20);

System.out.println(deque.peekFirst());
System.out.println(deque.peekLast());
```

---

# 14. Deque Using Java Collections Framework

Java provides `Deque` through the Collections Framework.

Recommended implementation:

```java
Deque<Integer> deque = new ArrayDeque<>();
```

Example:

```java
deque.addFirst(10);
deque.addLast(20);

deque.removeFirst();
deque.removeLast();
```

### Complexity

Most basic insertion, deletion, and peek operations are:

```text
O(1)
```

---

# 15. Implement Stack Using Deque

A Deque can easily behave like a Stack.

Since a Stack follows LIFO, we can use one end of the Deque.

Example:

```java
Deque<Integer> stack = new ArrayDeque<>();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.pop());
```

Output:

```text
30
```

The last inserted element is removed first.

Therefore:

```text
Deque → Stack
```

---

# 16. Implement Queue Using Deque

A Deque can also behave like a Queue.

Use:

```text
addLast() → Enqueue
removeFirst() → Dequeue
```

Example:

```java
Deque<Integer> queue = new ArrayDeque<>();

queue.addLast(10);
queue.addLast(20);
queue.addLast(30);

System.out.println(queue.removeFirst());
```

Output:

```text
10
```

This follows FIFO behavior.

---

# 📊 Queue vs Stack

| Feature           | Stack           | Queue           |
| ----------------- | --------------- | --------------- |
| Principle         | LIFO            | FIFO            |
| Insertion         | Top             | Rear            |
| Deletion          | Top             | Front           |
| Main operation    | Push            | Enqueue         |
| Removal operation | Pop             | Dequeue         |
| Common use        | Recursion, Undo | Scheduling, BFS |

---

# 📊 Queue Implementations

| Implementation |        Enqueue | Dequeue | Space |
| -------------- | -------------: | ------: | ----: |
| Array          |           O(1) |   O(1)* |  O(n) |
| Circular Array |           O(1) |    O(1) |  O(n) |
| Linked List    |           O(1) |    O(1) |  O(n) |
| ArrayDeque     | O(1) amortized |    O(1) |  O(n) |

`*` assuming appropriate front/rear management.

---

# 🔥 Important Applications of Queues

Queues are commonly used in:

* CPU scheduling
* Printer scheduling
* Network data buffering
* Breadth First Search (BFS)
* Task scheduling
* Customer service systems
* Message queues
* Streaming systems
* Producer-consumer problems

---

# 🧠 Important Concepts Learned

### FIFO

```text
First In → First Out
```

### LIFO

```text
Last In → First Out
```

### Queue

```text
Insert → Rear
Remove → Front
```

### Deque

```text
Insert → Both ends
Remove → Both ends
```

---

# ⏱️ Complexity Analysis

The concepts from **Day 20 — Time and Space Complexity** were applied to queue operations.

For a properly implemented queue:

```text
Enqueue → O(1)
Dequeue → O(1)
Peek    → O(1)
```

Circular queues and linked-list queues can maintain constant-time basic operations.

---

# 💡 Key Takeaways

1. Queue follows the FIFO principle.
2. Elements are inserted from the rear.
3. Elements are removed from the front.
4. Circular queues improve array-space utilization.
5. Linked Lists can efficiently implement queues.
6. Java provides Queue and Deque interfaces.
7. `ArrayDeque` is useful for both stack and queue behavior.
8. A queue can be implemented using two stacks.
9. A stack can be implemented using two queues.
10. Queues are important in BFS and scheduling problems.
11. A Deque allows operations from both ends.
12. Queue-based algorithms can often be optimized to `O(n)`.

---


# 🚀 Day 21 Progress

**Day 21 Completed ✅**

### Skills Practiced

* Queue Data Structure
* FIFO
* Array Implementation
* Circular Queue
* Linked List Implementation
* Java Collections Framework
* Queue Using Two Stacks
* Stack Using Two Queues
* Queue Reversal
* First Non-Repeating Character
* Queue Interleaving
* Deque
* Stack Using Deque
* Queue Using Deque
* Complexity Analysis

---

## 🔗 Connection With Previous Learning

On **Day 20**, I learned how to analyze the **Time and Space Complexity** of algorithms.

On Day 21, I applied those concepts to Queue and Deque implementations and learned how choosing the right data structure can make operations efficient.

---

## 📌 Final Takeaway

> **"Choosing the right data structure is an important part of designing an efficient algorithm."**

Day 21 strengthened my understanding of Queues, Circular Queues, Deques, and their practical applications in Data Structures and Algorithms.

---

**Internnova Java Development Internship — Day 21**

**#Java #DSA #Queue #Deque #DataStructures #Algorithms #Internship #LearningJourney**
