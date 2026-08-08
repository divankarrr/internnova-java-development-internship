# 📅 Day 12 – Strings in Java

## 📌 Overview

On Day 12 of my **Java Development Internship at Internnova**, I focused on **Strings in Java** and practiced different techniques for creating, accessing, comparing, and manipulating strings.

The module covered String input/output, length, concatenation, character access, palindrome checking, shortest path problems, String comparison, substring operations, finding the largest String, String immutability, `StringBuilder`, converting letters to uppercase, and String compression.

These concepts are important for **Java development, problem solving, and coding interviews**.

---

## 🎯 Learning Objectives

- Understand the concept of Strings in Java.
- Take String input from the user.
- Find the length of a String.
- Concatenate Strings.
- Access individual characters using `charAt()`.
- Check whether a String is a palindrome.
- Solve String-based problems.
- Compare Strings correctly using `compareTo()` and `equals()`.
- Extract parts of a String using `substring()`.
- Find the largest String lexicographically.
- Understand why Strings are immutable.
- Learn and use `StringBuilder`.
- Convert lowercase letters to uppercase.
- Implement basic String compression.

---

# 📚 Topics Covered

## 🔹 1. String Input / Output

Strings can be stored using the `String` class.

```java
String name = "Divankar";

System.out.println(name);
```

For user input:

```java
Scanner sc = new Scanner(System.in);

String name = sc.nextLine();

System.out.println(name);
```

---

## 🔹 2. String Length

The `length()` method returns the number of characters in a String.

```java
String str = "Java";

System.out.println(str.length());
```

Output:

```text
4
```

---

## 🔹 3. String Concatenation

Concatenation means joining two or more Strings.

The `+` operator can be used for concatenation.

```java
String firstName = "Divankar";
String lastName = "Singh";

String fullName = firstName + " " + lastName;

System.out.println(fullName);
```

Output:

```text
Divankar Singh
```

---

## 🔹 4. `charAt()` Method

The `charAt()` method returns the character present at a particular index.

```java
String str = "Java";

System.out.println(str.charAt(0));
```

Output:

```text
J
```

### Important

String indexing starts from:

```text
0
```

---

# 🔄 5. Check if a String is Palindrome

A palindrome reads the same from left to right and right to left.

Examples:

```text
madam
racecar
level
```

Example:

```text
Input:
madam

Reverse:
madam

Result:
Palindrome
```

A common approach is to compare characters from both ends.

---

# 📍 6. Shortest Path

The shortest-path problem demonstrates how Strings can represent movement directions.

For example:

```text
N → North
S → South
E → East
W → West
```

Example:

```text
Path = "WNEENESENNN"
```

The final position can be calculated by tracking the movement along the X and Y axes.

Conceptually:

```text
North → y + 1
South → y - 1
East  → x + 1
West  → x - 1
```

The distance from the starting point can then be calculated using the final coordinates.

---

# 🔍 7. String Comparison

Strings should generally be compared using methods such as:

```java
equals()
```

or

```java
compareTo()
```

### `equals()`

Checks whether two Strings contain the same sequence of characters.

```java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b));
```

Output:

```text
true
```

### `compareTo()`

Compares Strings lexicographically.

```java
String a = "Apple";
String b = "Banana";

System.out.println(a.compareTo(b));
```

A negative result means `a` comes before `b` lexicographically.

---

# ✂️ 8. `substring()`

The `substring()` method extracts a portion of a String.

```java
String str = "Programming";

System.out.println(str.substring(0, 4));
```

Output:

```text
Prog
```

General form:

```java
str.substring(startIndex, endIndex);
```

The `endIndex` is exclusive.

---

# 🏆 9. Print Largest String

Strings can be compared lexicographically using:

```java
compareTo()
```

Example:

```text
Apple
Mango
Banana
```

The lexicographically largest String is:

```text
Mango
```

This concept is useful when solving problems involving dictionaries, words, and String ordering.

---

# 🔒 10. Why Strings Are Immutable

Strings in Java are **immutable**.

This means that once a String object is created, its contents cannot be changed.

Example:

```java
String str = "Hello";

str = str + " Java";
```

The original String:

```text
"Hello"
```

is not modified.

A new String object is created for:

```text
"Hello Java"
```

### Advantages of String Immutability

- Security
- String Pool optimization
- Thread safety
- Predictable behavior
- Efficient reuse of String literals

---

# 🧱 11. StringBuilder

`StringBuilder` provides a **mutable sequence of characters**.

It is useful when a String needs to be modified repeatedly.

Example:

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

## Common StringBuilder Methods

### `append()`

```java
sb.append("Java");
```

Adds content to the end.

### `insert()`

```java
sb.insert(0, "Hello ");
```

Inserts content at a specific position.

### `delete()`

```java
sb.delete(0, 2);
```

Deletes characters from a specified range.

### `reverse()`

```java
sb.reverse();
```

Reverses the characters.

### `setCharAt()`

```java
sb.setCharAt(0, 'A');
```

Changes a character at a specific index.

---

# 🔠 12. Convert Letters to Uppercase

Characters can be converted to uppercase using character arithmetic.

For lowercase English letters:

```java
char ch = 'a';

char upper = (char)(ch - 'a' + 'A');
```

Alternatively, Java provides:

```java
Character.toUpperCase(ch);
```

Example:

```java
char ch = 'd';

System.out.println(Character.toUpperCase(ch));
```

Output:

```text
D
```

---

# 🗜️ 13. String Compression

String compression means representing consecutive repeated characters using the character and its frequency.

Example:

```text
Input:
aaabbcccc

Compressed:
a3b2c4
```

The basic approach is:

1. Traverse the String.
2. Count consecutive repeated characters.
3. Append the character.
4. Append its count when required.
5. Continue until the String ends.

`StringBuilder` is useful for constructing the compressed String efficiently.

---

# 📊 String vs StringBuilder

| Feature | String | StringBuilder |
|---|---|---|
| Mutability | Immutable | Mutable |
| Modification | Creates new String | Modifies existing sequence |
| Suitable for repeated modifications | Less suitable | More suitable |
| Common use | Fixed text | Dynamic text |
| Example | `"Java"` | `new StringBuilder("Java")` |

---

# 💻 Problems Practiced

- String Input / Output
- String Length
- String Concatenation
- `charAt()` Method
- Check if a String is Palindrome
- Shortest Path
- String Comparison
- `substring()` Method
- Print Largest String
- Understanding String Immutability
- StringBuilder
- Convert Letters to Uppercase
- String Compression

---

# ⏱️ Complexity

| Operation / Problem | Typical Complexity |
|---|---:|
| `length()` | O(1) |
| `charAt()` | O(1) |
| String Traversal | O(n) |
| Palindrome Check | O(n) |
| Shortest Path | O(n) |
| String Comparison | O(n) |
| Substring | Depends on Java operation/version |
| String Compression | O(n) |
| StringBuilder Reverse | O(n) |

---

# 🛠 Technologies Used

- Java
- JDK
- Visual Studio Code
- Terminal

---

# 📖 Key Learnings

- A String is a sequence of characters.
- Java Strings are immutable.
- String indexes start from `0`.
- `charAt()` is used to access individual characters.
- `length()` returns the number of characters.
- `equals()` compares String contents.
- `compareTo()` performs lexicographical comparison.
- `substring()` extracts a portion of a String.
- `StringBuilder` is useful for mutable String manipulation.
- Strings are commonly used in coding interview problems.
- `StringBuilder` can help avoid unnecessary String creation during repeated modifications.

---

# 🚀 Skills Developed

- String Manipulation
- String Traversal
- Character Handling
- String Comparison
- Palindrome Problems
- StringBuilder
- Lexicographical Ordering
- Problem Solving
- Time Complexity Analysis
- Interview-Oriented Programming

---

# 📈 Learning Outcome

By completing Day 12, I developed a strong foundation in **String manipulation and String-based problem solving in Java**.

I learned how to work with String methods, understand String immutability and storage, solve palindrome and shortest-path problems, compare Strings, and use `StringBuilder` for efficient modifications.

The learning progression was:

```text
String Basics
     ↓
String Functions
     ↓
String Problems
     ↓
String Immutability
     ↓
StringBuilder
     ↓
String Optimization
```

---

**👨‍💻 Author:** Divankar Singh  
**🏢 Internship:** Java Development Internship – Internnova  
**📚 Day:** 12  
**📖 Module:** Strings  
**✅ Status:** Completed
