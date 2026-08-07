# 📅  2D Arrays, Strings & StringBuilder

## 📌 Overview

In **Java Development Internship at Internnova**, I learned about **2D Arrays** and **Strings in Java**.

The module covered the creation, input, output, traversal, and memory representation of 2D arrays. I also practiced examples using matrices and nested loops.

Along with 2D arrays, I was introduced to **Strings, String storage, String methods, and StringBuilder**, which are important concepts for handling and manipulating text efficiently in Java.

---

## 🎯 Learning Objectives

- Understand the concept of 2D arrays.
- Learn how to create and initialize 2D arrays.
- Understand how 2D arrays are represented in memory.
- Traverse 2D arrays using nested loops.
- Take input and display output for matrices.
- Solve basic problems using 2D arrays.
- Understand Strings in Java.
- Learn how Strings are stored in memory.
- Understand commonly used String methods.
- Learn the purpose of `StringBuilder`.
- Understand the difference between `String` and `StringBuilder`.
- Perform efficient string manipulation.

---

# 📚 Topics Covered

## 🔹 1. 2D Arrays

- Introduction to 2D Arrays
- Creating 2D Arrays
- Initializing 2D Arrays
- Taking Input in 2D Arrays
- Printing 2D Arrays
- Traversing Rows and Columns
- Updating Elements
- Examples using 2D Arrays

---

## 🔹 2. 2D Arrays in Memory

- Array of arrays concept
- Rows and columns
- Index-based access
- Understanding how Java represents 2D arrays
- Memory references in 2D arrays

Example:

```java
int[][] matrix = new int[3][3];
```

Conceptually:

```text
matrix
  ↓
Row 0 → [ ][ ][ ]
Row 1 → [ ][ ][ ]
Row 2 → [ ][ ][ ]
```

Java's 2D arrays are technically **arrays of arrays**, so each row is a separate array object.

---

# 🔹 3. Examples Using 2D Arrays

2D arrays can be used to represent:

- Matrices
- Tables
- Grids
- Game boards
- Student marks
- Mathematical data

Example:

```text
1  2  3
4  5  6
7  8  9
```

Accessing an element:

```java
matrix[1][2]
```

Output:

```text
6
```

The first index represents the row and the second index represents the column.

---

# 🔹 4. Introduction to Strings

A `String` is a sequence of characters.

Example:

```java
String name = "Divankar";
```

A String can contain:

```text
Letters
Numbers
Spaces
Special Characters
```

Example:

```java
String message = "Hello Java";
```

---

# 🔹 5. String Storage

Strings in Java are objects.

String literals are stored in the **String Pool**, which is part of the heap.

Example:

```java
String s1 = "Java";
String s2 = "Java";
```

Both references can point to the same pooled String object because String literals are reused.

Conceptually:

```text
s1 ─────┐
        ↓
     "Java"
        ↑
s2 ─────┘
```

However:

```java
String s3 = new String("Java");
```

creates a separate String object.

---

# 🔹 6. String Immutability

Strings in Java are **immutable**.

This means once a String object is created, its contents cannot be changed.

Example:

```java
String str = "Hello";

str = str + " Java";
```

The original `"Hello"` String is not modified. A new String is created for the resulting value.

---

# 🔹 7. Common String Functions

### `length()`

Returns the number of characters.

```java
String str = "Java";

System.out.println(str.length());
```

Output:

```text
4
```

---

### `charAt()`

Returns the character at a particular index.

```java
String str = "Java";

System.out.println(str.charAt(1));
```

Output:

```text
a
```

---

### `substring()`

Extracts a portion of a String.

```java
String str = "Programming";

System.out.println(str.substring(0, 4));
```

Output:

```text
Prog
```

---

### `equals()`

Compares the contents of two Strings.

```java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b));
```

Output:

```text
true
```

---

### `equalsIgnoreCase()`

Compares Strings without considering case.

```java
String a = "JAVA";
String b = "java";

System.out.println(a.equalsIgnoreCase(b));
```

Output:

```text
true
```

---

### `compareTo()`

Compares two Strings lexicographically.

```java
String a = "Apple";
String b = "Banana";

System.out.println(a.compareTo(b));
```

---

### `toUpperCase()`

Converts a String to uppercase.

```java
String str = "java";

System.out.println(str.toUpperCase());
```

Output:

```text
JAVA
```

---

### `toLowerCase()`

Converts a String to lowercase.

```java
String str = "JAVA";

System.out.println(str.toLowerCase());
```

Output:

```text
java
```

---

### `contains()`

Checks whether a String contains a particular sequence.

```java
String str = "Hello Java";

System.out.println(str.contains("Java"));
```

Output:

```text
true
```

---

### `indexOf()`

Returns the index of a character or substring.

```java
String str = "Java";

System.out.println(str.indexOf('v'));
```

Output:

```text
2
```

---

### `replace()`

Replaces characters or sequences.

```java
String str = "Java";

System.out.println(str.replace('a', 'o'));
```

Output:

```text
Jovo
```

---

# 🔹 8. StringBuilder

`StringBuilder` is a mutable sequence of characters.

Unlike `String`, its contents can be modified without creating a new String object for every change.

### Creating StringBuilder

```java
StringBuilder sb = new StringBuilder("Hello");
```

---

## `append()`

Adds content to the end.

```java
StringBuilder sb = new StringBuilder("Hello");

sb.append(" Java");

System.out.println(sb);
```

Output:

```text
Hello Java
```

---

## `insert()`

Inserts content at a specific index.

```java
StringBuilder sb = new StringBuilder("Java");

sb.insert(0, "Hello ");

System.out.println(sb);
```

Output:

```text
Hello Java
```

---

## `delete()`

Removes characters from a range.

```java
StringBuilder sb = new StringBuilder("Hello Java");

sb.delete(0, 6);

System.out.println(sb);
```

Output:

```text
Java
```

---

## `reverse()`

Reverses the characters.

```java
StringBuilder sb = new StringBuilder("Java");

sb.reverse();

System.out.println(sb);
```

Output:

```text
avaJ
```

---

## `setCharAt()`

Changes a character at a specific index.

```java
StringBuilder sb = new StringBuilder("Java");

sb.setCharAt(0, 'K');

System.out.println(sb);
```

Output:

```text
Kava
```

---

# 📊 String vs StringBuilder

| Feature | String | StringBuilder |
|---|---|---|
| Mutability | Immutable | Mutable |
| Modification | Creates new String | Modifies existing object |
| Suitable for repeated changes | Less efficient | More efficient |
| Common use | Fixed text | Frequently changing text |
| Example | `"Java"` | `new StringBuilder("Java")` |

---

# 💻 Programs / Examples Practiced

### 2D Arrays

- Create a 2D array
- Initialize a matrix
- Take input in a matrix
- Print a matrix
- Traverse rows and columns
- Access individual elements
- Update matrix elements
- Perform basic matrix operations

### Strings

- Create Strings
- Access characters
- Find String length
- Compare Strings
- Extract substrings
- Convert case
- Search within Strings
- Replace characters

### StringBuilder

- Create a StringBuilder
- Append text
- Insert text
- Delete characters
- Reverse a String
- Modify characters using `setCharAt()`

---

## ⏱️ Basic Complexity

| Operation | Typical Complexity |
|---|---:|
| Access 2D Array Element | O(1) |
| Traverse 2D Array | O(rows × columns) |
| `String.length()` | O(1) |
| `String.charAt()` | O(1) |
| `String.substring()` | Depends on Java operation/version |
| `StringBuilder.append()` | Amortized O(1) |
| `StringBuilder.reverse()` | O(n) |

---

## 🛠 Technologies Used

- Java
- JDK
- Visual Studio Code
- Terminal


---

## 📖 Key Learnings

- A 2D array in Java is an **array of arrays**.
- 2D arrays are commonly used for matrices, grids, and tabular data.
- Elements are accessed using row and column indexes.
- Strings are immutable in Java.
- String literals are stored in the String Pool.
- String methods provide useful operations for text processing.
- `StringBuilder` provides mutable character sequences.
- `StringBuilder` is useful when a String needs to be modified repeatedly.
- Nested loops are commonly used to traverse 2D arrays.

---

## 🚀 Skills Developed

- 2D Array Manipulation
- Matrix Traversal
- Nested Loop Programming
- String Manipulation
- String Methods
- String Pool Concepts
- StringBuilder
- Memory Concepts
- Problem Solving

---

## 📈 Learning Outcome

I developed a stronger understanding of **2D arrays and String handling in Java**.

I learned how to work with matrices using rows and columns, understand their memory representation, and perform common String operations. I also learned how `StringBuilder` can be used for efficient and mutable text manipulation.

---

**👨‍💻 Author:** Divankar Singh  
**🏢 Internship:** Java Development Internship – Internnova  
**📚 Day:** 11  
**📖 Module:** 2D Arrays, Strings & StringBuilder  
**✅ Status:** Completed
