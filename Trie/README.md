# Day 28 - Tries

## 📌 Internship
**Internnova Java Development Internship**

## 🎯 Objective

The objective of Day 28 is to understand the **Trie Data Structure** and learn how to efficiently perform insertion, searching, prefix-based operations, and solve string-related problems.

## 📚 Topics Covered

- Introduction to Tries
- What is a Trie?
- Creating a Trie
- Insertion
- Searching
- Word Break Problem
- Prefix Problem
- `startsWith` Problem
- Unique Substrings
- Longest Word with All Prefixes

## 🌳 What is a Trie?

A **Trie** is a tree-based data structure mainly used to store and search strings efficiently.

It is also known as a **Prefix Tree** because words with common prefixes share the same path.

### Example

Words:

`apple`, `app`, `ape`

can share the common prefix `ap`.

```text
        root
          |
          a
          |
          p
         / \
        p   e
        |
        l
        |
        e
````

## 🔹 Creating a Trie

A Trie node generally contains:

* An array of child nodes
* A boolean `endOfWord` to indicate whether a complete word ends at that node

For lowercase English letters, each node can have up to **26 children**.

```text
children[26]
endOfWord
```

## ➕ Insertion

To insert a word into a Trie:

1. Start from the root.
2. Take each character of the word.
3. Check whether the character's child already exists.
4. If it does not exist, create a new node.
5. Move to the next node.
6. After the last character, mark `endOfWord = true`.

### Time Complexity

`O(L)`

where `L` is the length of the word.

## 🔍 Searching

To search for a word:

1. Start from the root.
2. Traverse the Trie character by character.
3. If any character is missing, the word does not exist.
4. After processing all characters, check `endOfWord`.

### Time Complexity

`O(L)`

## 🧩 Word Break Problem

The **Word Break Problem** checks whether a given string can be divided into valid words from a dictionary.

### Example

Dictionary:

`i`, `like`, `sam`, `sung`

String:

`ilikesamsung`

The string can be divided into valid dictionary words.

### Key Idea

A Trie can be used to efficiently search for valid prefixes while solving the problem.

## 🔤 Prefix Problem

A Trie is very useful for prefix-based problems.

For example, if the Trie contains:

* `apple`
* `app`
* `application`
* `ape`

We can efficiently find words beginning with a particular prefix such as:

`app`

The common prefix is represented by the shared path in the Trie.

## 🔎 startsWith Problem

The `startsWith` operation checks whether any word in the Trie begins with a given prefix.

### Example

Words:

`apple`, `application`, `app`

Search:

`startsWith("app")`

Result:

`true`

### Time Complexity

`O(L)`

where `L` is the length of the prefix.

## 🔢 Unique Substrings

Tries can also be used to find the number of **unique substrings** of a string.

### Approach

1. Consider every suffix of the string.
2. Insert each suffix into a Trie.
3. Count the newly created Trie nodes.
4. The number of unique substrings can be determined from the Trie nodes.

This demonstrates how Tries can be applied to advanced string problems.

## 🏆 Longest Word with All Prefixes

The goal is to find the longest word such that **every prefix of the word is also present in the Trie**.

### Example

Words:

`a`

`ap`

`app`

`appl`

`apple`

Since every prefix exists, `apple` is a valid answer.

### Key Idea

While traversing the Trie:

* Every intermediate node must represent a complete word.
* Continue only when `endOfWord == true`.
* Track the longest valid word.

## 🧠 Key Concepts Learned

* Trie is a tree-based string data structure.
* Trie is also called a Prefix Tree.
* Words with common prefixes share nodes.
* Insertion takes `O(L)` time.
* Searching takes `O(L)` time.
* Prefix searching is efficient using Tries.
* `startsWith` can be implemented efficiently.
* Tries can solve Word Break and prefix-related problems.
* Tries can be used to find unique substrings.
* Tries can help find the longest word with all prefixes.

## ⏱️ Complexity Summary

| Operation     | Time Complexity |
| ------------- | --------------- |
| Insert        | `O(L)`          |
| Search        | `O(L)`          |
| startsWith    | `O(L)`          |
| Prefix Search | `O(L)`          |

`L` = length of the word or prefix.

## 💻 Java Concepts Used

* Classes and Objects
* Arrays
* Strings
* Recursion
* Tree Data Structures
* Character Traversal
* Trie Nodes
* Boolean Flags
* Prefix Searching

## 📁 Repository Structure

```
Day-28-Trie/
├── README.md
└── src/
    ├── Trie.java
    ├── WordBreak.java
    ├── PrefixProblem.java
    ├── StartsWith.java
    ├── UniqueSubstrings.java
    └── LongestWord.java
```

## 📈 Day 28 Progress

* [x] Learned Trie Data Structure
* [x] Understood Prefix Trees
* [x] Created Trie Nodes
* [x] Implemented Insertion
* [x] Implemented Searching
* [x] Practiced Word Break Problem
* [x] Practiced Prefix Problem
* [x] Implemented `startsWith`
* [x] Studied Unique Substrings
* [x] Practiced Longest Word with All Prefixes

## 🔗 Connection with Previous Topics

Day 28 focuses on **Tries**, which are specialized tree-based data structures for handling strings and prefixes efficiently.

**Day 27:** AVL Trees
**Day 28:** Tries

Both are tree-based data structures, but Tries are specifically optimized for **string and prefix-based operations**.

## 🚀 Key Takeaway

Tries are powerful data structures for storing and searching strings efficiently. They are especially useful for **prefix matching, autocomplete, dictionary searching, Word Break, unique substring problems, and other string-based DSA problems**.

## 🏷️ Tags

#Java #DSA #Trie #TrieDataStructure #DataStructures #Algorithms #Strings #PrefixTree #Internnova #JavaDevelopment #Day28

```
```
