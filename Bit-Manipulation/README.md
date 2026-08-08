# 📅 Bit Manipulation in Java

## 📌 Overview

On Day 13 of my **Java Development Internship at Internnova**, I learned the fundamentals of **Bit Manipulation** and how binary operations can be used to solve programming problems efficiently.

The module covered the **binary number system, bitwise operators, bit manipulation techniques, bit checking and updating operations, power-of-two checking, counting set bits, and fast exponentiation**.

Bit manipulation is an important DSA concept because many operations can be performed directly at the binary level, often resulting in efficient solutions.

---

## 🎯 Learning Objectives

- Understand the binary number system.
- Learn how computers represent numbers using bits.
- Understand bitwise operators in Java.
- Perform AND, OR, XOR operations.
- Understand 1's complement.
- Perform left and right bit shifts.
- Check whether a number is odd or even using bits.
- Get, set, clear, and update individual bits.
- Clear the last `i` bits.
- Clear a range of bits.
- Check whether a number is a power of 2.
- Count set bits in a number.
- Understand Fast Exponentiation.

---

# 📚 Topics Covered

## 🔹 1. Introduction to Bit Manipulation

A **bit** is the smallest unit of data and can have one of two values:

```text
0
1
```

Computers internally represent integer values using binary representation.

Example:

```text
Decimal: 5

Binary:
0101
```

Bit manipulation involves directly working with these binary bits using bitwise operators.

---

# 🔢 2. Binary Number System

The binary number system uses only:

```text
0 and 1
```

Each position represents a power of 2.

Example:

```text
Binary: 1011

1 × 2³ = 8
0 × 2² = 0
1 × 2¹ = 2
1 × 2⁰ = 1

Total = 11
```

Therefore:

```text
1011₂ = 11₁₀
```

---

# ⚙️ 3. Bitwise Operators

Java provides several bitwise operators.

| Operator | Name | Example |
|---|---|---|
| `&` | Bitwise AND | `a & b` |
| `|` | Bitwise OR | `a | b` |
| `^` | Bitwise XOR | `a ^ b` |
| `~` | Bitwise NOT / Complement | `~a` |
| `<<` | Left Shift | `a << b` |
| `>>` | Right Shift | `a >> b` |

---

# 🔵 4. Binary AND

The AND operation returns `1` only when **both bits are 1**.

```text
A B | A & B
---------
0 0 |   0
0 1 |   0
1 0 |   0
1 1 |   1
```

Example:

```text
5 = 0101
3 = 0011

5 & 3 = 0001

Result = 1
```

---

# 🟢 5. Binary OR

The OR operation returns `1` if **at least one bit is 1**.

```text
A B | A | B
---------
0 0 |   0
0 1 |   1
1 0 |   1
1 1 |   1
```

Example:

```text
5 = 0101
3 = 0011

5 | 3 = 0111

Result = 7
```

---

# 🟣 6. Binary XOR

XOR returns `1` when the two bits are different.

```text
A B | A ^ B
---------
0 0 |   0
0 1 |   1
1 0 |   1
1 1 |   0
```

Example:

```text
5 = 0101
3 = 0011

5 ^ 3 = 0110

Result = 6
```

Important properties:

```text
x ^ x = 0
x ^ 0 = x
```

---

# 🔄 7. Binary 1's Complement

The `~` operator flips every bit.

```text
0 → 1
1 → 0
```

Example:

```text
5 = 0101

~5
```

The exact decimal result depends on Java's fixed-width signed integer representation.

---

# ⬅️ 8. Binary Left Shift

The left-shift operator is:

```java
<<
```

Example:

```java
5 << 1
```

Conceptually:

```text
0101 << 1

1010
```

Result:

```text
10
```

For non-overflowing positive integers, shifting left by one position is equivalent to multiplying by 2.

---

# ➡️ 9. Binary Right Shift

The right-shift operator is:

```java
>>
```

Example:

```java
10 >> 1
```

Conceptually:

```text
1010 >> 1

0101
```

Result:

```text
5
```

For positive integers, shifting right by one position is equivalent to integer division by 2.

---

# ⚡ 10. Check if Odd or Even

The least significant bit can be used to determine whether a number is odd or even.

Use:

```java
n & 1
```

If:

```text
n & 1 = 0
```

the number is even.

If:

```text
n & 1 = 1
```

the number is odd.

Example:

```text
5 = 0101

5 & 1 = 1

Therefore, 5 is odd.
```

---

# 🎯 11. Get the ith Bit

To check the value of the `i`th bit:

```java
bitMask = 1 << i;
```

Then:

```java
n & bitMask
```

If the result is non-zero, the bit is set.

---

# ✅ 12. Set the ith Bit

Setting a bit means changing it to `1`.

Use:

```java
n = n | (1 << i);
```

Example:

```text
Number:
1000

Set bit 1:

1010
```

---

# ❌ 13. Clear the ith Bit

Clearing a bit means changing it to `0`.

Use:

```java
n = n & ~(1 << i);
```

---

# 🔄 14. Update the ith Bit

To update a bit:

1. Clear the bit.
2. Set it to the required value.

Conceptually:

```text
Clear ith bit
       ↓
Set ith bit according to new value
```

This allows an individual bit to be changed without modifying the other bits.

---

# 🧹 15. Clear Last i Bits

To clear the last `i` bits:

```java
n = n & (-1 << i);
```

Example:

```text
Number:
10101111

Clear last 4 bits:

10100000
```

---

# ✂️ 16. Clear Range of Bits

To clear bits from position `i` to `j`, construct a mask that contains:

```text
0 → target range
1 → remaining positions
```

Then use:

```java
n & mask
```

This technique is useful when multiple consecutive bits need to be cleared.

---

# 2️⃣ 17. Check if a Number is a Power of 2

A positive number is a power of 2 if it contains exactly **one set bit** in binary.

Examples:

```text
1  = 0001
2  = 0010
4  = 0100
8  = 1000
16 = 10000
```

Efficient check:

```java
(n & (n - 1)) == 0
```

For positive `n`, this returns true when `n` is a power of 2.

Example:

```text
8     = 1000
8 - 1 = 0111

1000
&
0111
----
0000
```

Therefore:

```text
8 is a power of 2
```

---

# 🔢 18. Count Set Bits in a Number

A **set bit** is a bit whose value is `1`.

Example:

```text
Binary:
101101

Number of set bits = 4
```

A basic approach checks every bit.

An optimized approach repeatedly removes the lowest set bit:

```java
n = n & (n - 1);
```

Each operation removes one set bit.

Therefore, the number of iterations depends on the number of set bits.

---

# 🚀 19. Fast Exponentiation

Fast Exponentiation is an efficient technique for calculating:

```text
xⁿ
```

Instead of multiplying `x` by itself `n` times, the exponent is repeatedly divided by 2.

Example:

```text
x⁸

x⁸ = (x⁴)²
x⁴ = (x²)²
x² = x × x
```

This reduces the time complexity from:

```text
O(n)
```

to:

```text
O(log n)
```

---

# 📊 Complexity Summary

| Technique | Typical Complexity |
|---|---:|
| Check Odd/Even | O(1) |
| Get ith Bit | O(1) |
| Set ith Bit | O(1) |
| Clear ith Bit | O(1) |
| Update ith Bit | O(1) |
| Clear Last i Bits | O(1) |
| Power of 2 Check | O(1) |
| Count Set Bits | O(number of set bits) |
| Fast Exponentiation | O(log n) |

---

# 💻 Problems / Programs Practiced

- Introduction to Bit Manipulation
- Binary Number System
- Bitwise Operators
- Binary AND
- Binary OR
- Binary XOR
- Binary 1's Complement
- Binary Left Shift
- Binary Right Shift
- Check Odd or Even
- Get ith Bit
- Set ith Bit
- Clear ith Bit
- Update ith Bit
- Clear Last i Bits
- Clear Range of Bits
- Check if a Number is Power of 2
- Count Set Bits
- Fast Exponentiation

---

# 🛠 Technologies Used

- Java
- JDK
- Visual Studio Code
- Terminal

---

# 📖 Key Learnings

- Computers represent integer data using binary bits.
- Bitwise operators work directly on the binary representation of integers.
- `&`, `|`, `^`, and `~` are important bitwise operators.
- Shift operators can efficiently move bits left or right.
- `n & 1` can be used to check whether a number is odd or even.
- Individual bits can be retrieved, set, cleared, and updated using masks.
- `n & (n - 1)` is a powerful bit manipulation technique.
- A positive power of 2 has exactly one set bit.
- Fast Exponentiation reduces exponentiation complexity to `O(log n)`.

---

# 🚀 Skills Developed

- Bit Manipulation
- Binary Number System
- Bitwise Operations
- Bit Masking
- Binary Arithmetic
- Algorithm Optimization
- Time Complexity Analysis
- DSA Problem Solving

---

# 📈 Learning Outcome

By completing Day 13, I developed a foundational understanding of **bit manipulation in Java** and learned how binary-level operations can be used to solve problems efficiently.

I practiced working with individual bits, bit masks, shift operations, set-bit counting, power-of-two detection, and fast exponentiation.

The learning progression was:

```text
Binary Numbers
      ↓
Bitwise Operators
      ↓
Bit Manipulation
      ↓
Bit Masking
      ↓
Bit-Based Problems
      ↓
Algorithm Optimization
```

---

**👨‍💻 Author:** Divankar Singh  
**🏢 Internship:** Java Development Internship – Internnova  
**📚 Day:** 13  
**📖 Module:** Bit Manipulation  
**✅ Status:** Completed
