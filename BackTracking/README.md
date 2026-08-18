# Day 22 - Backtracking

## 📌 Internnova Java Development Internship

**Day:** 22
**Topic:** Backtracking
**Language:** Java
**Internship:** Internnova Java Development Internship

---

## 🎯 Objective

The objective of Day 22 was to understand the **Backtracking technique** and learn how it can be used to solve problems by exploring different possibilities and undoing choices when a solution cannot be formed.

The session focused on:

* Introduction to Backtracking
* Types of Backtracking
* Backtracking on Arrays
* Finding Subsets
* Finding Permutations
* N-Queens Problem
* Counting N-Queens Solutions
* Printing N-Queens Solutions
* Grid Ways
* Grid Ways Optimization
* Sudoku Solver

---

# 📚 What is Backtracking?

**Backtracking** is an algorithmic technique used to solve problems by building a solution step by step.

If the current choice cannot lead to a valid solution, we **undo the choice** and try another possibility.

The basic idea is:

```text
Choose
  ↓
Explore
  ↓
Valid?
 /   \
Yes   No
 ↓     ↓
Continue  Undo
          ↓
       Try another choice
```

A simple way to remember Backtracking:

> **Choose → Explore → Unchoose**

---

# 1. Introduction to Backtracking

Backtracking is commonly used for problems where we need to explore multiple possible solutions.

Examples include:

* Subsets
* Permutations
* N-Queens
* Sudoku
* Maze problems
* Grid paths
* Combination problems

Backtracking generally uses **recursion** to explore the solution space.

---

# 2. General Backtracking Template

A typical backtracking function looks like:

```java
static void backtrack(int index) {

    if (baseCondition) {
        // Process solution
        return;
    }

    for (each possible choice) {

        // Choose
        makeChoice();

        // Explore
        backtrack(index + 1);

        // Undo
        undoChoice();
    }
}
```

The most important step is the **undo operation**.

Without undoing the previous choice, the next recursive branch may start with an incorrect state.

---

# 3. Types of Backtracking

Backtracking problems can be categorized based on what we are trying to generate or solve.

### Common Types

1. **Decision Problems**

   * Determine whether a solution exists.

2. **Optimization Problems**

   * Find the best possible solution.

3. **Enumeration Problems**

   * Generate all possible solutions.

Examples:

```text
Subsets       → Enumeration
Permutations  → Enumeration
N-Queens      → Enumeration / Decision
Sudoku        → Decision
```

---

# 4. Backtracking on Arrays

Backtracking can be applied to arrays when we need to explore different combinations of elements.

For every element, we may have choices such as:

```text
Include the element
        OR
Exclude the element
```

This creates a decision tree.

Example:

```text
Array = [1, 2]

                    []
                  /    \
               [1]      []
              /  \      / \
          [1,2] [1]   [2]  []
```

The generated subsets are:

```text
[]
[1]
[2]
[1,2]
```

---

# 5. Find Subsets

A **subset** is a collection of elements selected from an array while maintaining their relative order.

For:

```text
Input:
[1, 2, 3]
```

The subsets are:

```text
[]
[1]
[2]
[3]
[1,2]
[1,3]
[2,3]
[1,2,3]
```

Total number of subsets:

```text
2ⁿ
```

because every element has two choices:

```text
Include
Exclude
```

---

# 6. Subset Backtracking Approach

For every element:

```text
                    []
                  /    \
              Include  Exclude
```

For example:

```text
                  []
                /    \
              [1]     []
             /  \     / \
          [1,2] [1] [2] []
```

### General Algorithm

1. Start with an empty subset.
2. Choose the current element.
3. Add it to the subset.
4. Recursively process the next element.
5. Remove the element.
6. Explore the branch where the element is not selected.

---

# 7. Complexity of Subsets

For `n` elements, there are:

```text
2ⁿ
```

possible subsets.

Therefore:

```text
Time Complexity = O(n × 2ⁿ)
```

The additional `n` factor can occur when copying/processing each generated subset.

Space complexity depends on how results are stored, but the recursion depth is:

```text
O(n)
```

---

# 8. Find Permutations

A **permutation** is an arrangement of elements in different possible orders.

For:

```text
[1, 2, 3]
```

Permutations are:

```text
123
132
213
231
312
321
```

Number of permutations:

```text
n!
```

---

# 9. Permutation Backtracking

At every level, choose one unused element.

Example:

```text
                 []
          /       |       \
        [1]      [2]      [3]
       /  \      /  \      /  \
    [1,2] [1,3] ...
```

When an element is selected:

```text
used[element] = true
```

After returning from recursion:

```text
used[element] = false
```

This is the **backtracking step**.

---

# 10. Complexity of Permutations

There are:

```text
n!
```

permutations.

If each permutation takes `O(n)` time to construct:

```text
Time Complexity = O(n × n!)
```

Auxiliary recursion/visited space:

```text
O(n)
```

excluding the space required to store all output permutations.

---

# 11. N-Queens Problem

The **N-Queens problem** asks us to place `N` queens on an `N × N` chessboard such that no two queens attack each other.

A queen can attack another queen if they are in the same:

* Row
* Column
* Diagonal

---

# 12. N-Queens Example

For `N = 4`, one valid arrangement is:

```text
. Q . .
. . . Q
Q . . .
. . Q .
```

Here:

```text
Q = Queen
. = Empty Cell
```

No two queens share the same row, column, or diagonal.

---

# 13. N-Queens Backtracking Approach

We generally place one queen in each row.

For every row:

1. Try every column.
2. Check whether placing a queen is safe.
3. If safe, place the queen.
4. Recursively move to the next row.
5. If no solution is possible, remove the queen.
6. Try the next column.

General structure:

```text
Place Queen
     ↓
Check Safe
     ↓
Recursive Call
     ↓
Solution?
   /    \
 Yes     No
         ↓
      Remove Queen
         ↓
      Try Again
```

---

# 14. Checking a Safe Position

A position is safe if:

### Same Column

No queen exists in the same column.

### Upper-Left Diagonal

No queen exists diagonally upward to the left.

### Upper-Right Diagonal

No queen exists diagonally upward to the right.

Since queens are placed row by row, we only need to check previously placed rows.

---

# 15. N-Queens Time Complexity

The N-Queens problem has a large search space.

A commonly used upper-bound estimate for the straightforward backtracking approach is approximately:

```text
O(N!)
```

The exact runtime depends heavily on pruning and implementation.

This demonstrates why **pruning invalid choices early** is important.

---

# 16. N-Queens - Count Ways

Instead of printing every valid board, we can count the number of valid solutions.

For example:

```text
N = 4

Number of solutions = 2
```

The backtracking algorithm explores the solution space and increments a counter whenever all `N` queens are successfully placed.

---

# 17. N-Queens - Print One Solution

Sometimes we only need **one valid solution**.

Once a valid arrangement is found:

```text
return true;
```

This stops further unnecessary exploration.

This can significantly reduce work compared with generating every possible solution.

---

# 18. Grid Ways

The Grid Ways problem asks us to find the number of ways to travel from one cell to another.

Suppose movement is allowed only:

```text
Right
Down
```

Example:

```text
Start → → →
       ↓   ↓
       → → ↓
           End
```

At every cell, there are generally two choices:

```text
Move Right
Move Down
```

This naturally forms a recursive decision tree.

---

# 19. Grid Ways Recursion

A recursive solution can be represented as:

```text
gridWays(row, col)
```

From the current cell:

```text
gridWays(row + 1, col)
```

or:

```text
gridWays(row, col + 1)
```

Base cases:

```text
Reached destination → 1
Outside grid → 0
```

---

# 20. Grid Ways Complexity

A naive recursive Grid Ways solution may repeatedly calculate the same states.

Therefore, it can have exponential complexity.

With Dynamic Programming or memoization, the complexity can be reduced significantly.

For an `n × m` grid:

```text
Time = O(n × m)
Space = O(n × m)
```

when using a standard DP table.

---

# 21. Grid Ways Trick

For a grid where only right and down movements are allowed, the number of paths can also be calculated mathematically.

If there are:

```text
n rows
m columns
```

the number of moves required is fixed.

The number of paths can be represented using combinations:

```text
C(n + m - 2, n - 1)
```

This avoids exploring every possible path individually.

It is an example of replacing recursion with a mathematical solution.

---

# 22. Sudoku

Sudoku is a constraint-satisfaction problem that can be solved using Backtracking.

A standard Sudoku board is:

```text
9 × 9
```

The goal is to fill every empty cell with digits:

```text
1 to 9
```

subject to the rules.

---

# 23. Sudoku Rules

Every digit from `1` to `9` must appear at most once in:

### Row

No duplicate number in a row.

### Column

No duplicate number in a column.

### 3 × 3 Subgrid

No duplicate number inside the corresponding `3 × 3` box.

---

# 24. Sudoku Backtracking Approach

For every empty cell:

1. Try numbers from `1` to `9`.
2. Check whether the number is valid.
3. Place the number.
4. Recursively solve the remaining board.
5. If the board cannot be solved:

   * Remove the number.
   * Try another number.

General idea:

```text
Find Empty Cell
      ↓
Try 1...9
      ↓
Is Valid?
   /     \
 No      Yes
 ↓        ↓
Try next  Place number
             ↓
        Solve recursively
             ↓
          Success?
          /     \
        Yes      No
         ↓        ↓
       Done     Undo
```

---

# 25. Backtracking and Pruning

**Pruning** means stopping a branch as soon as we know that it cannot produce a valid solution.

Example in N-Queens:

If two queens already attack each other, there is no reason to explore that branch further.

Similarly, in Sudoku:

If placing a number violates a row, column, or box constraint, immediately reject that choice.

Pruning makes backtracking much more efficient.

---

# 📊 Problem Complexity Summary

| Problem           | Main Idea             |                    Approx. Complexity |
| ----------------- | --------------------- | ------------------------------------: |
| Subsets           | Include / Exclude     |                             O(n × 2ⁿ) |
| Permutations      | Choose unused element |                             O(n × n!) |
| N-Queens          | Place queens safely   | Approximately O(n!) upper-bound style |
| Grid Ways         | Right / Down choices  |                Exponential without DP |
| Grid Ways with DP | Store repeated states |                              O(n × m) |
| Sudoku            | Try valid digits      |                Exponential worst case |

---

# 🧠 Important Backtracking Pattern

Remember this pattern:

```text
function backtrack(state):

    if solution:
        process solution
        return

    for each choice:

        if choice is valid:

            choose

            backtrack(new state)

            undo choice
```

The three most important steps are:

```text
1. Choose
2. Explore
3. Undo
```

---

# 🔥 Backtracking vs Brute Force

Backtracking is related to brute force, but it improves the search by rejecting invalid possibilities as early as possible.

### Brute Force

```text
Generate everything
↓
Check solutions afterward
```

### Backtracking

```text
Choose
↓
Check validity
↓
Reject invalid branch immediately
↓
Continue
```

Therefore, backtracking can greatly reduce unnecessary exploration.

---

# 📌 Key Takeaways

1. Backtracking explores possible solutions recursively.
2. The basic pattern is **Choose → Explore → Undo**.
3. Backtracking is useful for combinatorial problems.
4. Subsets have `2ⁿ` possibilities.
5. Permutations have `n!` possibilities.
6. N-Queens requires checking columns and diagonals.
7. Grid problems can often be represented as recursive choices.
8. Sudoku is a classic constraint-based backtracking problem.
9. Pruning invalid choices improves performance.
10. Memoization/DP can optimize repeated subproblems.
11. Backtracking often uses recursion and therefore uses call-stack space.
12. Complexity analysis is important because backtracking can have exponential search spaces.

---

# 💻 Skills Practiced

During Day 22, I practiced:

* Recursion
* Backtracking
* Arrays
* Subsets
* Permutations
* N-Queens
* Grid Problems
* Sudoku
* Constraint Checking
* Pruning
* Decision Trees
* Complexity Analysis
* Recursive Problem Solving

---

# 🚀 Day 22 Progress

**Day 22 Completed ✅**

### Topics Completed

* ✅ Introduction to Backtracking
* ✅ Types of Backtracking
* ✅ Backtracking on Arrays
* ✅ Find Subsets
* ✅ Find Permutations
* ✅ N-Queens
* ✅ N-Queens Time Complexity
* ✅ N-Queens Count Ways
* ✅ N-Queens Print One Solution
* ✅ Grid Ways
* ✅ Grid Ways Code
* ✅ Grid Ways Trick
* ✅ Sudoku
* ✅ Sudoku Code

---

## 🔗 Connection With Previous Learning

On **Day 20**, I learned about Time and Space Complexity.

On **Day 21**, I worked with Queue and Deque data structures.

On **Day 22**, I applied recursion and complexity analysis to **Backtracking problems**.

This progression helped me understand how recursion can be combined with systematic decision-making to solve complex problems.

---

## 📌 Final Takeaway

> **"Backtracking is the art of exploring every possibility while intelligently abandoning the paths that cannot lead to a solution."**

Day 22 strengthened my understanding of recursion, decision trees, pruning, and combinatorial problem solving.

---

**Internnova Java Development Internship — Day 22**

**#Java #DSA #Backtracking #Recursion #Algorithms #NQueens #Sudoku #Internship #Coding #LearningJourney**
