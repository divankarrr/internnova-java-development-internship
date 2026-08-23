# Day 24 - Hashing

## 📌 Internnova Java Development Internship

**Day:** 24
**Topic:** Hashing
**Language:** Java
**Internship:** Internnova Java Development Internship

---

## 🎯 Objective

The objective of Day 24 was to understand **Hashing in Java** and learn how HashMap, HashSet, LinkedHashMap, TreeMap, LinkedHashSet, and TreeSet can be used to efficiently store, search, and manage data.

---

## 📚 Topics Covered

* HashMap Operations
* Iteration on HashMaps
* HashMap Implementation
* HashMap Implementation Code
* LinkedHashMap
* TreeMap
* HashMap vs LinkedHashMap vs TreeMap
* Majority Element
* Valid Anagram
* HashSet
* Iteration on HashSets
* LinkedHashSet
* TreeSet
* Count Distinct Elements
* Union & Intersection
* Find Itinerary for Tickets
* Largest Subarray with Sum 0
* Subarray Sum Equal to K

---

# 🔑 What is Hashing?

**Hashing** is a technique used to store and retrieve data efficiently using a hash function.

In Java, hashing is commonly implemented through:

```text
HashMap
HashSet
LinkedHashMap
LinkedHashSet
TreeMap
TreeSet
```

Hashing allows many lookup operations to be performed in approximately:

```text
O(1)
```

on average.

---

# 1. HashMap

A `HashMap` stores data in the form of:

```text
Key → Value
```

Example:

```java
HashMap<String, Integer> map = new HashMap<>();

map.put("Java", 90);
map.put("Python", 85);
map.put("SQL", 80);
```

Here:

```text
Java   → 90
Python → 85
SQL    → 80
```

---

# 2. HashMap Operations

Important operations include:

```java
put()
get()
remove()
containsKey()
containsValue()
isEmpty()
size()
clear()
```

Example:

```java
map.put("A", 10);

System.out.println(map.get("A"));

map.remove("A");

System.out.println(map.containsKey("A"));
```

Average complexity of basic HashMap operations:

```text
put()         → O(1)
get()         → O(1)
remove()      → O(1)
containsKey() → O(1)
```

---

# 3. Iteration on HashMap

A HashMap can be iterated using `entrySet()`.

```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " " + entry.getValue());
}
```

We can also iterate through:

```java
map.keySet()
map.values()
map.entrySet()
```

---

# 4. LinkedHashMap

`LinkedHashMap` maintains the **insertion order** of elements.

Example:

```java
LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

map.put(1, "A");
map.put(2, "B");
map.put(3, "C");
```

Iteration maintains:

```text
1 → A
2 → B
3 → C
```

It provides HashMap-like average lookup performance while maintaining insertion order.

---

# 5. TreeMap

`TreeMap` stores keys in **sorted order**.

Example:

```java
TreeMap<Integer, String> map = new TreeMap<>();

map.put(3, "C");
map.put(1, "A");
map.put(2, "B");
```

Output order:

```text
1 → A
2 → B
3 → C
```

Typical complexity:

```text
put()    → O(log n)
get()    → O(log n)
remove() → O(log n)
```

---

# 📊 HashMap vs LinkedHashMap vs TreeMap

| Feature  | HashMap             | LinkedHashMap            | TreeMap               |
| -------- | ------------------- | ------------------------ | --------------------- |
| Order    | No guaranteed order | Insertion order          | Sorted order          |
| get()    | O(1) average        | O(1) average             | O(log n)              |
| put()    | O(1) average        | O(1) average             | O(log n)              |
| Null Key | Allowed             | Allowed                  | Generally not allowed |
| Main Use | Fast lookup         | Maintain insertion order | Sorted keys           |

---

# 6. Majority Element

The **Majority Element** is an element that appears more than:

```text
n / 2
```

times in an array.

Example:

```text
Input:
2 2 1 1 1 2 2

Output:
2
```

A HashMap can store the frequency of every element.

```text
Element → Frequency
```

Then find the element whose frequency is greater than `n/2`.

### Complexity

```text
Time  → O(n)
Space → O(n)
```

---

# 7. Valid Anagram

Two strings are anagrams if they contain the same characters with the same frequencies.

Example:

```text
"listen"
"silent"
```

These are valid anagrams.

A HashMap can store character frequencies.

```text
Character → Frequency
```

### Complexity

```text
Time  → O(n)
Space → O(n)
```

---

# 8. HashSet

A `HashSet` stores **unique elements**.

Example:

```java
HashSet<Integer> set = new HashSet<>();

set.add(10);
set.add(20);
set.add(10);
```

The final set contains:

```text
10
20
```

The duplicate `10` is automatically ignored.

---

# 9. HashSet Operations

Common operations:

```java
add()
remove()
contains()
isEmpty()
size()
clear()
```

Average complexity:

```text
add()      → O(1)
remove()   → O(1)
contains() → O(1)
```

---

# 10. Iteration on HashSet

Example:

```java
for (Integer value : set) {
    System.out.println(value);
}
```

A HashSet does **not guarantee insertion order**.

---

# 11. LinkedHashSet

`LinkedHashSet` stores unique elements while maintaining **insertion order**.

Example:

```java
LinkedHashSet<Integer> set = new LinkedHashSet<>();

set.add(30);
set.add(10);
set.add(20);
```

Iteration order:

```text
30
10
20
```

---

# 12. TreeSet

`TreeSet` stores unique elements in **sorted order**.

Example:

```java
TreeSet<Integer> set = new TreeSet<>();

set.add(30);
set.add(10);
set.add(20);
```

Output:

```text
10
20
30
```

Typical operations:

```text
add()      → O(log n)
remove()   → O(log n)
contains() → O(log n)
```

---

# 📊 HashSet vs LinkedHashSet vs TreeSet

| Feature    | HashSet               | LinkedHashSet            | TreeSet               |
| ---------- | --------------------- | ------------------------ | --------------------- |
| Duplicates | Not allowed           | Not allowed              | Not allowed           |
| Order      | No guaranteed order   | Insertion order          | Sorted order          |
| add()      | O(1) average          | O(1) average             | O(log n)              |
| Main Use   | Fast uniqueness check | Unique + insertion order | Unique + sorted order |

---

# 13. Count Distinct Elements

The number of distinct elements in an array can be found using a HashSet.

Example:

```text
Input:
1 2 2 3 4 4 5
```

Distinct elements:

```text
1 2 3 4 5
```

Count:

```text
5
```

### Complexity

```text
Time  → O(n) average
Space → O(n)
```

---

# 14. Union and Intersection

HashSets can efficiently solve Union and Intersection problems.

### Union

Contains all unique elements from both sets.

```text
A = {1, 2, 3}
B = {2, 3, 4}

Union = {1, 2, 3, 4}
```

### Intersection

Contains elements common to both sets.

```text
A = {1, 2, 3}
B = {2, 3, 4}

Intersection = {2, 3}
```

---

# 15. Find Itinerary for Tickets

Given flight tickets:

```text
From → To
```

we need to reconstruct the complete itinerary.

Example:

```text
Mumbai → Delhi
Delhi → Goa
Goa → Chennai
```

Itinerary:

```text
Mumbai → Delhi → Goa → Chennai
```

A HashMap can store:

```text
Source → Destination
```

The starting point can be found by identifying the source that does not appear as a destination.

---

# 16. Largest Subarray with Sum 0

The goal is to find the longest subarray whose sum is zero.

A HashMap can store:

```text
Prefix Sum → First Index
```

If the same prefix sum occurs again, the elements between those indices have sum `0`.

Example:

```text
Array:
15 -2 2 -8 1 7 10 23
```

The prefix sum technique allows us to find the longest zero-sum subarray efficiently.

### Complexity

```text
Time  → O(n)
Space → O(n)
```

---

# 17. Subarray Sum Equal to K

The goal is to count the number of subarrays whose sum equals `K`.

We maintain:

```text
Prefix Sum → Frequency
```

For the current prefix sum:

```text
currentSum
```

we check whether:

```text
currentSum - K
```

has already appeared.

If it has, a subarray with sum `K` exists.

### Complexity

```text
Time  → O(n)
Space → O(n)
```

---

# 🧠 Important Hashing Concepts

### HashMap

```text
Key → Value
```

Used when we need to associate one value with another.

### HashSet

```text
Unique Values
```

Used when we only care about uniqueness.

### LinkedHashMap

```text
Key → Value + Insertion Order
```

### TreeMap

```text
Key → Value + Sorted Keys
```

### LinkedHashSet

```text
Unique Values + Insertion Order
```

### TreeSet

```text
Unique Values + Sorted Order
```

---

# ⏱️ Complexity Summary

| Data Structure |   Search |   Insert |   Delete | Ordering            |
| -------------- | -------: | -------: | -------: | ------------------- |
| HashMap        |    O(1)* |    O(1)* |    O(1)* | No guaranteed order |
| LinkedHashMap  |    O(1)* |    O(1)* |    O(1)* | Insertion order     |
| TreeMap        | O(log n) | O(log n) | O(log n) | Sorted              |
| HashSet        |    O(1)* |    O(1)* |    O(1)* | No guaranteed order |
| LinkedHashSet  |    O(1)* |    O(1)* |    O(1)* | Insertion order     |
| TreeSet        | O(log n) | O(log n) | O(log n) | Sorted              |

`*` Average-case complexity.

---

# 💡 Key Takeaways

1. Hashing provides efficient average-case lookup.
2. HashMap stores key-value pairs.
3. HashSet stores unique elements.
4. LinkedHashMap and LinkedHashSet maintain insertion order.
5. TreeMap and TreeSet maintain sorted order.
6. Frequency counting is a common application of HashMap.
7. HashSet is useful for removing duplicates.
8. Prefix sums combined with HashMap can solve many subarray problems efficiently.
9. Hashing can reduce many problems from `O(n²)` to `O(n)`.
10. Choosing the correct Map or Set implementation depends on whether we need fast lookup, insertion order, or sorted order.

---

# 🚀 Day 24 Progress

**Day 24 Completed ✅**

### Skills Practiced

* Hashing
* HashMap
* HashSet
* LinkedHashMap
* LinkedHashSet
* TreeMap
* TreeSet
* Frequency Counting
* Prefix Sum
* Majority Element
* Valid Anagram
* Distinct Elements
* Union & Intersection
* Itinerary Reconstruction
* Zero-Sum Subarray
* Subarray Sum Equal to K

---

## 🔗 Connection With Previous Learning

On **Day 23**, I learned **Greedy Algorithms** and how choosing the right strategy can improve algorithm efficiency.

On **Day 24**, I learned how **Hashing** can provide fast data lookup and help optimize problems involving frequencies, duplicates, and subarrays.


---

## 📌 Final Takeaway

> **"Hashing is one of the most powerful techniques for reducing lookup time and building efficient algorithms."**

Day 24 strengthened my understanding of Java Collections and showed how HashMaps and HashSets can be combined with techniques such as **frequency counting and prefix sums** to solve DSA problems efficiently.

---

**Internnova Java Development Internship — Day 24**

**#Java #DSA #Hashing #HashMap #HashSet #Algorithms #DataStructures #Internship #Coding #LearningJourney**
