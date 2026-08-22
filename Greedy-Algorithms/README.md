# Day 23 - Greedy Algorithms

## 📌 Internnova Java Development Internship

**Day:** 23
**Topic:** Greedy Algorithms
**Language:** Java
**Internship:** Internnova Java Development Internship

---

## 🎯 Objective

The objective of Day 23 was to understand the **Greedy Algorithm** technique and learn how to make locally optimal choices to solve optimization problems efficiently.

---

## 📚 Topics Covered

* Introduction to Greedy Algorithms
* Activity Selection Problem
* Fractional Knapsack
* Minimum Sum Absolute Difference Pairs
* Maximum Length Chain of Pairs
* Indian Coins
* Job Sequencing Problem
* Chocola Problem

---

## 🧠 What is a Greedy Algorithm?

A **Greedy Algorithm** makes the best possible choice at the current step with the hope of obtaining the optimal overall solution.

The general approach is:

```text
Choose the best option
        ↓
Make the choice
        ↓
Move to the next step
        ↓
Repeat
```

Unlike Backtracking, once a greedy choice is made, it is generally **not undone**.

---

# 1. Activity Selection Problem

The goal is to select the maximum number of activities that can be performed without overlapping.

Each activity has:

* Start time
* End time

The greedy strategy is to select the activity that **finishes earliest**.

### Complexity

```text
Sorting  → O(n log n)
Selection → O(n)

Overall → O(n log n)
```

---

# 2. Fractional Knapsack

In Fractional Knapsack, we can take a fraction of an item.

The greedy strategy is to select items based on the highest:

```text
Value / Weight
```

ratio.

Unlike 0/1 Knapsack, items can be divided.

### Complexity

```text
O(n log n)
```

because items are sorted based on their value-to-weight ratio.

---

# 3. Minimum Sum Absolute Difference Pairs

Given two arrays, the objective is to pair elements such that the sum of absolute differences is minimized.

Greedy approach:

1. Sort both arrays.
2. Pair corresponding elements.
3. Calculate the absolute differences.

```text
|A[i] - B[i]|
```

Sorting allows similar values to be paired together.

---

# 4. Maximum Length Chain of Pairs

Given pairs `(a, b)`, we need to find the longest chain where:

```text
(a, b) → (c, d)
```

is valid when:

```text
b < c
```

The greedy approach is to select the pair with the **smallest ending value**.

This is similar to the Activity Selection Problem.

---

# 5. Indian Coins

The goal is to find the minimum number of Indian currency coins/notes required to make a given amount.

A greedy approach selects the **largest denomination possible** at every step.

Example denominations:

```text
2000
500
200
100
50
20
10
5
2
1
```

For a suitable amount, repeatedly choose the largest denomination that does not exceed the remaining amount.

---

# 6. Job Sequencing Problem

Each job has:

* Deadline
* Profit

The objective is to schedule jobs to maximize total profit while completing them before their deadlines.

Greedy strategy:

1. Sort jobs by decreasing profit.
2. Schedule each job in the latest available slot before its deadline.

This helps maximize the total profit.

---

# 7. Chocola Problem

The Chocola Problem involves dividing a chocolate bar into smaller pieces while minimizing the total cutting cost.

There are:

* Horizontal cutting costs
* Vertical cutting costs

The greedy strategy is to perform the **most expensive cut first**.

Why?

Because every subsequent cut may be applied across more pieces, increasing its contribution to the total cost.

Therefore, sorting cutting costs in descending order helps obtain the minimum total cost.

---

# 📊 Greedy Problems Summary

| Problem                 | Greedy Choice               |
| ----------------------- | --------------------------- |
| Activity Selection      | Earliest finishing activity |
| Fractional Knapsack     | Highest value/weight ratio  |
| Min Absolute Difference | Pair sorted elements        |
| Maximum Chain           | Smallest ending value       |
| Indian Coins            | Largest denomination        |
| Job Sequencing          | Highest profit              |
| Chocola                 | Highest cutting cost first  |

---

# 💡 Key Takeaways

1. Greedy algorithms make the best local choice at each step.
2. A greedy solution does not normally reconsider previous choices.
3. Sorting is commonly used before applying a greedy strategy.
4. Activity Selection chooses the earliest finishing activity.
5. Fractional Knapsack uses the value/weight ratio.
6. Job Sequencing prioritizes higher-profit jobs.
7. Chocola Problem processes higher cutting costs first.
8. Greedy algorithms can provide efficient solutions when the problem has the **greedy-choice property**.

---

# 🚀 Day 23 Progress

**Day 23 Completed ✅**

### Skills Practiced

* Greedy Algorithms
* Sorting
* Activity Selection
* Fractional Knapsack
* Pairing Problems
* Job Scheduling
* Optimization Problems
* Indian Coin Change
* Chocola Problem

---

## 🔗 Connection With Previous Learning

On **Day 22**, I learned **Backtracking**, where choices can be explored and undone.

On **Day 23**, I learned **Greedy Algorithms**, where we make the best local choice and continue without backtracking.

This helped me understand two different approaches for solving optimization and decision-making problems.



---

## 📌 Final Takeaway

> **"Make the best choice available now, when the problem guarantees that local choices can lead to a global optimum."**

Day 23 strengthened my understanding of **Greedy Algorithms** and their applications in real-world optimization problems.

---

**Internnova Java Development Internship — Day 23**

**#Java #DSA #GreedyAlgorithms #Algorithms #DataStructures #Internship #Coding #LearningJourney**
